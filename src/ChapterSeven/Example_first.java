package ChapterSeven;

public class Example_first {
    public static void main(String[] args){

        int [] response =  {1 , 3 , 5 ,2 , 1, 5 , 4 ,4 ,3, 6 ,8, 1 , 2, 3 , 4 ,5 , 2 ,3 ,1, 1, 5, 6 , 10};
        int [] frequency = new int[6];

        for(int answer = 0; answer < response.length; answer++){

            try {
                ++frequency[response[answer]];
                //where does it store the numbers it is incrementing in the frequency array
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf(" response[%d] = %d%n%n" , answer , response[answer]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for(int rating = 1; rating < frequency.length; rating++)
        {
            System.out.printf("%6d%10d%n" , rating , frequency[rating]);
        }
    }
}
