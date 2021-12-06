package Lesson4;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



public class TicTacToe {
    private static final int SIZE = 5;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static final char[][] MAP = new char [SIZE][SIZE];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static final String HEADER_FIRST_SYMBOL = "∆";
    private static final String SPACE_MAP =" ";
    private static int turnsCount = 0;

    public static void turnGame() {
        System.out.println("Game start!");
        initMAP();
        printMAP();
        playGame();
    }

    private static void initMAP() {
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP [i][j] =DOT_EMPTY;
            }
        }
    }

    private static void printMAP() {
        printHeadMap();
        printBodyMap();
    }

    private static void printHeadMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j]+SPACE_MAP);
            }
            System.out.println();

        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void playGame() {
        while (true){
            turnHuman();
            printMAP();
            if (checkEnd(DOT_HUMAN)){
                break;
            }


            turnAI();
            printMAP();
            if (false/*проверка хода*/){
                break;
            }
        }

        //перейти к след ходу

    }



    private static void turnAI() {

        System.out.println("Human Turn!");
        int rowNumber, columnNumber;

        do {
        rowNumber = random.nextInt(SIZE);
        columnNumber= random.nextInt(SIZE);
        }while(!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static void turnHuman() {
        System.out.println("Human Turn!");
        int rowNumber, columnNumber;

        rowNumber = in.nextInt() - 1;
        columnNumber= in.nextInt() -1;
        if (isCellFree(rowNumber, columnNumber)) {break;}
        System.out.println("Cell isn't empty");

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber]  == DOT_EMPTY;
    }


    private static boolean checkEnd(char symbol) {
        if(checkWin(symbol)){
            if(symbol == DOT_HUMAN){
                System.out.println("\nHuman Wins");
            }else {
                System.out.println("\nAI Wins");
            }
            return true;
        }

        if(checkDraw(symbol)){
            return true;
        }
        return false;
    }


    private static boolean checkWin(char symbol) {

    }

    private static boolean checkDraw(char symbol) {
       return turnsCount >= SIZE*SIZE;

    }

}
