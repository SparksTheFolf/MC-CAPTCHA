package net.wuffs.mccaptcha.Player;

import org.bukkit.entity.Player;
import net.wuffs.mccaptcha.CAPTCHA.playerJoin;
import net.wuffs.mccaptcha.Override.Main;

import static net.wuffs.mccaptcha.Override.Main.enterprisemode;

public class kick {

    private static Main main;

    public static void kick(Player player){

        if(!playerJoin.complete) {


            if(!enterprisemode) {
                nonEnterpriseMode(player);

            } else {
                enterpriseMode(player);
            }

        }

    }


    private static void enterpriseMode(Player player) {
        player.kickPlayer("Failure to complete CAPTCHA!"
                + "\n" + "Please rejoin to try again!"
                + "\n" + "If you believe this is a mistake: https://captcha.wuffs.net/?id=" + pUUID.uuid);

        System.out.println("Submitting " + player.getDisplayName() + " to the database for CAPTCHA ID: " + pUUID.uuid);

    }

    private static void nonEnterpriseMode(Player player) {
        player.kickPlayer("Failure to complete CAPTCHA!"
                + "\n" + "Please rejoin to try again!");

    }

}
