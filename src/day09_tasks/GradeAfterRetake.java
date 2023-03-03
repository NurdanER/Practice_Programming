package day09_tasks;

import java.util.Scanner;

public class GradeAfterRetake {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Put your score: ");
        int score = input.nextInt();
        System.out.println("Which attempt is this to take the test?");
        int attempt = input.nextInt();
        double firstAttempt = score - (score * 0.10);
        double secondAttempt = score - (score * 0.20);
        double thirdAttempt = score - (score * 0.35);

        if (attempt ==1) {
            System.out.println("After the second retake attempt , your score is: " + firstAttempt);
        }
        if (attempt==2) {
            System.out.println("After the second retake attempt , your score is: " + secondAttempt);
        }
        if (attempt==3) {
            System.out.println("After the second retake attempt , your score is: " + thirdAttempt);
        }


    }

        }


