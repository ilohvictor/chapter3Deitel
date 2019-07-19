package ChapterSeven;

public class Example5 {
    private String courseName;
    private int[][] grades;

    public Example5(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMinimum() {
        int lowGrage = grades[0][0];

        for (int[] studentsGrade : grades) {
            for (int grade : studentsGrade) {
                if (grade < lowGrage)
                    lowGrage = grade;
            }
        }
        return lowGrage;
    }
    public int getMaximum(){
        int highGrade = grades[0][0];
        for(int [] studentsGrade : grades){
            for (int grade : studentsGrade){
                if(grade > highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    }
    public double getAverage(int[] setOfGrades){

        int total = 0;
        for(int sumTotal : setOfGrades)
            total += sumTotal;

        return (double)total/setOfGrades.length;
    }
    public void outputBars(){
        System.out.println("the frequency of the grades");

        int [] frequency = new int[11];
        for (int[] studentGrades : grades){
            for(int grade : studentGrades)
                ++frequency[grade/10];
        }
        for(int count = 0; count < frequency.length ; count++){
            if(count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: " , count * 10 , count * 10 + 9);
            for(int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");
            System.out.println();
        }
    }
    public void outputGrades(){
        System.out.printf("the grades are : %n%n");
        System.out.print("              ");

        for(int test = 0; test < grades[0].length; test++){
            System.out.printf("Test %d  " , test + 1);
        }
        System.out.println("Average");

        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d", student + 1);
            for (int test : grades[student])
                System.out.printf("%8d", test);

            double Average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", Average);
        }
    }
    public void processGrades(){
        outputGrades();
        // call methods getMinimum and getMaximuum
        System.out.printf("%n%s %d%n%s %d%n%n","Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());
        outputBars();
    }

}