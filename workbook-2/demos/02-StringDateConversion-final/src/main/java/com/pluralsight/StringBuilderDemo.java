package com.pluralsight;

public class StringBuilderDemo
{
    public static void main(String[] args) {


        StringBuilder skills = new StringBuilder();

        skills.append("Git, ");
        skills.append("HTML, ");
        skills.append("CSS, ");
        skills.append("and Bootstrap\n");
        skills.append("JavaScript, ");
        skills.insert(15, "nodejs, ");
        skills.append("ES6, ");
        skills.append("jQuery, ");
        skills.append("REST APIs, ");
        skills.append("and Express\n");
        skills.append("Angular\n");
        skills.append("Java\n");

        String mySkills = skills.toString();
        System.out.println(mySkills);
    }
}
