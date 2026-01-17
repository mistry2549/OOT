package test1.test21;

public abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id){
        this.name = name;
        this.id = id;
    }

    public abstract double calculataSalary();
}
