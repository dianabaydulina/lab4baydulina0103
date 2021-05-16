package com.example.lab4baydulina0103.lab4_2;


    public class Square extends Shape {

        private double side;

        public Square(){
            side = 4.3;
        }

        public Square(double side){
            this.side = side;
        }

        public Square (double side, String color, boolean filled){
            super(color, filled);
            this.side = side;
        }

        public double getSide(){
            return this.side = side;
        }

        public void setSide(double side){
            this.side = side;
        }

        public void setWidth(double side){
            this.side = side;
        }

        public void setLength(double side){
            this.side = side;
        }

        @Override
        public double getArea(){
            return side * side;
        }

        public String toString(){
            return "Квадрат цвета: " + getColor() + ", длиной: " + getSide() + ", шириной: "+ getSide() + ", заполненна:  " + isFilled();
        }
    }

