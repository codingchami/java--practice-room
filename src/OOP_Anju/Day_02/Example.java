package OOP_Anju.Day_02;

//class Value{
//    int a;
//    Value(int a){
//        this.a = a;
//    }
//}
//
//class ChangeValue{
//    public static void increment(Value v){
//        v.a++;
//    }
//}
//
//public class Example {
//    public static void main(String[] args) {
//        Value v1 = new Value(100);
//        System.out.println(v1.a);
//
//        ChangeValue.increment(v1); //method call by reference
//        System.out.println(v1.a);
//    }
//}

//********************************************************************************************************
//class Dog{
//    String name;
//    int age;
//
//    Dog(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public Dog getCopy(){
//        return this;  //its returns the object when currently running one
//    }
//}
//
//
//
//public class Example{
//    public static void main(String[] args) {
//        Dog d1 = new Dog("Tommy",2);
//        Dog d2 = d1.getCopy(); //create the new reference varibale and store the object what returns by getCopy method
//        System.out.println(d1==d2);
//    }
//}

//********************************************************************************************************
//class Customer{
//    private String name;
//    private double salary;
//
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setSalary(double salary){
//        if(salary>0){
//            this.salary = salary;
//        }else{
//            this.salary = -salary;
//        }
//    }
//
//    public String getName(){
//        return this.name;
//    }
//    public double getSalary(){
//        return this.salary;
//    }
//}
//
//public class Example{
//    public static void main(String[] args) {
//        Customer c1 = new Customer();
//        c1.setName("Nimal");
//        c1.setSalary(500000);
//
//        System.out.println(c1.getName()+":"+c1.getSalary());
//
//    }
//}


//********************************************************************************************************


//class Myclass{
//    int x; //Instance attribute
//    static int y; //static variable,template variable,class variable
//}
//
//public class Example{
//    public static void main(String[] args){
//        Myclass c1 = new Myclass();
//        c1.x = 1;
//        c1.y = 2;
//
//        Myclass c2 = new Myclass();
//        c2.x = 10;
//        c1.y = 20;
//
//        Myclass c3 = new Myclass();
//        c3.x = 100;
//        c1.y = 200;
//
//        System.out.println("C1 :"+c1.x+" "+c1.y);  //1,200
//        System.out.println("C2 :"+c2.x+" "+c2.y);  //10,200
//        System.out.println("C3 :"+c3.x+" "+c3.y);  //100,200 //static variables load in to the class only once..(so..Static members are indepent on the object.)
//
//
//
//    }
//}


//********************************************************************************************************

//class Myclass{
//    int x = 100; //Instance attribute
//    static int y = 200; //static variable,template variable,class variable
//}
//
//public class Example{
//    public static void main(String[] args){
//        System.out.println(Myclass.y); //200  //only stataic members can access throughr the call by class name
//        System.out.println(Myclass.x);  //ERROR

//        Myclass c1 = new Myclass();
//        System.out.println(c1.y); //200
//        System.out.println(c1.x); //100

//        Myclass c = null;
//        System.out.println(c.y);//200
//        System.out.println(c.x); //Nullpoint exception
//    }
//}


//********************************************************************************************************

class Customer{
    int id;
    String name;

    Customer(){}

    Customer(int id,String name){
        this.id = id;
        this.name = name;
    }
}

public class Example{
    public static void main(String[] args) {
//        Customer c1 = new Customer();

        new Customer().id = 123455678;
        new Customer().name = "Kamal"; //Annonymous object(it takes the minimum space of the ram)& after the related work JVM it removes.

    }
}






