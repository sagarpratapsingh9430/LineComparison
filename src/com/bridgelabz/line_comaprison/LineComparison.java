package com.bridgelabz.line_comaprison;


class Point{
    float x;
    float y;
}

class Line{
    Point ep1;
    Point ep2;

    float calculateLength(){
        //return (float) Math.sqrt((ep1.x-ep2.x)*(ep1.x-ep2.x) + (ep1.y-ep2.y)*(ep1.y-ep2.y));
        return (float) Math.sqrt(Math.pow(ep1.x-ep2.x,2) + Math.pow(ep1.y-ep2.y,2));
    }
}
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Line l1=new Line();
        l1.ep1=new Point();
        l1.ep1.x=1;
        l1.ep1.y=2;

        l1.ep2=new Point();
        l1.ep2.x=10;
        l1.ep2.y=20;


        Float length1 = l1.calculateLength();
        System.out.println("Length1 = "+length1);


        Line l2=new Line();
        l2.ep1=new Point();
        l2.ep1.x=2;
        l2.ep1.y=4;

        l2.ep2=new Point();
        l2.ep2.x=20;
        l2.ep2.y=40;

        Float length2 = l2.calculateLength();
        System.out.println("Length2 = "+length2);
    }
}
