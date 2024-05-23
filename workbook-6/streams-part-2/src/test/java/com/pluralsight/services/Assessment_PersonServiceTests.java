package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Assessment_PersonServiceTests
{

    PersonService service;
    List<Person> people;
    List<Employee> employees;

    Person person1 = new Person("Hiroshi", "Tanaka", 40);
    Person person2 = new Person("Nia", "Williams", 22);
    Person person3 = new Person("Mateo", "Garcia", 28);
    Person person4 = new Person("Ananya", "Patel", 35);
    Person person5 = new Person("Liam", "O'Connor", 28);

    Employee employee1  = new Employee(person1.getFirstName(), person1.getLastName(), person1.getAge(), person1.getAge() * 3000);
    Employee employee2  = new Employee(person2.getFirstName(), person2.getLastName(), person2.getAge(), person2.getAge() * 3000);
    Employee employee3  = new Employee(person3.getFirstName(), person3.getLastName(), person3.getAge(), person3.getAge() * 3000);
    Employee employee4  = new Employee(person4.getFirstName(), person4.getLastName(), person4.getAge(), person4.getAge() * 3000);
    Employee employee5  = new Employee(person5.getFirstName(), person5.getLastName(), person5.getAge(), person5.getAge() * 3000);

    @BeforeEach
    void setUp()
    {
        service = new PersonService();
        people = new ArrayList<>();
        employees = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
    }

    @Test
    public void findPeople_shouldFindPeople_byName()
    {
        // arrange
        Person expected = person1;
        List<Person> expectedList = new ArrayList<>();
        expectedList.add(expected);

        // act
        List<Person> actualList = service.findPeople(people, expected.getFirstName());

        // assert
        assertEquals(expectedList.size(), actualList.size(), "Because there should only be one person named " + expected.getFirstName());
        Person actual = actualList.getFirst();
        assertEquals(expected.getFirstName(), actual.getFirstName());
        assertEquals(expected.getLastName(), actual.getLastName());
        assertEquals(expected.getAge(), actual.getAge());
    }

    @Test
    public void findPeople_shouldFindPeople_byAge()
    {
        // arrange
        List<Person> expectedList = new ArrayList<>();
        expectedList.add(person3);
        expectedList.add(person5);

        // act
        List<Person> actualList = service.findPeople(people, person3.getAge());

        // assert
        assertEquals(expectedList.size(), actualList.size(), "Because there should be two people that are  " + person3.getAge());
        assertTrue(actualList.contains(person3), "Because " + person3.getFirstName() + " is " + person3.getAge());
        assertTrue(actualList.contains(person5), "Because " + person5.getFirstName() + " is " + person5.getAge());
    }

    @Test
    public void calculateAverageAge_shouldReturn_averageAge()
    {
        // arrange
        int expected = 30;

        // act
        int actual = service.calculateAverageAge(people);

        // assert
        assertEquals(expected, actual, "Because the average age of the 5 people in the list is 30 (40,22,28,35,28)");
    }

    @Test
    public void findOldestAge_shouldReturn_theAgeOfTheOldestPerson()
    {
        // arrange
        int expected = person1.getAge();

        // act
        int actual = service.findOldestAge(people);

        // assert
        assertEquals(expected, actual, "Because " + person1.getFirstName() + " is the oldest person in the list");
    }

    @Test
    public void findYoungestAge_shouldReturn_theAgeOfTheYoungestPerson()
    {
        // arrange
        int expected = person2.getAge();

        // act
        int actual = service.findYoungestAge(people);

        // assert
        assertEquals(expected, actual, "Because " + person2.getFirstName() + " is the youngest person in the list");
    }

    @Test
    public void sortYoungestFirst_shouldReturn_theCorrectlySortedList()
    {
        // arrange
        // act
        List<Person> actualList = service.sortYoungestFirst(people);

        // assert
        assertEquals(people.size(), actualList.size(), "Because the size of the list should not have changed");
        Person firstPerson = actualList.getFirst();
        Person lastPerson = actualList.getLast();
        assertEquals(person2, firstPerson, "Because " + person2.getFirstName() + " is the youngest person in the list and should be first");
        assertEquals(person1, lastPerson, "Because " + person1.getFirstName() + " is the oldest person in the list and should be last");
    }

    @Test
    public void sortOldestFirst_shouldReturn_theCorrectlySortedList()
    {
        // arrange
        // act
        List<Person> actualList = service.sortOldestFirst(people);

        // assert
        assertEquals(people.size(), actualList.size(), "Because the size of the list should not have changed");
        Person firstPerson = actualList.getFirst();
        Person lastPerson = actualList.getLast();
        assertEquals(person1, firstPerson, "Because " + person1.getFirstName() + " is the oldest person in the list and should be first");
        assertEquals(person2, lastPerson, "Because " + person2.getFirstName() + " is the youngest person in the list and should be last");
    }

    @Test
    public void createEmployees_shouldReturn_allPeopleAsEmployees()
    {
        // arrange
        // act
        List<Employee> actualList = service.createEmployees(people);

        // assert
        assertEquals(employees.size(), actualList.size(), "Because the size of the list should not have changed");
        Employee firstEmployee = actualList.getFirst();
        assertEquals(employee1.getFirstName(), firstEmployee.getFirstName(), "Because " + employee1.getFirstName() + " is the first person in the people list");
        assertEquals(employee1.getSalary(), firstEmployee.getSalary(), "Because " + employee1.getSalary() + " should be the salary of " + employee1.getFirstName());
    }
}