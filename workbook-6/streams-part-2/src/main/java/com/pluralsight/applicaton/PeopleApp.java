package com.pluralsight.applicaton;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;
import com.pluralsight.services.PeopleBuilder;
import com.pluralsight.services.PersonService;
import com.pluralsight.ui.UserInterface;
import com.pluralsight.ui.enumerations.UserChoice;

import java.util.List;

public class PeopleApp
{
    private List<Person> people;
    private final PersonService service = new PersonService();

    public void run()
    {
        while(true)
        {
            // create the list of employees each time so we have a clean list to work with
            people = PeopleBuilder.createPeopleList();

            UserChoice choice = UserInterface.getHomeScreenSelection();

            switch(choice)
            {
                case SearchName -> searchByName();
                case SearchAge -> searchByAge();
                case CalculateAverageAge -> displayAverageAge();
                case DisplayOldestAge -> displayOldestAge();
                case DisplayYoungestAge -> displayYoungestAge();
                case SortYoungestFirst -> displaySortedYoungestFirst();
                case SortOldestFirst -> displaySortedOldestFirst();
                case CreateEmployees -> displayEmployees();
                case ShowAll -> showAll();
                case Exit -> System.exit(0);
            }
        }
    }

    private void showAll()
    {
        // this is a hidden option 99
        UserInterface.displayPeople(people, "List of All People");
    }

    private void searchByName()
    {
        // prompt user for first name and display all people with that name
        String name = UserInterface.getSearchNameFromUser();
        List<Person> searchResults = service.findPeople(people, name);
        UserInterface.displayPeople(searchResults, "Search people by name: " + name);
    }

    private void searchByAge()
    {
        // prompt user for an age and display all people with that age
        int age = UserInterface.getSearchAgeFromUser();
        List<Person> searchResults = service.findPeople(people, age);
        UserInterface.displayPeople(searchResults, "Search people by age: " + age);
    }

    private void displayAverageAge()
    {
        // calculate and display the average age of all people in the list
        int averageAge = service.calculateAverageAge(people);
        UserInterface.displayMessage("The average age of all people is: " + averageAge);
    }

    private void displayOldestAge()
    {
        // find and display the age of the oldest person in the list
        // don't display the person's info, just their age
        int oldest = service.findOldestAge(people);
        UserInterface.displayMessage("The oldest person is: " + oldest + " years old");
    }

    private void displayYoungestAge()
    {
        // find and display the age of the youngest person in the list
        // don't display the person's info, just their age
        int youngest = service.findYoungestAge(people);
        UserInterface.displayMessage("The youngest person is: " + youngest + " years old");
    }

    private void displaySortedYoungestFirst()
    {
        // display all info for all people, sorted by age, youngest first
        List<Person> sortedList = service.sortYoungestFirst(people);
        UserInterface.displayPeople(sortedList, "People sorted by age - youngest first");
    }

    private void displaySortedOldestFirst()
    {
        // display all info for all people, sorted by age, youngest first
        List<Person> sortedList = service.sortOldestFirst(people);
        UserInterface.displayPeople(sortedList, "People sorted by age - oldest first");
    }

    private void displayEmployees()
    {
        // display all people as employees
        List<Employee> employees = service.createEmployees(people);
        UserInterface.displayEmployees(employees);
    }
}
