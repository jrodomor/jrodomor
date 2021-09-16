package Figures;

public class Circle {
    final double PI = 3.14;
    double radius;
    public Circle(double r){
        radius = r;
    }
    public Circle(){
        radius = 0;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getSquare(){
        return PI * radius * radius;
    }
    public double getPI(){
        return PI;
    }

    public double getDiameter(){
        return radius * 2;
    }
    public  double getLength(){
        return 2 * PI * radius;
    }
}
