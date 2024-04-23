package com.pluralsight;

public class Book
{
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo)
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = " ";

    }

    //Getters and Setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean isCheckedOut()
    {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut)
    {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo()
    {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo)
    {
        this.checkedOutTo = checkedOutTo;
    }


    //Method to check out book
    public void checkOut(String name)
    {
        if(!isCheckedOut)
        {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println("The Book "+ title + "has been checked out successfully. ");
        } else {
            System.out.println("Sorry, the book " + title + "is not available, is already checked out.");
        }
    }

    //Method to check in a book
    public void checkIn()
    {


        if(isCheckedOut())
                {
                    setCheckedOut(false);
                    setCheckedOutTo(" ");
                    System.out.println("The book "+ getTitle() + "has been checked in successfully.");
                } else {
                    System.out.println("The Book "+ getTitle() + "Is not checked out.");
                }



    }
}



