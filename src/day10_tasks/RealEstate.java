package day10_tasks;
/*		We are buying a house
        ask the user for their budget (single number, max)

        	Find the area that the user's budget fits into and provide all the information of the neighborhoodname -
        	Hills
            		average price - 80,000 - 100,000
            		rating - 4.0
            		gated - no
            		allow pets - yes

            	name - Oaks
           		average price - 55,000 - 75,000
            		rating - 3.5
            		gated - no
            		allow pets - yes

            		name - Highland
            		average price - 120,000 - 150,000
            		rating - 4.5
            		gated - yes
            		allow pets - no

            		name - Canyon
            		average price - 160,000 - 201,000
            		rating - 4.8
            		gated - yes
            		allow pets - yes
        If the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget".
		If the budget is more than 300,000 print "Too much money for this agency"
        If the budget is no in any range print: "No available houses"

 */
import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your budget?: $" );
        double budget = input.nextDouble();
        String messageForHills = "\t\tPlace Name - Hills\n\t\taverage price - 80,000 - 100,000\n\t\trating - 4.0\n\t\tgated - no\n\t\tallow pets - yes";
        String messageForOaks = "\t\tPlace Name - Oaks\n\t\taverage price - 55,000 - 75,000\n\t\t rating - 3.5\n\t\t gated - no\n\t\t allow pets - yes";
        String messageForHighland = "\t\tPlace Name - Highland\n\t\taverage price - 120,000 - 150,000\n\t\t rating - 4.5\n\t\t gated - yes\n\t\t allow pets - no";
        String messageForCanyon = "\t\tPlace Name - Canyon\n\t\taverage price - 160,000 - 201,000\n\t\t rating - 4.8\n\t\t gated - yes\n\t\t allow pets - yes";
        if (budget<0) {
            System.out.println("Tts is not valid budget");

        } else if (budget>300_000) {
            System.out.println("Too much money for this agency");
        } else if (budget>=80_000 && budget<=100_000) {
            System.out.println(messageForHills);
        }else if (budget>=55_000 && budget<=75_000) {
            System.out.println(messageForOaks);
        }else if (budget>=120_000 && budget<=150_000) {
            System.out.println(messageForHighland);
        }else if (budget>=160_000 && budget<201_000) {
            System.out.println(messageForCanyon);
        }else {
            System.out.println("No available houses");
        }












    }
}
