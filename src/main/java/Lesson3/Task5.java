package Lesson3;

public class Task5 {
    public static void main(String[] args) {
        getArr(4, 7);

    }

    private static void getArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }

    }
}
