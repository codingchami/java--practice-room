package OOP_Anju.Day_01;

class Box{
    int width;
    int height;
    int length;

    public Box(){

    }

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setSize(int length, int width, int height){
        length = length;
        width = width;
        height = height;
    }

//    public void printVolume(){
//        int volume;
//        volume = length*width*height;
//        System.out.println("Volume is : "+volume);
//    }
//    public void printArea(){
//        int area;
//        area = 2*length*width+2*length*height+2*width*height;
//        System.out.println("Area of the box is : "+area);
//
//    }

    public int getVolume(){
        int volume = length*width*height;
        return volume;
    }


}

public class Example{
    public static void main(String[] args) {

//        Box b1 = new Box();
//        b1.setSize(5,3,2);
//
//        System.out.println("Volume of the box is "+b1.getVolume());
//        b1.printVolume();
//        b1.printArea();

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


        Box bs = new Box();
        System.out.println(bs);



    }
}
