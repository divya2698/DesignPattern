package edu.neu.csye7374;

public class CPerson extends BPerson implements AmbulatePersonAPI{
    private EmployeeAPI employee;

    public CPerson(EmployeeAPI employee) {
        super(employee);
        this.employee = employee;
    }

    @Override
    public void play() {
        System.out.println(employee.getName() + " is playing");
    }
    @Override
    public void sleep() {
        System.out.println(employee.getName() + " is sleeping");
    }
    @Override
    public void eat() {
        System.out.println(employee.getName() + " is eating");
    }

    public void getJob(){
        System.out.println(employee.getName() + " job is "+employee.getJob());
    }
    public void getWage(){
        System.out.println(employee.getName() + " wage is "+employee.getWage());
    }

}
