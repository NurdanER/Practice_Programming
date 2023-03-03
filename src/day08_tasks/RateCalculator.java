package day08_tasks;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a salary $ ");
        double salary = input.nextDouble();

        System.out.print("Enter weekly hours ");

        double weeklyHour = input.nextDouble();
        double hourlyRateOfEmployee = salary / (weeklyHour * 52);

    System.out.println("Hourly rate of the employee: " + "$" + hourlyRateOfEmployee);








    }





}
