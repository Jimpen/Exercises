package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // Challenges 1

        Scanner input = new Scanner(System.in);
        System.out.println("Write a character!");
        String character = input.next();  // Spara input i String character
        boolean vokal = true;             // Skapa en boolean för switch
        char test = character.charAt(0);  // Ta ut char för input som kan vara



        switch (vokal){
            case 1:
                System.out.println("It is a Vowel!");
                break;
            default:
                System.out.println("It is a Consonant!");

        }

    }
private static int output (char a){

        a
}
}
        //6.5
        /*
        char input = 'a'; //try with a, b, c here
        switch (input) {
            case 'a':
                handleA();
                break;
            case 'b':
                handleB();
                break;
            case 'c':
                handleC();
                break;
        }
    }

    // Här ligger metoder till switch-satsen.
        private static void handleC() {
            System.out.println("You pressed 'c'");
            System.out.println("The sum of the 10 first numbers are ");
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + i; }
            System.out.println("Sum = " + sum);
        }

        private static void handleA() {
            System.out.println("You pressed 'a'");
        }

        private static void handleB() {
            System.out.println("You pressed 'b' and here's 10 numbers");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }


*/
        //6.4

        // Gör metoder!! Private static int
/*
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int tal1 = in.nextInt();
        System.out.println("Please enter second number:");
        int tal2 = in.nextInt();

        System.out.println("Please enter operator +*-//:");
        String operator = in.next();
        char val = operator.charAt(0);


        switch (val) {

            case '+':
                System.out.println(add(tal1, tal2));
                break;
            case '-':
                System.out.println(sub(tal1, tal2));
                break;
            case '/':
                System.out.println(div(tal1, tal2));
                break;
            case '*':
                System.out.println(mul(tal1, tal2));
                break;
            default:
                System.out.println("Invalid operator");

        }
    }
    public static int add(int a, int b) {  // Metod för plus
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }

}
*/

        // 6.3

/*        Scanner stdin = new Scanner(System.in);
        int choice = 0;
        System.out.println("Please enter your choice (1-4): ");
        choice = stdin.nextInt();


        switch (choice) {
            case 1:
                System.out.println("You selected 1.");
                break;
            case 2: case 3:
                System.out.println("You selected 2 or 3.");
                break;
            case 4:
                System.out.println("You selected 4.");
                break;
            default:
                System.out.println("Please enter a choice between 1-4.");

        }*/


        // 6.2.2

       /* Scanner in = new Scanner(System.in);
        boolean number = true;
      //  while (number) {
            System.out.println("Välj färg genom att skriva in rätt siffra");
            System.out.println("a. Black");
            System.out.println("b. White");
            System.out.println("c. Red");
            System.out.println("d. Green");

            String input = in.next(); // Fånga input i en String

            char val = input.charAt(0); // Ta ut det första bokstaven i String

            //int val = in.nextInt();

            switch (val) {
                case 'a':
                    System.out.println("Black!");
                    number = false;
                    break;
                case 'b': case 'w': case 'W': case 'v':
                    System.out.println("White!");
                    number = false;
                    break;
                case 'c':
                    System.out.println("Red");
                    number = false;
                    break;
                case 'd':
                    System.out.println("Green");
                    number = false;
                    break;
               *//* default:
                    System.out.println("Invalid color");
                    break;*//*
            }
        }
   // }
*/

        //6.2.1
        /*char input = 'b';
        switch (input) {
            case 'a':
                System.out.println("Airplane");
                break;
            case 'b':
                System.out.println("Car");
            case 'c':
                System.out.println("Boat");
                break;
        }*/


        //6.1.2

      /*  Scanner in = new Scanner(System.in);
        boolean number = true;
        while (number) {
            System.out.println("Välj färg genom att skriva in rätt siffra");
            System.out.println("a. Black");
            System.out.println("b. White");
            System.out.println("c. Red");
            System.out.println("d. Green");

            String input = in.next(); // Fånga input i en String

            char val = input.charAt(0); // Ta ut det första bokstaven i String

            //int val = in.nextInt();

            switch (val) {
                case 'a':
                    System.out.println("Black!");
                    number = false;
                    break;
                case 'b':
                    System.out.println("White!");
                    number = false;
                    break;
                case 'c':
                    System.out.println("Red");
                    number = false;
                    break;
                case 'd':
                    System.out.println("Green");
                    number = false;
                    break;
                default:
                    System.out.println("Invalid color");
                    break;
            }
        }
    }*/

        //6.1.1

       /* Scanner in = new Scanner(System.in);
        boolean number = true;
        while (number){
            System.out.println("Välj färg genom att skriva in rätt siffra");
            System.out.println("1. Black");
            System.out.println("2. White");
            System.out.println("3. Red");
            System.out.println("4. Green");


            int val = in.nextInt();

            switch (val) {
                case 1:
                    System.out.println("Black!");
                    number = false;
                    break;
                case 2:
                    System.out.println("White!");
                    number = false;
                    break;
                case 3:
                    System.out.println("Red");
                    number = false;
                    break;
                case 4:
                    System.out.println("Green");
                    number = false;
                    break;
                default:
                    System.out.println("Invalid color");
                    break;
            }
        }
    }*/




