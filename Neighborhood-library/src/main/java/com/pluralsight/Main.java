package com.pluralsight;

import java.util.Scanner;

public class Main
{
   static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Array of books
        Book[] books =
                {
                        new Book(1, "978-1-62336-752-7", "Money Rules by: Jean Chatzky ", false, " "),
                        new Book(2, "978-1-63557-319-0", "Shadow Network by Anne Nelson ", false, " "),
                        new Book(3, "978-1-878424-31-9", "The Four Agreements by Don Miguel Ruiz ", false, " "),
                        new Book(4, "978-1-878424-42-6", "The Mastery Of Love by Don Miguel Ruiz ", false, " "),
                        new Book(5, "978-1-878424-58-7", "The Voice Of Knowledge by Don Miguel Ruiz ", false, " "),
                        new Book(6, "978-1-9821-3448-8", "Think Like a Monk by Jay Shetty ", false, " "),
                        new Book(7, "978-0-345-81602-3", "12 Rules for Life by Jordan B. Petterson ", false, " "),
                        new Book(8, "978-0-7352-1129-2", "Atomic Habits by James Clear ", false, " "),
                        new Book(9, "978-0-345-39681-5", "Women who run with the wolves by Clarissa Pinkola ", false, " "),
                        new Book(10, "978-1-61268-112-2", "Rich Dad Poor Dad by Robert Kiyosaki ", false, " "),
                        new Book(11, "978-0-7624-4769-5", "You are a Badass by Jen Sincero ", false, " "),
                        new Book(12, "978-1-60671-410-2", "Memory Mastery by Harry Lorayne ", false, " "),
                        new Book(13, "978-0-399-59252-2", "Dare to lead by Brene Brown ", false, " "),
                        new Book(14, "978-1-78028-299-2", "The Art of War by Sun Tzu ", false, " "),
                        new Book(15, "978-1-4654-8248-8", "Scientist who changed history by Chris WoodFord ", false, " "),
                        new Book(16, "978-0-544-64894-4", "You Play The Girl by Carina Chocano ", false, " "),
                        new Book(17, "978-1-4424-8985-1", "The Book of David by Simon Pulse ", false, " "),
                        new Book(18, "978-1-4424-1996-3", "Jay's Journal by Simon Pulse ", false, " "),
                        new Book(19, "978-14424-7213-6", "Letting Ana Go by Simon Pulse ", false, " "),
                        new Book(20, "978-1-4321-1735-1", "Holy Bible by The Grace of God ", false, " ")


                };

        int choice = 0;
        while (choice != 3) {
            //Home Screen
            System.out.println();
            System.out.println(" Welcome to your Local Neighborhood Library! ");
            System.out.println("----------------------------------------------------");
            System.out.println("1 - All books that Are Available");
            System.out.println("2 - Books that are Checked Out");
            System.out.println("Exit");
            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(userInput.nextLine());

            switch (choice) {
                case 1:
                    showAllAvailableBooks(books);
                    break;
                case 2:
                   showAllCheckedOutBooks(books);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Have A Great rest of your day, GoodBye! ");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid selection");
                    break;
            }

        }

    }

    public static void showAllAvailableBooks(Book[] books)
    {
        System.out.println();
        System.out.println(" All the available Books: ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%-10s %-20s %-10s", "ID", "ISBN", "Title"));
        System.out.println();

        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(String.format("%-10d %-20s %-10s", book.getId(), book.getIsbn(), book.getTitle()));
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Enter the book's ID(1-20) that you would like to check out: ");
        System.out.println("Enter (0) to go to main Screen:");
        int user = Integer.parseInt(userInput.nextLine());

        if (user == 0) {
            System.out.println("Going back to Home Screen.");
        }else{
            for (Book book : books) {
                if (book.getId() == user) {
                    System.out.println("Enter your name to check out the book: ");
                    String userName = userInput.nextLine();
                    book.checkOut(userName);
                }
            }
        }

    }
public static void showAllCheckedOutBooks(Book[] books)
{
    System.out.println();
    System.out.println("Books that Have been checked out: ");
    System.out.println("-------------------------------------------------------");
    System.out.printf("%-10s %-20s %-10s %-15s", "ID", "ISBN", "Title","Checked Out To");
    System.out.println();

    for(Book book :books){
        if(book.isCheckedOut()){
            System.out.printf("%-10d %-20s %-10s %-15s", book.getId(), book.getIsbn(), book.getTitle(), book.getCheckedOutTo());
        }
    }
    System.out.println("-----------------------------------------------------------------------------------------------------");
    System.out.println(" Enter (C) if would You like to check in a book? ");
    System.out.println("Enter (x) if you want to go to main Screen:");
    String user = userInput.nextLine();

    if (user.equalsIgnoreCase("C")) {
        System.out.println("Enter the ID of the book you want to check in: ");
        int bookId = Integer.parseInt(userInput.nextLine());

        for (Book book : books) {
            if (book.getId() == bookId) {
                book.checkIn();
            }
        }
    } else if (user.equalsIgnoreCase("x")) {
        System.out.println("Going back to the main Screen.");
    } else {
        System.out.println("Invalid input. Returning to the main Screen.");
    }
}



}


