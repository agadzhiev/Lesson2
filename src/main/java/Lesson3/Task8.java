package Lesson3;

public class Task8 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};

        turnLeft(arr1, 2);

    }

    private static void turnLeft(int[] arr, int n) {
        int c = arr[0];
        int b = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (i+n <= arr.length)
            {b = arr[i+n];
            arr[i+n]= c;
            c = b;}
                //System.out.print(arr[i+n]);}
            else{arr[i] = arr[arr.length - 1];
            }

        }

    }
}
