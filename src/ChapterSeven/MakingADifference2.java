package ChapterSeven;

public class MakingADifference2 {
    public static void main(String[] args){
        int[][] gradesArrzy = {{87, 96, 70,1,3,4,5,6,6,3}, {68,45,6,1,4,2,6,7, 87, 90}, {1,2,3,4,5,6,7,94, 100, 90}, {1,2,3,4,5,6,7,100, 81, 82}, {1,2,3,4,5,6,7,83, 65, 85}, {1,2,3,4,5,6,7,78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};
        MakingADifference myExample = new MakingADifference("CS101 Introduction to Java Programming", gradesArrzy);
        System.out.printf("Welcome to the grade book for %n%s%n%n", myExample.getCourseName());
        myExample.processGrades();
    }
}
