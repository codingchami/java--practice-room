package OOP;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class person {
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username:");
        String userName = scanner.nextLine();
        System.out.println("Username is: "+userName);

    }
}

final class Vehicle{

}


