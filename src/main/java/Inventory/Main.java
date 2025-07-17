package Inventory;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan("1HGCM82633A123456", "Honda", "Accord", 35000);
        Car suv = new UtilityVehicle("2FMDK4KC0DBA98765", "Ford", "Edge", 50000, true);
        Car truck = new Truck("3D7KU28C63G123456", "Dodge", "Ram", 60000, 10000);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}

