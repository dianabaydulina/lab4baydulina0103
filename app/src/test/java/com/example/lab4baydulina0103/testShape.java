package com.example.lab4baydulina0103;

import com.example.lab4baydulina0103.lab4_1.Circle;
import com.example.lab4baydulina0103.lab4_1.Rectangle;
import com.example.lab4baydulina0103.lab4_1.Shape;
import com.example.lab4baydulina0103.lab4_1.Square;

import org.junit.Test;


public class testShape {
    @Test
    public void TestShape(){

        Shape s1 = new Shape();
        System.out.println("S1 = " + s1);

        Circle c1 = new Circle();
        System.out.println("C1 = " + c1);

        Rectangle r1 = new Rectangle();
        System.out.println("R1: " + r1);

        Square square1 = new Square();
        System.out.println("square1 = "+ square1);
    }
}