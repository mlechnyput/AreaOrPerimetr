package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Length :");
        int length= input.nextInt();
        System.out.print("Width  :");
        int width= input.nextInt();
        Rectangle rectangle = new Rectangle(length,width);
        rectangle.meth();
    }
}
