package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen; // change to private

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }
}
