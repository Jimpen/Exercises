package com.company;



import java.util.Random;

public class Main {

    public static void main(String[] args) {


        //7.2.1

        int[] input = new int[]{1, 4, 5, 7,20000, -511, 100, -201, 400};
        int[] result = new int[9];

        for (int i = 0; i < input.length; i++) {
            if (input[i]%2 == 0){
                System.out.println(input[i]);

            }
        }


// implement code here to put the even numbers into result
        for (int item : result) {
            System.out.println(item);
        }






        //7.1.6
//
//        int heads = 0;
//        int tails = 0;
//        int amountTosses = 100;
//        Random rand = new Random();
//        for (int i = 1; i <= amountTosses ; i++) {
//            //int random = 1 + (int)(Math.random() * ((2-1) + 1));
//           int random = rand.nextInt(2) + 1;
//
//            if ( random == 1) {
//                heads++;
//            }
//            else{
//                tails += 1;
//            }
//        }
//        System.out.printf("Flipped %d coins %nTotal heads %d%nTotal tails %d%n",amountTosses,heads,tails);
//
//



        }






        //7.1.5

        //String[][] tabell = new String[10][10] {"0","*","*"}

/*

        for (int i = 0; i < 10; i++) {

            String value = "i";

            System.out.printf(value);

        }
*/




        //7.1.4
        /*
        for (int i = 9; i > 0; i-2) {
                System.out.println(i);
        }
*/

        //7.1.3
/*
        for (int i = 9; i > 0; i--) {
            System.out.println(i);
        }

        int[] lista = {9,8,7,6,5,4,3,2,1};

        for (int i = 0; i <= 8 ; i++) {
            System.out.println(lista[i]);
        }
*/




        //7.1.2
      /*  int sum = 0;

        int[] input = new int[]{1, 4, 5, 7,20000, -511, 100, -200, 400};

        for (int tal : input) {
            sum += tal;
        }
        System.out.println("The sum of the array is: " + sum);

        for (int tal : input){
            if (sum < tal){
                sum = tal;
            }
        }
        System.out.println("Maximum value is: " + sum );

        for (int tal : input) {
            if (sum > tal) {
                sum = tal;
            }
        }
        System.out.println("Minimum value is: " + sum);
*/





        //7.1.1
       /* int sum = 0;

        int[] input = new int[]{1, 4, 5, 7,20000, -511, 100, -200, 400};
        for (int i = 0; i < input.length; i++) {
            sum += input[i];

        }
        System.out.println("The sum of the array is: " + sum);

        for (int i = 0; i <input.length ; i++) {
            if (sum < input[i]) {
                sum = input[i];
            }
        }
        System.out.println("Maximum value is: " + sum );

        for (int i = 0; i < input.length ; i++) {
            if (sum > input[i]){
                sum = input[i];
            }
        }
        System.out.println("Minimum value is: " + sum);
*/

    }

