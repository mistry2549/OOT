package test1.test21;

public class Freelancer extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String name, String id, double hourlyRate, double hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculataSalary(){
        return hourlyRate * hoursWorked;
    }
}
