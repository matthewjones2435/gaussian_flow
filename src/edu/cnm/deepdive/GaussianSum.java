package edu.cnm.deepdive;

import java.util.Scanner;

public class GaussianSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upperLimit;

        upperLimit = -1;
        long sum;
        String invalidInput;
        
        invalidInput = "Invalid input! Please try a number between 1 and 1000000";
        while (upperLimit < 1 || upperLimit > 1000000) {
            upperLimit = input.nextInt();
            if (upperLimit < 1 || upperLimit > 1000000) {
                System.out.println(invalidInput);
            }
        }
        sum = (long) upperLimit * (upperLimit + 1) / 2;
        String info;
        
        info = "The sum of 1 to ";
        String is;
        
        is = " is ";
        System.out.println(info + upperLimit + is + sum);
    }
}
