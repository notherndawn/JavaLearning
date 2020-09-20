package main.java.com.example.tanks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class T34 implements Tank{
    private static final Logger logger = LogManager.getLogger(T34.class);
    private int ammo = 5;
    @Override
    public void tankFire() {
        if(ammo > 0){
            logger.info("Огонь!");
            --ammo;
        }
        else{
            logger.info("Пустой.");
        }
    }

    @Override
    public int getAmmo() {
        return ammo;
    }
}
