package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class MakeADiff {
    public static void main(String[] args) {
        SecureRandom randomGenerator = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int rand_int1 = randomGenerator.nextInt(10);
        int rand_int2 = randomGenerator.nextInt(10);

        System.out.println("Random Integers: " + rand_int1);
        System.out.println("Random Integers: " + rand_int2);

        int result = multiply(rand_int1, rand_int2);

        int answer = input.nextInt();
        System.out.println("your answer is " + answer);

        if (answer == result) {
            System.out.println("your answer is correct");
        } else {

            System.out.println("try again wrong answer");
            inputCorrect(result);
        }
    }

    public static int multiply(int rand_int1, int rand_int2) {
        int multiplyNumbers = rand_int1 * rand_int2;
        System.out.printf("enter the multiplication of %d times %d :\n", rand_int1, rand_int2);
        return multiplyNumbers;
    }

    public static int inputCorrect(int result) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter correct answer");
        while (!input.hasNextInt()) {
            input.next();
        }
        int answer = input.nextInt();
        if (answer == result) {
            System.out.println("very good\nthe answer is:\n" + result);
            return result;
        }

        return inputCorrect(result);
    }
}
