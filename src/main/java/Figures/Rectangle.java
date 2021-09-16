package Figures;

public class Rectangle {
    double side1;
    double side2;
    public Rectangle(double a, double b){
        side1 = a;
        side2 = b;
    }
    public Rectangle(){
        side1 = 0;
        side2 = 0;
    }
    public void setSide1(double side){
        side1 = side;
    }
    public void setSide2(double side){
        side2 = side;
    }
    public String getSides(){
        return (side1 + " " + side2);
    }
    public double getSquare(){
        return side1 * side2;
    }
    public double getDiagonal(){
        return Math.sqrt(side1 * side1 + side2 * side2);
    }
}
