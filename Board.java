import javafx.geometry.Pos;

import java.util.Scanner;

class Game {
    private int turn = 1;
    private String PositionValue = "";
    Scanner input = new Scanner(System.in);
    /* Declaring An Empty Array That will Be loaded with Data 'x' Every Time Game loads */
    String array[][] = {
            {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}
    };
    String users[]=new String[2];
    String currentPlayer = "";
    Game() {
        showrules();
        for(int i=0;i<users.length;i++){
            System.out.println("Enter Name of " +(i+1)+" Player :");
            users[i]= new Scanner(System.in).next();
        }
        System.out.println("Users Registered For Game Are : "+users[0]+" And "+users[1]);
    }

    void clearconsole() {
        System.out.println("\t \t \t \t ");
        System.out.println("\t \t \t \t ");
        System.out.println("");
        System.out.println("");
    }

    void showrules() {
        Scanner input = new Scanner(System.in);
        System.out.println("The Board Has ' 3x3 ' Value Currently on it . The User Can Play with X or O ");
        System.out.println("The Game will be Player on 3x3 Board  , Rules Are Simple :");
        System.out.println("1.Player will be Winner if there's a full row , column or diagonal of 0 or 1");
        System.out.println("Press 1 To Refresh The Screen ");
        int choice = input.nextInt();
        if (choice == 1) {
            clearconsole();
            printArray();
        }
    }

    void printArray() {
        System.out.println("=====================");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print("\t" + array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("=====================");
    }

    void fillArray() {
        int choice = 0;
        System.out.println("Type 123 Anytime for exit or Press 456 for Continue Playing");
        while (true) {
            choice = input.nextInt();
            if (choice == 123) {
                System.exit(0);
            } else if (choice == 456) {
                if (turn == 1) {
                    PositionValue = "X";
                    currentPlayer = users[0];
                    askforvalue(PositionValue,currentPlayer);
                    checkandverify(currentPlayer);
                    turn = 0;
                } else {
                    PositionValue = "O";
                    currentPlayer = users[1];
                    askforvalue(PositionValue,currentPlayer);
                    checkandverify(currentPlayer);
                    turn = 1;
                }
                printArray();
            } else {
                System.out.println("Invalid Value  ...");
            }

        }
    }

    void closethegame() {
        System.exit(0);
    }

    void upperStraight(String currentPlayer) {
        if ((array[0][0].equals("X")) && (array[0][1].equals("X")) && (array[0][2].equals("X"))) {
            System.out.println(currentPlayer+" Wins");
            printArray();
            closethegame();
        } else if ((array[0][0].equals("O")) && (array[0][1].equals("O")) && (array[0][2].equals("O"))) {
            System.out.println(currentPlayer+" Wins");
            printArray();
            closethegame();
        }
    }

    void middleStraight(String currentPlayer) {
        if ((array[1][0].equals("X")) && (array[1][1].equals("X")) && (array[1][2].equals("X"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        } else if ((array[1][0].equals("O")) && (array[1][1].equals("O")) && (array[1][2].equals("O"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        }
    }

    void bottomStraight(String currentPlayer) {
        if ((array[2][0].equals("X")) && (array[2][1].equals("X")) && (array[2][2].equals("X"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        } else if ((array[2][0].equals("O")) && (array[2][1].equals("O")) && (array[2][2].equals("O"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        }
    }

    void leftStraight(String currentPlayer) {
        if ((array[0][0].equals("X")) && (array[1][0].equals("X")) && (array[2][0].equals("X"))) {
            System.out.println(currentPlayer+" Wins");
            printArray();
            closethegame();
        } else if ((array[0][0].equals("O")) && (array[1][0].equals("O")) && (array[2][0].equals("O"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        }
    }

    void centerStraight(String currentPlayer) {
        if ((array[0][1].equals("X")) && (array[1][1].equals("X")) && (array[2][1].equals("X"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        } else if ((array[0][1].equals("O")) && (array[1][1].equals("O")) && (array[2][1].equals("O"))) {
            System.out.println(currentPlayer+" Wins");
            printArray();
            closethegame();
        }
    }

    void rightStraight(String currentPlayer) {
        if ((array[0][2].equals("X")) && (array[1][2].equals("X")) && (array[2][2].equals("X"))) {
            System.out.println(currentPlayer+" Wins");
            printArray();
            closethegame();
        } else if ((array[0][2].equals("O")) && (array[1][2].equals("O")) && (array[2][2].equals("O"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        }
    }

    void leftDiagonalStraight(String currentPlayer) {
        if ((array[0][0].equals("X")) && (array[1][1].equals("X")) && (array[2][2].equals("X"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        } else if ((array[0][0].equals("O")) && (array[1][1].equals("O")) && (array[2][2].equals("O"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        }
    }

    void rightDiagonalStraight(String currentPlayer) {
        if ((array[0][2].equals("X")) && (array[1][1].equals("X")) && (array[2][0].equals("X"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        } else if ((array[0][2].equals("O")) && (array[1][1].equals("O")) && (array[2][0].equals("O"))) {
            System.out.println(currentPlayer+"  Wins");
            printArray();
            closethegame();
        }
    }

    void checkandverify(String currentPlayer) {
        upperStraight(currentPlayer);
        middleStraight(currentPlayer);
        bottomStraight(currentPlayer);
        leftStraight(currentPlayer);
        centerStraight(currentPlayer);
        rightStraight(currentPlayer);
        leftDiagonalStraight(currentPlayer);
        rightDiagonalStraight(currentPlayer);
    }


    void askforvalue(String PositionValue,String currentPlayer) {
        int choice;
        System.out.println(currentPlayer+" Enter The Position to Fill Array");
        choice = input.nextInt();
        if (choice == 1) {
            if ((array[0][0] == "X") || (array[0][0] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[0][0] = PositionValue;
            }
        } else if (choice == 2) {
            if ((array[0][1] == "X") || (array[0][1] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[0][1] = PositionValue;
            }
        } else if (choice == 3) {
            if ((array[0][2] == "X") || (array[0][2] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[0][2] = PositionValue;
            }

        } else if (choice == 4) {
            if ((array[1][0] == "X") || (array[1][0] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[1][0] = PositionValue;
            }
        } else if (choice == 5) {
            if ((array[1][1] == "X") || (array[1][1] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[1][1] = PositionValue;
            }
        } else if (choice == 6) {
            if ((array[1][2] == "X") || (array[1][2] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[1][2] = PositionValue;
            }
        } else if (choice == 7) {
            if ((array[2][0] == "X") || (array[2][0] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[2][0] = PositionValue;
            }
        } else if (choice == 8) {
            if ((array[2][1] == "X") || (array[2][1] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[2][1] = PositionValue;
            }
        } else if (choice == 9) {
            if ((array[2][2] == "X") || (array[2][2] == "O")) {
                System.out.println(currentPlayer+" This Value is Already filled");
            } else {
                array[2][2] = PositionValue;
            }
        }
    }
}

public class Board {
    public static void main(String[] args) {
        Game mygame = new Game();
        mygame.fillArray();
    }
}
