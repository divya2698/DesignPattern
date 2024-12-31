package edu.neu.csye7374;


// Main class
public class AutoOrderingSystem {
    public static void demo() {
        // Create a base auto
        AutoAPI auto1 = new SportyCoupeAuto();

        // User Configuration 1: AC, AWD
        auto1 = new AllWheelDriveDecorator(new AirConditioningDecorator(auto1));

        System.out.println("User Configuration 1:");
        System.out.println("Price: $" + auto1.getPrice());
        System.out.println("Description: " + auto1.getDescription());
        System.out.println("===============");

        // User Configuration 2: AC, ABS, BDM
        AutoAPI auto2 = new SportyCoupeAuto();
        auto2 = new BlindSideDetectionMonitorDecorator(new AntiLockBrakingSystemDecorator(new AirConditioningDecorator(auto2)));

        System.out.println("User Configuration 2:");
        System.out.println("Price: $" + auto2.getPrice());
        System.out.println("Description: " + auto2.getDescription());
        System.out.println("===============");

        // User Configuration 3: AC, BB
        AutoAPI auto3 = new SportyCoupeAuto();
        auto3 = new BumperToBumperWarrantyDecorator(new AirConditioningDecorator(new AllWheelDriveDecorator(new AntiLockBrakingSystemDecorator(auto3))));

        System.out.println("User Configuration 3:");
        System.out.println("Price: $" + auto3.getPrice());
        System.out.println("Description: " + auto3.getDescription());
    }
}
