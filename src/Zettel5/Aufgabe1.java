package Zettel5;

import java.util.Arrays;

public class Aufgabe1 {

    public static float getMinimum(float[] numbers){
        float a =Integer.MAX_VALUE;
        for(float c:numbers) {
            a=c<a?c:a;
        }

        System.out.println(a);

        return a;
    }

    public static float getMaximum(float[] numbers){
        float a = Integer.MIN_VALUE;
        for(int i =0; i< numbers.length; i++){
            if(numbers[i] > a){
                a = numbers[i];
            }
        }
        System.out.println(a);
        return a;
    }


    public static void main(String[] args) {
        float [] numbers= {10f,10.2f,1.2f,1.1f,0.7f,6,5,2};
       getMaximum(numbers);
        Recursive r = new Recursive ();


    }
}
