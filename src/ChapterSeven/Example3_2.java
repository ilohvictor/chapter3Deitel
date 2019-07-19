package ChapterSeven;

public class Example3_2 {
    public static void main(String[] args){
        int[] gradesArray = { 87, 68 , 94 , 100 , 83 , 78 ,85 , 91 , 76 ,76 , 87};
            Example3 myExample = new Example3("CS101 Introduction to java Programming" , gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n" , myExample.getCourseName());
        myExample.processGrades();
    }
}
