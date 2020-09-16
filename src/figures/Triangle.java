package figures;

import java.util.Formatter;

public class Triangle implements Shape{
    double a = Math.random()*1000;
    double b = Math.random()*1000;
    double c = Math.random()*1000;

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String getInfo() {
        Formatter formatter = new Formatter();
        formatter.format("This is triangle with a = %f; b = %f; c = %f. Perimeter = %f", a, b, c, getPerimeter());

        return formatter.toString();
    }
}
