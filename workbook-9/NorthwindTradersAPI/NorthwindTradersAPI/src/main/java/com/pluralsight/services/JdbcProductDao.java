package com.pluralsight.services;


import com.pluralsight.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDao implements ProductsDao
{
    private DataSource dataSource;

    @Autowired
    public JdbcProductDao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll()
    {
        List<Product> products = new ArrayList<>();

        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    select ProductId
                    , ProductName
                    , UnitPrice
                    from products;
                    """;

            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);

            while (row.next())
            {
                int productId = row.getInt("ProductId");
                String productName = row.getString("ProductName");
                double unitPrice = row.getDouble("UnitPrice");

                products.add(new Product(productId,productName,unitPrice));

            }
        }
        catch (SQLException e)
        {

        }
        return products;
    }

    @Override
    public Product getById(int id)
    {
        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    select ProductId
                    , ProductName
                    , UnitPrice
                    from products
                    where ProductId = ?;
                    """;

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);

            ResultSet row = statement.executeQuery();

            if(row.next())
            {
                int productId = row.getInt("ProductId");
                String productName = row.getString("ProductName");
                 double unitPrice = row.getDouble("UnitPrice");

                 return new Product(productId,productName,unitPrice);
            }
        }
        catch (SQLException e)
        {
        }
        return null;
    }

    @Override
    public Product insert(Product product)
    {
        int newId = 0;
        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    insert into products ( ProductName, UnitPrice)
                    values (?,?,?);
                    """;

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, product.getProductName());
            statement.setDouble(2,product.getUnitPrice());

            statement.executeUpdate();
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next())
            {
                newId = keys.getInt("ProductsId");
            }
        }
        catch (SQLException e)
        {
        }
        return getById(newId);
    }


}
