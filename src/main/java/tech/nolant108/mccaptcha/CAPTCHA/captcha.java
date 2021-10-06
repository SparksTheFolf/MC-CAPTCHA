package tech.nolant108.mccaptcha.CAPTCHA;


import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;


public class captcha {

    public static int CAPTCHA_random_num;
    public static int min;
    public static int max;


    public static void numGen(){
        min = 0;
        max = 8;

        //Generate random int value from 0 to 9 for the Inventory Values
        CAPTCHA_random_num = (int)Math.floor(Math.random()*(max-min+1)+min);

    }



}
