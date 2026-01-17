package test1.test21;

public class FullTimeEmployee extends Employee implements Taxable {
    public double salary;
    public FullTimeEmployee(String name, String id, double salary){
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculataSalary(){
        return this.salary;
    }

    @Override
    public double getTaxAmount(){
        return this.salary * 0.30;
    }



     
}
