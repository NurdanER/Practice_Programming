package day05_tasks;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "James";
        String lastName = "Bond";
        char gender = 'M';
        int age = 40;
        String companyName = "MI6";
        boolean areTheFullTime = true;
        String jobTittle = "Special Agent";
        long salary = 1000000L;
        int numberOfPto = 15;
        boolean areTheyMarried = false;
        char suite = 'D';

        System.out.println("First Name: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("company name: " + companyName);
        System.out.println("fullTime: " + areTheFullTime);
        System.out.println("Job Tittle: " + jobTittle);
        System.out.println("Salary: " + "$" + salary);
        System.out.println("Number Of Pto: " + numberOfPto);
        System.out.println("Married: " + areTheyMarried);
        System.out.println("Suite: " + suite);

        System.out.println();

        System.out.println("Employment information for " +firstName + " " + lastName + "\nGender: " + gender +
                "\nSpecial Agent at " + companyName + "\nCurrently " + age + " years old" + "\nMI6 is located in suite " + suite + "\nThis years salary comes to " + "$" + salary +
                "\nOther details: " + "\n\t\tPTO: " + numberOfPto + "\n\t\tFull Time? " + areTheFullTime + "\n\t\tMarried? " + areTheyMarried);







    }
}
