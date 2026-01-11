 package oot.b6709624.week10.lab.lab2;

 import java.util.Scanner;

 class Employee {
   private String fullName;
   private JobInfo jobInfo;

   public Employee(String fullName, JobInfo jobInfo){
       this.fullName = fullName;
       this.jobInfo = jobInfo;
   }
   
   public void verifyUser(Scanner sc) {
     int attempts = 0;
     boolean accessGranted = false;

     while (!accessGranted && attempts < 3) {
       System.out.print("Enter a password of \"" + fullName +"\": ");

       String inputPassword = sc.nextLine();
       attempts++;

       if(inputPassword.equals(jobInfo.getPassword())) {
         System.out.println("Full Name: " + fullName);
         System.out.println("Position: " + jobInfo.getPosition());
         System.out.println("Department: " + jobInfo.getMaskedDepartment());
         accessGranted = true;
       }else{
         if (attempts == 3){
           System.out.println("accrss Denied");
         }else{
           System.out.println("Invalid password. Try again.");
         }
       }
     }
   }
 }
