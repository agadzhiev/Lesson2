package Lesson3;

public class Task4 {

    public static void main(String[] args) {
        int [][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i]=1;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
