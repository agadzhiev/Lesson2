package Lesson3;

public class Task1 {
    public static void main(String[] args){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            }else {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }
    }
}
