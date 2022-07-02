package testPackage;

import java.util.Scanner;

public class TestClass1 {

    public static void main(String[] args) {

        String name;
        System.out.println("What's your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello" + " " + name);

    }



}
