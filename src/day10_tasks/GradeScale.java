package day10_tasks;

import java.util.Scanner;

public class GradeScale{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score: ");
        double grade = input.nextDouble();

        if (grade>=85 && grade<=100){
            System.out.println("Your grade is 'A'");
        }else if (grade>=70 && grade <= 84){
            System.out.println("You grade is 'B'");
        }else if (grade>=55 && grade<69){
            System.out.println("Your grade is 'C'");
        }else if (grade>=40 && grade<=54){
            System.out.println("Your grade is 'D'");
        }else if (grade<40){
            System.out.println("Your grade is 'F'");
        }else{
            System.out.println("Invalid entry");
        }







    }
}
