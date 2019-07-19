package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Execrise6_30 {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int randomNumber = randomGenerator();
        System.out.println(randomNumber + "");
        guessNumber(randomNumber);
    }

    public static void guessNumber(int randomNumber) {
        int guesscounter = 0;
        System.out.println("Enter a guess");
        int guess = input.nextInt();
        if (guess == randomNumber){
            System.out.println("Congratulations!!! you got it correctly");
            guesscounter++;
        }
        else if (guess < randomNumber) {
            System.out.println("guess is too low. please try Again");
            guesscounter++;
        } else {
            System.out.println("guess is too high. please try Again");
            guesscounter++;
        }
        System.out.println("\nyou wish to try Again??");
        System.out.println("Enter 1 to try Again or  2 to exit");
        int reply = input.nextInt();
        reply(reply, randomNumber);

        if(reply == 2) {
            if (guesscounter <= 10) {
                System.out.println("you counted" + guesscounter);
            } else if (guesscounter == 10) {
                System.out.println("AHa");
            } else {
                System.out.println("guess no be your thing");
            }
        }
    }

    public static void reply(int reply, int randomNumber) {
        if (reply == 1)
            guessNumber(randomNumber);
        else
            System.out.println("Thank you for trying");
    }

    public static int randomGenerator() {
        int number = 1 + randomNumbers.nextInt(1000);
        return number;
    }
}
