package OOP_Anju.Polymorphism;

class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat sound");
    }
}

public class Example {
    public static void main(String[] args) {
        Cat c = new Cat(); //here we can access sub class instance through super class things
        c.sound(); //Animal Sound
    }
}
