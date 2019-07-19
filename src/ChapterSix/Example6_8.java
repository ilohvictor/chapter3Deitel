package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Example6_8 {

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int BOX_CARS = 12;
    private static final int YO_LEVEN = 11;
    private static final int SEVEN = 7;
    private static int BANK_BALANCE = 1000;


    private enum Status {CONTINUE, LOST, WON}

    private static final Scanner input = new Scanner(System.in);
    private static final SecureRandom randomNumbers = new SecureRandom();

    static int myPoints;
    static int sumOfDice;


    public static void main(String[] args) {

        wager();

    }

    private static void playGame() {
         int myPoints = 0;
         int sumOfDice = rollDice();
        Status gameStatus;
        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                BANK_BALANCE += wager();
                System.out.println(BANK_BALANCE);
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoints = sumOfDice;
                System.out.printf("my point is : %d%n", myPoints);
                break;
        }


        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoints) {
                System.out.printf("Sum of dice %s is equal to %s point(s)", sumOfDice, myPoints);
                gameStatus = Status.WON;
                System.out.println("\nplayer wins");
                BANK_BALANCE = BANK_BALANCE + wager();
                System.out.println(BANK_BALANCE);
            } else if (sumOfDice == SEVEN) {
                System.out.printf("Sum of dice %s is not equal to %s point(s)", sumOfDice, myPoints);
                gameStatus = Status.LOST;
                System.out.println("\nplayer losses");
            }
        }
        continueGame();
    }

    public static int rollDice() {
        int sumOfDice = 0;
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        sumOfDice = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sumOfDice);
        return sumOfDice;
    }

    public static int wager() {
        System.out.println("Enter Wager");
        int wager = input.nextInt();
        if (wager <= 1000) {
            System.out.println("Valid wager inputted");
            playGame();
        } else {
            System.out.println("input a valid wager");
            inputCorrect();
        }
        return wager;
    }

    public static void inputCorrect() {
        Scanner input = new Scanner(System.in);
        System.out.println("Invalid wager");
        System.out.println("please enter correct Wager within 1000");
        while (!input.hasNextInt()) {
            input.next();
        }
        int number = input.nextInt();
        if (number <= 1000) {
            System.out.println("the wager you entered is:\n" + number);
            playGame();
        } else {
            inputCorrect();
        }
    }
    public static void continueGame(){

        System.out.println("Do you want to continue");
        System.out.println("Enter 1 to continue or 2 to exit");
        int answer = input.nextInt();
        if(answer == 1)
        {
            wager();
        }
        else
            System.out.println("Na you be oga");
    }
}
