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


class Dog{
    String name;
    int age;

    Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Dog getCopy(){
        return this;  //its returns the object when currently running one
    }
}



public class Example{
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy",2);
        Dog d2 = d1.getCopy(); //create the new reference varibale and store the object what returns by getCopy method
        System.out.println(d1==d2);
    }
}
