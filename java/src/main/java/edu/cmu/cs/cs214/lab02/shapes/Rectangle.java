package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height; // change to private
    private double width; // change to private
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
}
