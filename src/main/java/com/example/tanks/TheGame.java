package main.java.com.example.tanks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TheGame {
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) {
        runGame();
    }

    static void runGame() {
        Tank abrams = TankFactory.createTank(Country.USA);
        Tank t34 = TankFactory.createTank(Country.RUSSIA);

        while (abrams.getAmmo() > 0 && t34.getAmmo() > 0) {
            abrams.tankFire();
            t34.tankFire();
        }

        String hero = "";
        if (abrams.getAmmo() + t34.getAmmo() == 0) {
            hero = "НИЧЬЯ!";
        } else {
            hero = t34.getAmmo() > 0 ? "Win Russia!" : "Win USA";
        }
        logger.info(hero);
    }

}
