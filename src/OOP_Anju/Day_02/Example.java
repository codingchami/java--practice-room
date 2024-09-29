package OOP_Anju.Day_02;

class Value{
    int a;
    Value(int a){
        this.a = a;
    }
}

class ChangeValue{
    public static void increment(int a){
        a++;
    }
}

public class Example {
    public static void main(String[] args) {
        Value v1 = new Value(100);
    }
}
