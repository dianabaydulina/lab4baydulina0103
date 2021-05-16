package com.example.lab4baydulina0103.lab4_2;

public abstract class Shape {

    private String color;
    private boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }


    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public abstract double getArea();

    @Override
    public String toString(){
        return "Фигура цвета: " + color + ", заполнена: " + filled;
    }
}
