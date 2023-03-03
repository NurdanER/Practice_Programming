package day08_tasks;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter your favorite number:");
        long number = input.nextLong();
        boolean ifAge = age>=18 && age<=25;
        System.out.println("You are a student:" + "\n" +ifAge);









    }
}
