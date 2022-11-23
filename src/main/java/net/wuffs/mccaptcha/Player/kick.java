package net.wuffs.mccaptcha.Player;

import org.bukkit.entity.Player;
import net.wuffs.mccaptcha.CAPTCHA.playerJoin;
import net.wuffs.mccaptcha.Override.Main;

public class kick {

    private static Main main;

    public static void kick(Player player){

        if(!playerJoin.complete) {

            System.out.println(player.getDisplayName() + " has the CAPTCHA value of: " + playerJoin.CAPTCHA_random_num + " , and FAILED ; With ID Number of: " + pUUID.uuid);
            player.kickPlayer("Failure to complete CAPTCHA!"
                    + "\n" + "Please rejoin to try again!"
                    + "\n" + "If you believe this is a mistake: https://captcha.wuffs.net/?id=" + pUUID.uuid);

        }

    }

}
