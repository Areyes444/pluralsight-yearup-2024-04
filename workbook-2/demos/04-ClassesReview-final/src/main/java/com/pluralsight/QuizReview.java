package com.pluralsight;

public class QuizReview
{
    public static void main(String[] args)
    {
//        Customer customer = findCustomer("John", "Wright");

        Customer customer = new Customer("Susan", "Johnson");
        System.out.println(customer.getFullName());
        customer.setLastName("Carter");
        System.out.println(customer.getFullName());




    }

    // signature => findCustomer(String, String)
    public static Customer findCustomer(String firstName, String lastName)
    {
          // look up by firstName and lastName

        return new Customer();
    }

    // we cannot create 2 functions with the same signature
//    // signature => findCustomer(String, String)
//    public static Customer findCustomer(String city, String state)
//    {
//        // look up by firstName and lastName
//
//        return new Customer();
//    }

    // signature => findCustomer(String)
    public static Customer findCustomer(String email)
    {
        // look up by email

        return new Customer();
    }

    // signature => findCustomer(int)
    public static Customer findCustomer(int id)
    {
        // look up by id

        return new Customer();
    }
}
