package oot.b6709624.week10.lab.lab1;
import java.util.Scanner;
class Person {
    private String fullname;
    private Phone phone;
    

    public Person(String fullname, Phone phone){
        this.fullname = fullname;
        this.phone = phone;
    }
    
    public void displayInfo(Scanner sc){
        System.out.print("Enter the password of \"" + phone.getphoneNumber() + "\": ");
        
        String inputPassword = sc.nextLine();

        if (inputPassword.equals(phone.getpassword())) {
           
            System.out.println("Full Name: " + fullname);
            
            System.out.println("Phone: " + phone.getMaskedPhoneNumber());
        } else {
            
            System.out.println("You don't have permission to access the phone data");
        }
    } 
}
