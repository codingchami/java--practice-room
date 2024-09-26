package OOP_Anju;

class Box{
    int width;
    int height;
    int length;


}

public class Encapsulation {
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.setSize(5,3,2);
        b1.printVolume();
        b1.printArea();

//        int length;
//        int width;
//        int height;
//
//        length = 3;
//        width = 5;
//        height = 3;
//
//        int volume;
//        volume = length*width*height;
//        System.out.println("Volume of the box is :"+ volume);
//
//        int area;
//        area = 2*length*width+2*length*height+2*width*height;
//        System.out.println("Area of the box is :"+area);



    }
}
