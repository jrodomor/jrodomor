package Figures;

import java.util.Map;

    public class Square {
        double side;

        public Square(double s) {
            side = s;
        }

        public Square(){
            side = 0;
        }
        public void setSide(double s){
            side = s;
        }

        public double getSide(){
            return side;
        }

        public double getDiagonal(){
            return(Math.sqrt(side*side*2));
        }
        public double getSquare(){
            return side * side;
        }
    }

