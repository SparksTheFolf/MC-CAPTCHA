package net.wuffs.mccaptcha.Player;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import net.wuffs.mccaptcha.CAPTCHA.playerJoin;
import net.wuffs.mccaptcha.Override.Main;


public class pass {



    private static pass plugin;
    private static Main main;



    public static void pass(Player player){


        playerJoin.complete = true;
        System.out.println(player.getDisplayName() + " has the CAPTCHA value of: " + playerJoin.CAPTCHA_random_num + " , and PASSED ; With ID Number of: " + pUUID.uuid);
        player.sendMessage(ChatColor.GREEN + "You have passed the CAPTCHA!");
        player.closeInventory();
    }

}
