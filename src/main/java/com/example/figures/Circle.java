package main.java.com.example.figures;

import java.util.Formatter;

public class Circle implements Shape{
    double radius = Math.random()*1000;

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String getInfo() {
        Formatter formatter = new Formatter();
        formatter.format("This is circle with radius = %f. Perimeter = %f", radius, getPerimeter());

        return formatter.toString();
    }
}
