package Chap3makingDifference;


import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args){
        HeartRates heartRates = new HeartRates("VICTOR" , "ILOH" , 12 , 1994 ,20);
        System.out.printf(" the first employess details are :%s%n %s%n %d%n %d%n %d%n ", heartRates.getFirstName(),heartRates.getLastName(),heartRates.getYear(),heartRates.getMonth(), heartRates.getDay());
        System.out.printf("you are %s old and your hearRate is %s", heartRates.realAge(), heartRates.heartTarget());
        Scanner input = new Scanner(System.in);

        System.out.print("Enter firstName");
        String firstName = input.nextLine();
        heartRates.setFirstName(firstName);

        System.out.print("Enter lastName");
        String lastName = input.nextLine();
        heartRates.setLastName(lastName);


        System.out.print("Enter month");
        int year = input.nextInt();
        heartRates.setYear(year);


        System.out.print("Enter month");
        int month = input.nextInt();
        heartRates.setMonth(month);


        System.out.print("Enter month");
        int day = input.nextInt();
        heartRates.setDay(day);

        System.out.printf(" the first employess details are :%s%n %s%n %d%n %d%n %d%n ", heartRates.getFirstName(),heartRates.getLastName(),heartRates.getYear(),heartRates.getMonth(), heartRates.getDay());
        System.out.printf("you are %s old and your hearRate is %s", heartRates.realAge(), heartRates.heartTarget());



    }
}
