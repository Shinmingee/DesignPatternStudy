package com.company.strategy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Shapes s = new Shapes();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rect rect = new Rect();
        
        triangle.draw();
        circle.draw();
        rect.draw();
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Triangle");
        arrayList.add("Circle");
        arrayList.add("Rect");
        arrayList.add("Triangle");

        for (int i=0; i <= arrayList.size(); ++i)
        {
            System.out.println(arrayList.get(i));
        }

    }

}


class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle!!!");
    }

}

class Rect implements Shape{

    @Override
    public void draw() {
        System.out.println("Rect!!!");
    }


}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle!!!");
    }

}