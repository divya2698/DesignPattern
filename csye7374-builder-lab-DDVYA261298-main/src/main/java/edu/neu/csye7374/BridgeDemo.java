package edu.neu.csye7374;

public class BridgeDemo {
    public static void  demo(){

        //Usage of ActivatePersonAPI with PersonAPI:
        System.out.println("ActivatePersonAPI with PersonAPI with PersonA");
        System.out.println("---------------------------------------------");
        
        PersonAPI personAPI = new Person();
        ActivatePersonAPI activatePersonAPI = new APerson( personAPI );
        activatePersonAPI.talk();
        System.out.println();
        System.out.println("AmbulatePersonAPI with PersonAPI with PersonB");
        System.out.println("---------------------------------------------");
        //Usage of AmbulatePersonAPI with PersonAPI:
        PersonAPI person1API = new Person();
        AmbulatePersonAPI ambulatePersonAPI = new BPerson(person1API);
        ambulatePersonAPI.play();
        ambulatePersonAPI.sleep();
        ambulatePersonAPI.eat();
        ambulatePersonAPI.talk();
        
        System.out.println();
        System.out.println("Usage of EmployeeAPI");
        System.out.println("--------------------");
        // Example usage:
        EmployeeAPI employee = new Employee();
        employee.setName("Harold");
        employee.setAge(23);
        employee.setWage(100.0);
        employee.setJob("Software Developer");

        CPerson person = new CPerson(employee);
        person.talk();
        person.play();
        person.sleep();
        person.eat();
        person.getJob();
        person.getWage();



    }
}
