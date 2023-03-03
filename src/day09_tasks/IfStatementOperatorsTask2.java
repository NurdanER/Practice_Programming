package day09_tasks;

import java.util.Scanner;

public class IfStatementOperatorsTask2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("What is your salary: $");
        int salary = input.nextInt();
        System.out.println("You are a full time employee ? ");
        boolean fullTime = input.nextBoolean();

        if (fullTime ) {
            salary = salary + 20000;
        } else {
            salary = salary - 5000;
        }
        System.out.println("This is your final salary : $" + salary);








    }
}
