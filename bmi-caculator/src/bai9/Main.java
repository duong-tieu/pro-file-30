package bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("your weight (in kg):");
        weight= scanner.nextDouble();

        System.out.println("your height (in m) :");
        height= scanner.nextDouble();
        bmi = weight/(height*2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "underweight");
         else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "normal");
         else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "overweight");
         else
            System.out.printf("%-20.2f%s",bmi,"obese");
    }
}