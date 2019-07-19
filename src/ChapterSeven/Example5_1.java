package ChapterSeven;

public class Example5_1 {
    public static void main(String[] args) {
        int[][] gradesArrzy = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};
        Example5 myExample = new Example5("CS101 Introduction to Java Programming", gradesArrzy);
        System.out.printf("Welcome to the grade book for %n%s%n%n", myExample.getCourseName());
        myExample.processGrades();
    }
}