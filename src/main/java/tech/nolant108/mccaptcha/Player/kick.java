package tech.nolant108.mccaptcha.Player;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import tech.nolant108.mccaptcha.CAPTCHA.captcha;
import tech.nolant108.mccaptcha.CAPTCHA.idGEN;
import tech.nolant108.mccaptcha.CAPTCHA.playerJoin;
import tech.nolant108.mccaptcha.Override.Main;

public class kick {

    private static Main main;

    public static void kick(Player player){

        if(!playerJoin.complete) {

            System.out.println(player.getDisplayName() + " has the CAPTCHA value of: " + captcha.CAPTCHA_random_num + " , and FAILED ; With ID Number of: " + pUUID.uuid);
            player.kickPlayer("Failure to complete CAPTCHA; ID Number: " + pUUID.uuid);

        }else{
            return;
        }

    }

}
