package com.shapes.rectangle;

public class Rectangle
{
    public double calculateArea(double length, double width)
    {
        double area;
        area =length * width;
        return area;
    }

    public double calculatePerimeter(double length, double width)
    {
        double perimeter;
        perimeter = 2 *(length+width);
        return perimeter;
    }
}
