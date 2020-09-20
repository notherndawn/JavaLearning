package main.java.com.example.tanks;

public class TankFactory {
    public static Tank createTank(Country country){
        switch(country){
            case USA:
                return new Abrams();
            case RUSSIA:
                return new T34();
            default:
                throw new IllegalArgumentException("Wrong country!");
        }
    }
}
