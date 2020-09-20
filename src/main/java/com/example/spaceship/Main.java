package main.java.com.example.spaceship;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer first = input.nextInt();
        Integer second = input.nextInt();
        Integer third = input.nextInt();
        Spaceship galaxy = new Spaceship(first);
        Spaceship aurora = new Spaceship(second);
        Spaceship tanos = new Spaceship(third);

        System.out.println(averageSpeed(galaxy.getSpeed(), aurora.getSpeed(), tanos.getSpeed()));
        System.out.println(minSpeed(galaxy.getSpeed(), aurora.getSpeed(), tanos.getSpeed()));
    }

    private static long averageSpeed(int a, int b, int c){
        long resultSpeed = ((long)a + (long)b + (long)c)/3;
        return resultSpeed;
    }

    private static long minSpeed(int a, int b, int c){
        long resultSpeed = Math.min(c,Math.min(a,b));
        return resultSpeed;
    }
}
