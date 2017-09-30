package com.company;




import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        //5.8

        for (int i = 0; i < 100; i++) {
            if (i >= 5 && i <= 10 || i == 42) {
                System.out.println(i);
            }
        }
            // Ska skriva ut 5,6,7,8,9,10,42
        for (int i = 0; i < 100; i++) {
            if (i >= 5 && i <= 10 || i == 42) {
                System.out.println(i);
            }
        }


        //5.7

        /*for(int i=0;i<100;i++){
            if( !(i<5 || i>=10)) {  // När något stämmer så blir if = false och körs inte.
                System.out.println(i);
            }
        }*/


        //5.6

        // Bäst lösning
        /* for (int i = 1; i <= 100; i++) {
            if (i%3 == 0)  // Skriver Fizz var tredje tal
                System.out.print("Fizz");
            if (i%5 == 0)  // Skriver Buzz var femte tal samt skriver Buzz efter Fizz om båda stämmer.
                System.out.print("Buzz");
            if ( i%3 != 0 && i%5 != 0) // När det inte är lika med något så skriv nummer
                 System.out.print(i);
            System.out.println(); // Detta krävs för att det ska bli en ny rad.
*/


        // Bättre lösning

        /*for (int i = 1; i <= 100; i++) {
            if ( i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuss");
            }
            else if (i%3 == 0){
                System.out.println("Fizz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }*/

        }


        // Min lösning
   /*     for (int i = 1; i <= 100; i++) {

            if ( i%3 == 0) {
                if (i%15 == 0) {
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if (i%5 == 0) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Buzz");
                }
            }
        }*/




        //5.5.1

       /* Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Your age?");

            while (!in.hasNextInt()) {
                String temp = in.nextLine();
                System.out.println("You didn´t write a number!");
                System.out.println("Your age?");
            }

            int i = in.nextInt();

            if (i <= 20) {
                System.out.println("Under age");
            } else if (20 < i && i < 40) {
                System.out.println("Young adult");
            } else if (40 <= i && i <= 60) {
                System.out.println("Middle aged");
            } else {
                System.out.println("Old!");
            }
        }*/
        //5.4.1-2

        // Refactoring

       /* int x = ???;
        if (x == 0){
            System.out.println("output 1");
        }
        else if (x > 0){
            System.out.println("output 2");
        }
        else{
            System.out.println("output 3");
        }*/

        // originalkod

       /* if (x >= 0)
            if (x == 0)
                System.out.println("Output1");
            else
                System.out.println("Output2");
        System.out.println("Output3");*/


        //5.3.1
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv ett heltal!");

        while (!input.hasNextInt()) {  // hasNextInt är en boolean som är false
            String temp = input.nextLine();
            System.out.println("That is not an Int, please try again!");
            System.out.println("Skriv ett heltal!");
        }
        int i = input.nextInt();
        int x = i % 2;
        if (x == 0){
            System.out.println("Talet är jämnt");
        }
        else {
            System.out.println("Talet är udda!");
        }*/

        //5.3.2
        /*
        int x = 14;
        System.out.println(x % 5); // Can output 0-4 because
        */

        // 5.2
        /*
        int x = 45;

       // x += 100;
       // x -=23;
       // x *= 2;
        x /= 5;

        System.out.println(x);
        */


        //5.1.2
/*
        int x = 42;

        int y = x++ + ++x;  // 42 + 44


        System.out.println(y);
        System.out.println(x);

*/



        // 5.1.1
        /*
        int x = 42;

        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
*/


    }

