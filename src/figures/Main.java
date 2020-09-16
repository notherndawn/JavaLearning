package figures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<String> givenList = Arrays.asList("circle", "triangle", "rectangle");
        List<Shape> figures = new ArrayList<>();
        int numberOfElements = 10;

        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = rand.nextInt(givenList.size());
            String randomElement = givenList.get(randomIndex);
            switch (randomElement){
                case "circle":
                    figures.add(new Circle());
                    break;
                case "triangle":
                    figures.add(new Triangle());
                    break;
                case "rectangle":
                    figures.add(new Rectangle());
                    break;
            }

        }
        System.out.println("Max perimeter:\n" + getMaxPerimeter(figures).getInfo());
        System.out.println("Min perimeter:\n" + getMinPerimeter(figures).getInfo());

    }

    static Shape getMaxPerimeter(List<Shape> figures){
        Shape maxFigure = null;
        double max = 0;
        for (Shape f: figures) {
            double perimeter = f.getPerimeter();
            if(perimeter > max){
                max = perimeter;
                maxFigure = f;
            }
        }
        return maxFigure;
    }

    static Shape getMinPerimeter(List<Shape> figures){
        Shape maxFigure = null;
        double min = figures.get(0).getPerimeter();
        for (Shape f: figures) {
            double perimeter = f.getPerimeter();
            if(perimeter < min){
                min = perimeter;
                maxFigure = f;
            }
        }
        return maxFigure;
    }
}
