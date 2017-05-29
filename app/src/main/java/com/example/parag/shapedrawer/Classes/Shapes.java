package com.example.parag.shapedrawer.Classes;

/**
 * Created by parag on 29/05/2017.
 */

public class Shapes {

    public String shapes;
    public  Rect objRect;
    public  Circle objCir;
    public Triangle triangle;
    public Ellipse ellipse;


    public Shapes(){ // Default constructor of Shapes
    }


    public static class Rect{
        public int x1,y1,x2,y2;
        public int l,w;
        float len, width;

        // Defining constructors
        public Rect(){}
        public Rect(int a1, int b1, int a2, int b2){
            x1=a1;y1=b1;x2=a2;y2=b2;
            l = x2-x1;
            w = y2-y1;
            len = (float) (l * 2.54 / 96); // Formula to convert pixels into cm
            width = (float) (w * 2.54 / 96);
        }

        // Calculating Area & Perimeter
        public float GetArea(){
            float area = (float) (len*width);
            return area;
        }
        public float getParam(){
            float param= (float) (2*(len+width));
            return param;
        }


    }

    public static class Circle{
        public int rad;
        float radius1;

        // Defining constructors
        public Circle(){}
        public Circle(int radius){
            rad=radius;
            radius1 = (float) (rad* 2.54 / 96);// Formula to convert pixels into cm
        }

        // Calculating Area & Perimeter
        public float getArea(){
            float area = (float) (3.14 *radius1*radius1);
            return area;
        }
        public float getParam(){
            float param= (float) (2*3.14*radius1);
            return param;
        }


    }
    public  static class Triangle{
        public int x1,x2,x3,y1,y2,y3;

        public Triangle(){}
        public Triangle(int a1, int b1, int a2, int b2, int a3, int b3){
            x1=a1; y1=b1; x2=a2; y2=b2; x3=a3; y3=b3;
        }

        public float getArea(){
            float area2 = (x1*y2)+(x2*y3)+(x3*y1)-(x1*y3)-(x2*y1)-(x3*y2);
            float area = (float) (-area2*2.54/96); // Formula to convert pixels into cm
            return area;    //reflecting a negative value :(
        }
    }

    public  static class Ellipse{
        public int x1,y1,x2,y2;
        float radius1, radius2;

        // Defining constructors
        public Ellipse(){}
        public Ellipse(int a1, int b1, int a2, int b2){
            x1=a1;y1=b1;x2=a2;y2=b2;
            int a = (y1-y2)/2;
            int b = (x1-x2)/2;
            radius1 = (float) (a* 2.54 / 96);// Formula to convert pixels into cm
            radius2 = (float) (b* 2.54 / 96);
        }

        // Calculating Area & Perimeter
        public float getArea(){
            float area = (float) (3.14 *radius1*radius2);
            return area;
        }

        public float getParam(){
            float param= (radius1*radius2);
            return param;
        }
    }

// Object declaration

    public Shapes(Rect objRect1){
        objRect = objRect1;
    }
    public Shapes(Circle objCircle){
        objCir = objCircle;
    }
    public Shapes(Triangle objTriangle){
        triangle = objTriangle;
    }
    public Shapes(Ellipse objEllipse){
        ellipse = objEllipse;
    }

}
