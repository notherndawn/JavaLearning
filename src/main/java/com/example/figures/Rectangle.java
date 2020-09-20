package main.java.com.example.figures;

import java.util.Formatter;

public class Rectangle implements Shape{
    double a = Math.random()*1000;
    double b = Math.random()*1000;

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String getInfo() {
        Formatter formatter = new Formatter();
        formatter.format("This is rectangle with a = %f; b = %f. Perimeter = %f", a, b, getPerimeter());

        return formatter.toString();
    }
}
