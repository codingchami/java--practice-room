package OOP;

class Vehicle {
    protected String brand = "BMW";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}
public class Inheritance extends Vehicle{
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();

        inheritance.honk();

        System.out.println(inheritance.brand+" "+inheritance.modelName);
    }
}
