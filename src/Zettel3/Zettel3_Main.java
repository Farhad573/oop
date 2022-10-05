package Zettel3;

public class Zettel3_Main {
    public static boolean isBetween(int value, int lower, int upper){
        if(value>= lower && value <= upper)
            return true;
        else
            return false;
    }

    public static int postage(int length, int width, int height, int weight) {
        int result = 0;
        if (isBetween(length, 140, 235) && isBetween(width, 90, 125)) {
            if (isBetween(height, 1, 2) && isBetween(weight, 1, 15)) {
                  result = 60;
            } else if (isBetween(height, 1, 5) && isBetween(weight, 1, 20)) {
                result = 80;
            } }
        else if (isBetween(length, 100, 235) && isBetween(width, 70, 125) && isBetween(height, 1, 10) && isBetween(weight, 1, 50)) {
            result = 95;
            }
        else if (isBetween(length, 100, 353) && isBetween(width, 70, 250)) {
                if (isBetween(height, 1, 20) && isBetween(weight, 1, 500)) {
                    result = 155;
                } else if (isBetween(height, 1, 50) && isBetween(weight, 1, 1000))
                    result = 270;
                }
                return  result;
            }


    public static double piIterative(int n){
        double result = 0;
        while(n >= 0){

            if(n ==0){
                result += Math.sqrt(12);
                n--;
            }
            else{
                result += (Math.sqrt(12)) * ((Math.pow((-1.0 / 3.0),n)) / (2 * n + 1));
                n--;
            }
        }
        return result;
    }

    public static double piRecursive(int n){
        if(n == 0){
            return Math.sqrt(12);

        }
        else
            return (Math.sqrt(12)) * ((Math.pow((-1.0 / 3.0),n)) / ((2 * n) + 1)) + piRecursive(n-1);
    }



    public static void main(String[] args) {
        //System.out.println(postage(200,200, 18 , 600));
        System.out.println(piIterative(10));
        System.out.println(piRecursive(10));
    }
}
