package test1.test21;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee n){
        employees.add(n);
    }

    public void reportplaroll(){
        System.out.println("---------- PAYROLL REPORT ----------");
        double totalsalaryPaid = 0;
        double totalTaxCalculate = 0;
        for(Employee n : employees){
            double salary = n.calculataSalary();
            totalsalaryPaid += salary;
            System.out.print("ID: " + n.id + " | Name: " + n.name + " | Salary: " + salary);

            if(n instanceof Taxable){
                Taxable t = (Taxable) n;
                double tax = t.getTaxAmount();
                System.out.println(" | Tax: " + tax);
                totalTaxCalculate += tax;
            }else{
                System.out.println(" | Tax: 0.0 (Exempt)");
            }


        }
        System.out.println("------------------------------------");
        System.out.println("Total Salary: " + totalsalaryPaid);
        System.out.println("Total Tax: " + totalTaxCalculate);

        
    }
}
