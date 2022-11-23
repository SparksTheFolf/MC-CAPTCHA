package net.wuffs.mccaptcha.Player;

import org.bukkit.entity.Player;
import net.wuffs.mccaptcha.CAPTCHA.playerJoin;
import net.wuffs.mccaptcha.Override.Main;

public class kick {

    private static Main main;

    public static void kick(Player player){

        if(!playerJoin.complete) {

            player.kickPlayer("Failure to complete CAPTCHA!"
                    + "\n" + "Please rejoin to try again!"
                    + "\n" + "If you believe this is a mistake: https://captcha.wuffs.net/?id=" + pUUID.uuid);

        }

    }

}
