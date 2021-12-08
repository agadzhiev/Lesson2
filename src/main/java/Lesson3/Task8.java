package Lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};

        turnArr(arr1, 2);

    }

    private static void turnArr(int[] arr, int n) {

        if (n % arr.length > 0 ){
            shiftRight(arr, n);
        } else {shiftLeft(arr, n);}
        System.out.println(Arrays.toString(arr));

        }


    private static void shiftRight(int[] arr, int n) {


        for (int i = 0; i < n; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length-1; j >0 ; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }
    private static void shiftLeft(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1 ; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }

    }



}
