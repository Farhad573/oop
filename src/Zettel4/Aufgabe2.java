package Zettel4;

import java.util.ArrayList;

public class Aufgabe2 {
    public static void main(String[] args) {
        //System.out.println(toBinary(66));
       // toOctal(16);
       // System.out.println(toTwosComplement(20));
        System.out.println(Integer.toBinaryString(( 20 & 0xFF) + 256).substring(1));
    }
    public static String findsecondComplement(int number){
        int remaingZero = 8 - toBinary(number).length();
        String binary = "0".repeat(remaingZero) + toBinary(number);
        String result = "";
        int index = binary.length() - 1;
        for(int i =binary.length() - 1; i >= 0; i-- ){
            if(binary.charAt(i)== '1' ) {
                index--;
                result = 1 + result;
                break;
            }
            else {
                index--;
                result = binary.charAt(i) + result;
            }
        }
        for(int j = index; j >= 0; j--){
            if(binary.charAt(j) == '1'){
                result = 0 + result;
            }else
                result = 1 + result;
        }


        return result;
    }

    private static String toTwosComplement(int number) {
        String result = "";


        if(number > 0){
            return findsecondComplement(number);
        }
        else {
            int index = 8 - toBinary(number * -1).length();
            return result = "0".repeat(index) + toBinary(number * -1) + result;

        }


    }
//public static String toTwosComplement(int n) {
//    if (n < -128 || n > 127) {
//        System.out.println("Number out of bounds [-128,127]");
//        return "";
//    }
//    if (n >= 0) {
//        String twoCompBinary = toBinary(n);
//        while (twoCompBinary.length() < 8) {
//            twoCompBinary = "0" + twoCompBinary;
//        }
//        return twoCompBinary;
//    } else {
//        String twoCompBinary = toBinary(256+n);
//        return twoCompBinary;
//    }
//}

    private static String toOctal(int number) {
        if (number < 0) {
            System.out.println("toBinary only takes positive numbers :(");
            return "";
        }
        String result = "";
        while(number > 0){
            result = number%8 + result;
            number = number/8;
        }

        return result;

    }

    public static String toBinary(int number) {
        if (number <0) {
            System.out.println("toBinary only takes positive numbers :(");
            return "";
        }
        String result = "";
        while(number > 0){
            result = number%2 + result;
            number = number/2;
        }



        return result;
    }
}
