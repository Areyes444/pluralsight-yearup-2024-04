package com.pluralsight.services;

import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleBuilder
{
    public static List<Person> createPeopleList()
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Aiden", "Johnson", 25));
        people.add(new Person("Sofia", "Martinez", 30));
        people.add(new Person("Hiroshi", "Tanaka", 40));
        people.add(new Person("Nia", "Williams", 22));
        people.add(new Person("Mateo", "Garcia", 28));
        people.add(new Person("Ananya", "Patel", 35));
        people.add(new Person("Liam", "O'Connor", 27));
        people.add(new Person("Zhi", "Wang", 45));
        people.add(new Person("Elena", "Petrova", 33));
        people.add(new Person("Amir", "Khan", 37));
        people.add(new Person("Isabella", "Rossi", 24));
        people.add(new Person("Darius", "Smith", 29));
        people.add(new Person("Mei", "Chen", 26));
        people.add(new Person("Leila", "Haddad", 31));
        people.add(new Person("Oliver", "Brown", 32));
        people.add(new Person("Zara", "Ahmed", 36));
        people.add(new Person("Santiago", "Lopez", 39));
        people.add(new Person("Fatima", "Ali", 34));
        people.add(new Person("Nikolai", "Ivanov", 38));
        people.add(new Person("Yara", "Jansen", 23));
        people.add(new Person("Lucas", "Müller", 41));
        people.add(new Person("Mia", "Nguyen", 20));
        people.add(new Person("Jonas", "Schmidt", 42));
        people.add(new Person("Hana", "Kimura", 27));
        people.add(new Person("Carlos", "Silva", 33));
        people.add(new Person("Amina", "Hussein", 25));
        people.add(new Person("Ethan", "Dupont", 28));
        people.add(new Person("Clara", "Dubois", 30));
        people.add(new Person("Leo", "Nascimento", 29));
        people.add(new Person("Maria", "Ferreira", 32));

        return people;
    }
}
