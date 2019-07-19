package ChapterFour;
import java.util.Scanner;

public class Chap4_3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four digit number");
        int number = input.nextInt();
        if(number >= 10000 || number <= 999){
            System.out.println("Enter a valid for digit number");
        }

        else {
            int firstDigit = number/1000;
            int secondDigit = number/100;
            int thirdDigit = number/10;
            int fourthDigit = number % 10;

            firstDigit = (firstDigit + 7)% 10;
            secondDigit = (secondDigit + 7)% 10;
            thirdDigit = (thirdDigit + 7)% 10;
            fourthDigit = (fourthDigit + 7) % 10;


            System.out.print(firstDigit);
            System.out.print(thirdDigit);
            System.out.print(fourthDigit);
            System.out.print(secondDigit);
        }


        System.out.println("Enterr number%n");
        int numbers = input.nextInt();
        if(numbers >= 10000 || numbers <= 999)
            System.out.println("Enter a valid 4 digit number");
        else{
            int firstNumber = numbers/1000;
            int secondNumber = numbers/100;
            int thirdNumber = numbers/10;
            int fourthNumber = numbers% 10;

         //   firstNumber = (firstNumber % 10) -  7;
            firstNumber = (number + 7);
            secondNumber = (secondNumber % 10) + 7;
            thirdNumber = (thirdNumber % 10) - 7;
            fourthNumber = (firstNumber % 10) - 7;


            System.out.print(firstNumber);
            System.out.print(secondNumber);
            System.out.print(thirdNumber);
            System.out.print(fourthNumber);
        }
    }
}
