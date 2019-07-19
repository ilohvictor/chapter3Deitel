package ChapterSeven;

import java.security.SecureRandom;

public class Example1 {
    public static void main(String[] args){
        SecureRandom randomNumbers = new SecureRandom();
        int []frequency = new int[7];

        for (int roll =1; roll <= 6000000; roll++ )
            ++frequency[1 + randomNumbers.nextInt(6)];

        System.out.printf("index  " + "frenquency ");
        System.out.println();

        for (int faces = 1; faces < frequency.length; faces++)
            System.out.printf("%4d%10d%n", + faces , frequency[faces]);

    }
}
