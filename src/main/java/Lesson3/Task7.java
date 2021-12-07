package Lesson3;

import org.w3c.dom.ls.LSOutput;

public class Task7 {
    public static void main(String[] args) {
        int [] arr1 = {5,5,5,5};
        checkBalance(arr1);

    }

    private static void checkBalance(int[] arr) {
        int SIZE = arr.length;
        int sum = 0;
        for( int num : arr) {
            // суммирование каждого элемента массива
            sum = sum + num;
        }
        int leftsum = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (leftsum==(sum-leftsum)){
                System.out.println(true);
                break;
            }
            else {
                leftsum = leftsum + arr[i+1];
            }
        }


    }
}
