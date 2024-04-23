package com.pluralsight;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String[] quotes =
                {"Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill ",
                        "The only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. - Steve Jobs ",
                        "Your attitude, not your aptitude, will determine your altitude. - Zig Ziglar ",
                        "The difference between a successful person and others is not a lack of strength, not a lack of knowledge, but rather a lack in will. - Vince Lombardi ",
                        "Sometimes the right path is not the easiest one. - Grandmother Willow, Pocahontas ",
                        "You control your destiny — you don’t need magic to do it. And there are no magical shortcuts to solving your problems. - Merida, Brave ",
                        "Like stepping into glitter, I embraced every challenge, every setback. Ever since then, I've been shining, illuminating the world with the light born from within.",
                        "Perseverance is not a long race; it is many short races one after the other. - Walter Elliot",
                        "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
                        "Every day is a new beginning. Take a deep breath and start again"};

        Scanner scanner = new Scanner(System.in);

              try {
                 System.out.println("Hello, pick a quote (select a number from 1-10): ");
                  int choice = scanner.nextInt();

                  if (choice >= 1 && choice <= 10) {
                    System.out.println("Your chosen quote: " + quotes[choice - 1]);

                  } else {
                      System.out.println("Please enter a number between 1 and 10.");
                  }
                } catch (Exception e) {
                  System.out.println("Please enter a valid number.");
              }    scanner.next();

         }
    }
