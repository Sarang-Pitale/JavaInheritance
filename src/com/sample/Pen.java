package com.sample;

class Pen { //Super class or parent class or base class
    String inkColor;
    Pen(){
        inkColor="Red";
    }
    void write(String color) {
        inkColor=color;
        System.out.println("I am writing with " + inkColor + " color using Pen");
    }



}

