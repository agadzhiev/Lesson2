package Lesson3;
import java.util.Random;

public class Task6 {

    private static final Random random = new Random();
    public static void main(String[] args) {
        //int[] arr = new int[10];
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println();

        for (int i = 0; i < arr.length-1; i++) {

            if (min > arr[i+1]){
                min = arr[i+1];
            }

        }

        for (int i = 0; i < arr.length-1; i++) {

            if (max < arr[i+1]){
                max = arr[i+1];
            }

        }
        System.out.println(min);
        System.out.println(max);

    }
}
