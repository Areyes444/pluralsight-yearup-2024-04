package com.pluralsight.services;


import com.pluralsight.models.Category;
import com.pluralsight.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCategoryDao implements CategoriesDao
{
    private DataSource dataSource;

    @Autowired
    public JdbcCategoryDao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> getAll()
    {
        List<Category> categories = new ArrayList<>();

        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    select CategoryId
                    , CategoryName
                    from categories;
                    """;

            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);

            while (row.next())
            {
                int categoryId = row.getInt("CategoryId");
                String categoryName = row.getString("CategoryName");

                categories.add(new Category(categoryId, categoryName));


            }
        }
        catch (SQLException e)
        {

        }
        return categories;
    }

    @Override
    public Category getById(int id)
    {
        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    select CategoryId
                    , CategoryName
                    from categories
                    where CategoryID = ?;
                    """;

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);

            ResultSet row = statement.executeQuery();

            if(row.next())
            {
                int categoryId = row.getInt("CategoryId");
                String categoryName = row.getString("CategoryName");


                return new Category(categoryId,categoryName);
            }
        }
        catch (SQLException e)
        {
        }
        return null;
    }

    @Override
    public Category insert(Category category)
    {
        int newId = 0;
        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    insert into categories(CategoryName)
                    values (?,?);
                    """;

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, category.getCategoryName());

            statement.executeUpdate();
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next())
            {
                newId = keys.getInt("CategoryId");
            }
        }
        catch (SQLException e)
        {
        }
        return getById(newId);
    }

}
