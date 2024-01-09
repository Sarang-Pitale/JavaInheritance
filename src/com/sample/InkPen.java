package com.sample;

public class InkPen extends Pen{
    int nip;

    void write(String color) {
        inkColor=color;
        super.write("green");
        System.out.println(super.inkColor);
        System.out.println("I am writing with " + inkColor + " color using InkPen");
    }
}
