package ChapterSeven;

public class Example4 {
    public static void main(String[] args){
        int [][] array1 = {{3,4,5} ,{2, 4, 7} , { 2, 5 ,0}};
        int[][] array2 = {{2,4, 0 , 1 },{4, 9 ,1 , 3}};

        outputArray(array1);
        System.out.println();
        outputArray(array2);
    }
    public static void outputArray(int [][] array){
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.printf("%d  " ,array[row][column]);
            }
            System.out.println();
        }
    }
}
