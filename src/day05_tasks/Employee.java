package day05_tasks;

public class Employee {

    public static void main(String[] args) {

   String firstName = "Nurdan";
   String lastName = "Erdogan";
   String companyName = "Meta";
   long salary = 1_100_000L;
   int startDay = 5;
   byte startMonth = 9;
   short startYear = 2023;
   boolean areTheyFullTime = true;
   String jobTittle = "Software Development Engineer in Test";
   String officeAdress = "Menlo Park, CA";

   String fullName = firstName + " " + lastName;
   String fullStartDate = startMonth + "/" + startDay + "/" + startYear;
   String email = firstName + startDay + "@meta.com";
   long salaryAfter3years = salary + 26000 + 26000;

       System.out.println("Employee Information" +"\n\nFull Name:\t\t\t\t" + fullName + "\nStart Date:\t\t\t\t" + fullStartDate + "\nEmail:\t\t\t\t\t" + email +
               "\nSalary After 3 years:\t" +"$" + salaryAfter3years + "\nAre They Full Time:\t\t" + areTheyFullTime + "\nJob Tittle:\t\t\t\t" + jobTittle +
               "\nOffice Adress:\t\t\t" +officeAdress);























    }

}
