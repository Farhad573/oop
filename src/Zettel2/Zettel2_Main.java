package Zettel2;

public class Zettel2_Main {
    public static void snackMachine(int money){
        int result = money - 72;

        System.out.println(result);
        System.out.println("the return money will be: ");
        while(result >= 0){


            while (result  >= 200) {
                result -= 200;
                System.out.println("2 euros");
            }

            while (result  >= 100) {
                result -= 100;
                System.out.println("1 euro");
            }

            while (result  >= 50) {
                result -= 50;
                System.out.println("50 cent");
            }

            while (result  >= 20) {
                result -= 20;
                System.out.println("20 cent");
            }


            while (result  >= 10) {
                result -= 10;
                System.out.println("10 cent");
            }

            while (result  >= 5) {
                result -= 5;
                System.out.println("5 cent");
            }

            while (result  >= 2) {
                result -= 2;
                System.out.println("2 cent");
            }


            while (result  >= 0) {
                result -= 1;
                System.out.println("1 cent");
            }

        }

    }
    public static void main(String[] args) {
        snackMachine(500);
    }
}
