package Lesson2;

public class HomeWork2 {
    public class main{
         Sum(10,2);

    }

    public static void Sum(int a, int b) {

        int sum = a + b;

        if (sum > 10 && sum <= 20){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void NewDigit(int c){
        if (c < 0) {
            System.out.println("Число" + c+ " отрицательное");
        }else {
            System.out.println("Число" + c+ " положительное");
        }
    }

    public static void NewDigit2(int d){
        if (d < 0) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void CountOfStrings( String s, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }

    }
}

