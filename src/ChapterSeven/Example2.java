package ChapterSeven;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args){
        int [] array = {1, 2, 3, 4, 5};
        System.out.println("Effects of passing reference to entire array: %n" + "The values of the original array are:%n");

        for(int value : array)
            System.out.printf("  %d" , value);

        modifyArray(array);
        System.out.println();

        for (int value : array)
            System.out.printf(" %d", value);

        System.out.println();
        System.out.printf("array[3] after modifyElemnt: %d%n" , array[3]);
        modifyElement(array[3]);
        System.out.printf("array[3] after modifyElemnt: %d%n" , array[3]);

    }

    public static void modifyArray(int [] array2){
        for(int counter = 0; counter < array2.length; counter++){
            array2[counter] *= 2;
        }
        //array2[counter] *= 2;
    }
    public static void modifyElement(int element){
        element *= 2;
        System.out.printf("Value of the element in modifyElement: %d%n" , element);
    }
}
