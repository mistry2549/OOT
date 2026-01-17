package test1.test21;

public class Main {
   
    public static void main(String[] args) {
        Company myCompany = new Company();

        try{
            FullTimeEmployee dev = new FullTimeEmployee("Steve", "F001", 50000);
            myCompany.addEmployee(dev);
            System.out.println("Adding bad employee...");
            FullTimeEmployee badGuy = new FullTimeEmployee("Hacker", "X99", -9999);
            myCompany.addEmployee(badGuy);


        }catch(InvalidSalaryException e){
            System.err.println("Caught Exception: " + e.getMessage());

        }

       
        myCompany.reportplaroll();
    }
}

