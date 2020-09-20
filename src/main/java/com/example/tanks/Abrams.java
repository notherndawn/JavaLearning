package main.java.com.example.tanks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Abrams implements Tank{
    private static final Logger logger = LogManager.getLogger(Abrams.class);
    private int ammo = 5;
    @Override
    public void tankFire() {
        if(ammo > 0){
            logger.info("Fire!");
            --ammo;
        }
        else{
            logger.info("Empty.");
        }
    }

    @Override
    public int getAmmo() {
        return ammo;
    }
}
