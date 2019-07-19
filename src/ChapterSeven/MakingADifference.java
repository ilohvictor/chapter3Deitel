package ChapterSeven;

public class MakingADifference {
    private int arrayResponses[][];
    private String[] topics = {" political issues", " global issues", " spiritual issues", " domicilary issues", " mandatory issues"};
    private String courseName;

    public MakingADifference(String courseName, int[][] arrayResponses) {
        this.courseName = courseName;
        this.arrayResponses = arrayResponses;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMinimum() {
        int lowGrage = arrayResponses[0][0];

        for (int[] studentsResponse : arrayResponses) {
            for (int grade : studentsResponse) {
                if (grade < lowGrage)
                    lowGrage = grade;
            }
        }
        return lowGrage;
    }

    public int getMaximum() {
        int highGrade = arrayResponses[0][0];

        for (int[] studentsResponse : arrayResponses) {
            for (int grade : studentsResponse) {
                if (grade > highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    }

    public double getAverage(int[] setOfGrades) {

        int total = 0;
        for (int sumTotal : setOfGrades)
            total += sumTotal;
        return (double) total / setOfGrades.length;
    }

    public void outputGrades() {
        System.out.printf("the grades are : %n%n");
        System.out.print("              ");
        for (int response = 0; response < arrayResponses.length; response++) {
            System.out.printf("ans %d    ", response + 1);
        }
        System.out.println("Average");
        System.out.printf("    Total");

        int[] totals = new int[5];
        for (int student = 0; student < topics.length; student++) {
            System.out.printf(topics[student]);
            for (int test : arrayResponses[student])
                System.out.printf("%8d", test);
            double Average = getAverage(arrayResponses[student]);
            System.out.printf("%9.2f%n", Average);
            int total1 = total(arrayResponses[student]);
            System.out.printf("%9d", total1);
            totals[student] = total1;

        }
        for (int newTotals : totals) {
            System.out.println(newTotals);
        }
        loopTotalMinimum(totals);
        loopTotalMaximum(totals);


    }

    public void processGrades() {
        outputGrades();
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());
    }

    public int total(int[] setOfGrades) {
        int total = 0;
        for (int sumTotal : setOfGrades)
            total += sumTotal;
        return total;
    }

    public void loopTotalMinimum(int[] setTotals) {
        int minValue = setTotals[0];
        int index = 0;

        for (int numbers = 0; numbers < setTotals.length; numbers++) {
            if (setTotals[numbers] < minValue) {
                minValue = setTotals[numbers];
                index = numbers;
            }
        }
        System.out.printf("The topic %s has the minimum value of %d%n", topics[index], minValue);
    }

    public void loopTotalMaximum(int[] setTotals) {
        int maxValue = setTotals[0];
        int index = 0;

        for (int numbers = 0; numbers < setTotals.length; numbers++) {
            if (setTotals[numbers] > maxValue) {
                maxValue = setTotals[numbers];
                index = numbers;
            }
        }
        System.out.printf("The topic %s has the maximum value of %d", topics[index], maxValue);
    }
}
