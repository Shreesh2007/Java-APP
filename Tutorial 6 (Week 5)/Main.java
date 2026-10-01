class Vehicle{
    protected int vehicleno;
    protected String brand;
    protected int speed;

    void displayDetails(){
        System.out.println("The Vehicle Number is: " + vehicleno);
        System.out.println("The Vehicle Brand is: " + brand);
        System.out.println("The Vehicle Speed is: " + speed);
    }
}

class Car extends Vehicle{
    int noofdoors;

    @Override void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleno);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Number of Doors: " + noofdoors);
    }
}

class Bike extends Vehicle{
    boolean hasGear;

    @Override void displayDetails(){
        System.out.println("Vehicle Number: " + vehicleno);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Main {  
    public static void main(String[] args){
    Car c = new Car();
    c.vehicleno = 101;
    c.brand = "Toyota";
    c.speed = 120;
    c.noofdoors = 4;
    
    Bike b = new Bike();
    b.vehicleno = 102;
    b.brand = "Honda";
    b.speed = 100;
    b.hasGear = true;

    Vehicle v;
    v = c;
    v.displayDetails();
    System.out.println();
    v = b;
    v.displayDetails();
}
}