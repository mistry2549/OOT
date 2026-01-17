package test1.test21;

public class Main {
   
    public static void main(String[] args) {
        Company myCompany = new Company();

        
        FullTimeEmployee dev = new FullTimeEmployee("Steve", "F001", 50000);
        
        
        Freelancer graphic = new Freelancer("Job", "L001", 500, 100);

     
        myCompany.addEmployee(dev);
        myCompany.addEmployee(graphic);

       
        myCompany.reportplaroll();
    }
}

