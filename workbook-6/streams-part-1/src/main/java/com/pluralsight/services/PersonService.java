package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {
        // search for people by first name
        List<Person> people1 =  new ArrayList<>();
        for(Person person : people)
        {
            if (person.getFirstName().equalsIgnoreCase(name)){
                people1.add(person);
            }
        }
        // return a new List<Person> with the search results
        return people1;
    }

    public List<Person> findPeople(List<Person> people, int age)
    {
        List<Person> people1 = new ArrayList<>(); //creating new arraylist with these parameters
        for (Person person: people)
        {
            if (person.getAge() == age)
            {
                people1.add(person); //once found adding them to arraylist
            }
        }
        return people1; //Providing new arraylist
    }

    public int calculateAverageAge(List<Person> people)
    {
        int totalAge = 0; //initiating the age to 0 first
        for(Person person: people)
        {
            totalAge += person.getAge(); //we are adding all the ages once we get them
        }
        return totalAge/people.size(); //Once we get them we are dividing it by the number of people we have in our arraylist(in order to get the average )
    }

    public int findOldestAge(List<Person> people)
    {
        int oldestAge = Integer.MIN_VALUE; //we are initiating the oldest age by inputting what the minimum age is for the list
        for(Person person: people)
        {
            oldestAge = Math.max(oldestAge, person.getAge()); //then we will go through the list and check which ones overpass that amount until we get one oldestAge.
        }
        return oldestAge; //and then we get that age.
    }

    public int findYoungestAge(List<Person> people)
    {
        //we will do the same thing that we did for find the oldest but for the youngest will be reversed so instead of the min we will use the max...math etc.
        int youngestAge = Integer.MAX_VALUE;
        for(Person person: people)
        {
            youngestAge = Math.min(youngestAge, person.getAge()); //sort through having that max age then going through the arraylist
        }
        return youngestAge; ///returning the youngestAge
    }


    public List<Person> sortYoungestFirst(List<Person> people)
    {
        List<Person> people1 = new ArrayList<>(people);
        people1.sort(Comparator.comparingInt(Person::getAge));
        return people1;
    }

    public List<Person> sortOldestFirst(List<Person> people)
    {
        List<Person> people1 = new ArrayList<>(people);
        people1.sort(Comparator.comparingInt(Person::getAge).reversed());
        return people1;
    }

    public List<Employee> createEmployees(List<Person> people)
    {
        List<Employee> employees = new ArrayList<>();
        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        for (Person person: people)
        {
            double salary = person.getAge() * 3000;
            employees.add(new Employee(person.getFirstName(), person.getLastName(), salary));
        }
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc
        return employees;
    }
}
