package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out,Charset.forName("UTF8"));
        terminal.enterPrivateMode();
//        boolean[][] board = new boolean[8][8];
//
//
//
//        for (int i = 0; i < 8 ; i++) {  // Räkna raden board[i][j]
//
//
//            for (int j = 0; j < 8; j++) {   // Räkna varje element på raden board[i][j]
//
//                if (j%2 == 0){
//                    //jämna rader
//                    if (i%2 == 0){
//                       board[i][j] = false;
//                    }
//                    else{
//                        board[i][j] = true;
//                    }
//                }
//                    // udda rader
//                else{
//                    if (i%2 == 1){
//                        board[i][j] = false;
//                    }
//                    else{
//                        board[i][j] = true;
//                    }
//                }
//            }
//        }
        for (int i = 0; i < 8 ; i++) {


            terminal.moveCursor(0,i);
            terminal.putCharacter('O');
            terminal.moveCursor(i,0);
            terminal.putCharacter('X');

        }

//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                if (board[i][j] == true){
//                    System.out.print("X");
//                }
//                else {
//                    System.out.print("O");
//                }
//            }
//            System.out.println();

        }

    }






//
//    boolean[][] board = new boolean[8][8];
//    boolean villkor = true;
//
//        for (int i = 0; i <= 8; i++) {
//
//        for (boolean[] b :board) {
//
//
//
//            if (villkor) {
//
//                System.out.print("O");
//                villkor = false;
//            }
//            else {
//                System.out.print("X");
//                villkor = true;
//            }
//        }
//        villkor = false;
//        System.out.println();
//    }
//}

