package ChapterFive;

import java.util.Scanner;

public class Example_531 {


    public static void main(String[] args){

        int correctAnswer = 0;
        int wrongAnswer = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Answer All the questions below");

       // System.out.print("Question 1");
        System.out.printf("%nQuestion 1%n %s%n " , "WHAT IS YOUR PROBLEM");
        System.out.printf("1: %s%n 2: %s%n 3: %s%n 4: %s%n" ,"i am blessed" , "you are blessed", "we are blessed" , "they are blessed");
        int answer = input.nextInt();
        if(answer == 2) {
            isCorrect(answer);
            correctAnswer++;
            System.out.println("your answer is correct");
        }else{
            wrongAnswer++;
            System.out.println("your answer was wrong");
        }

        System.out.printf("%nQuestion 2%n %s%n " , "WHAT IS YOUR PROBLEM");
        System.out.printf("1: %s%n 2: %s%n 3: %s%n 4: %s%n" ,"i am blessed" , "you are blessed", "we are blessed" , "they are blessed");
        int answer2 = input.nextInt();
        if(answer2 == 4) {
            isCorrect(answer);
            correctAnswer++;
            System.out.println("your answer is correct");
        }else{
            wrongAnswer++;
            System.out.println("your answer was wrong");
        }

        System.out.printf("%nQuestion 3%n %s%n " , "WHAT IS YOUR PROBLEM");
        System.out.printf("1: %s%n 2: %s%n 3: %s%n 4: %s%n" ,"i am blessed" , "you are blessed", "we are blessed" , "they are blessed");
        int answer3 = input.nextInt();
        if(answer3 == 1) {
            isCorrect(answer);
            correctAnswer++;
            System.out.println("your answer is correct");
        }else{
            wrongAnswer++;
            System.out.println("your answer was wrong");
        }
        System.out.printf("%nQuestion 4%n %s%n " , "WHAT IS YOUR PROBLEM");
        System.out.printf("1: %s%n 2: %s%n 3: %s%n 4: %s%n" ,"i am blessed" , "you are blessed", "we are blessed" , "they are blessed");
        int answer4 = input.nextInt();
        if(answer4 == 3) {
            isCorrect(answer);
            correctAnswer++;
            System.out.println("your answer is correct");
        }else{
            wrongAnswer++;
            System.out.println("your answer was wrong");
        }
        answerType(correctAnswer,wrongAnswer);



    }

    public static int answerType(int correctAnswer , int wrongAnswer){

        int ansType = correctAnswer;
        if(ansType >= 4){
            System.out.printf("you are a genuis you got %s correctly" , correctAnswer);
        }
        else if (ansType ==3){
            System.out.printf("Good work keep it up , you got %s correctly and %s wrongly"   ,ansType ,wrongAnswer);
        }
        else {
            System.out.printf("you are a dullard you got %s correctly but %s wrongly" , ansType ,  wrongAnswer);
        }

        return ansType ;
    }

    public static int isCorrect(int answer){

        int aCount = 0;
        int bCount = 0;
        int cCount =0;
        int dCount = 0;

        switch (answer){
            case 1:
                aCount++;
                break;

            case 2:
                bCount++;
                break;
            case 3:
                cCount++;
                break;
            case 4:
                dCount++;
                break;
            default:
                System.out.println("Wrong answer inputed");
                break;

        }
        return answer;
    }
}
