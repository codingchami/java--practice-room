package OOP_Anju.Polymorphism;

/*class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat sound");//now its strat the method overriding,different classes,same name,same parameters
    }
}

//method overriding --different classes,same name,same parameters
//method overloading --same class,same name,different parameters

public class Example {
    public static void main(String[] args) {
        Cat c = new Cat(); //here we can access subclass instance through super class things
        c.sound(); //Animal Sound
    }
}*/

class A{
    public void print(){
        System.out.println("Print A");
    }
}
class B extends A{
    public void print(){
        System.out.println("Print B");
    }
//    public void print(int i){}
//}
    public void callPrint(){
        print(); //from subclass
        super.print(); //from super class
    }
}

public class Example{
    public static void main(String[] args) {
        B b = new B();
        b.print(); //method overriding --(it happens on runtime)
//        b.print(10);//method overloading --(it happens on compile time)
    }
}