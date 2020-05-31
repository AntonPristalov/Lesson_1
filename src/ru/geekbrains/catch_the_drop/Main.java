package ru.geekbrains.catch_the_drop;

public class Main {

    public static void main(String[] args) {
        //  calc(1, 2, 3, 4);
        //range(13, 21);
        //  positive(0);
      //  negative(-4);
       // name("Igor");



    }

    //3
    public static int calc(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //4
    public static boolean range(int a, int b) {
        int sum = a + b;
        boolean b1 = 10 <= sum;
        boolean b2 = sum <= 20;
        boolean b3 = b1 && b2;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        return 10 <= sum && sum <= 20;
    }

    //5
    public static void positive(int number) {
        if (number >= 0) {
            System.out.println(number + "ok");
        } else {
            System.out.println(number + "not ok");
        }
    }

    //6

    public static boolean negative(int number1) {
        if (number1 < 0){
            return true;
        } else {
            return false;
        }
    }
//7
    public static void name(String name){
        System.out.println("Привет," + name);
    }

}







