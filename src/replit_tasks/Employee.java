package replit_tasks;

public class Employee {

    public static void main(String[] args) {

        String firstName = "Noah";
        String lastName = "Smith";
        String companyName = "Apple";
        int baseSalary = 200000;
        int startDay = 10;
        byte startMonth = 1;
        short startYear = 2022;
        boolean areTheyFullTime = true;
        String jobTittle = "SDET";
        String officeAdress = "One Apple Park Way, Cupertino,CA 95014";



        String fullName = firstName + " " + lastName;
        String fullStartDate = startMonth + "/" + startDay + "/" + startYear;
        String email = firstName + startDay + "@" +companyName + ".com";
        double salaryAfter2Years = baseSalary * 1.15;


        System.out.println("Employee Information");
        System.out.println("We have " + fullName + " joining " + companyName);
        System.out.println(firstName + "will start on " + fullStartDate + " as full time: " + areTheyFullTime);
        System.out.println(firstName + " here is some information about your employment");
        System.out.println("Your email is " + email);
        System.out.println("Your base salary is $" + baseSalary + "and after 2 years it will be $" + salaryAfter2Years);
        System.out.println("Welcome aboard, see you at " + officeAdress);
    }
}
