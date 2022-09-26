package tech.nolant108.mccaptcha.Player;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import tech.nolant108.mccaptcha.CAPTCHA.captcha;
import tech.nolant108.mccaptcha.CAPTCHA.idGEN;
import tech.nolant108.mccaptcha.CAPTCHA.playerJoin;

public class pass {

    public static void pass(Player player){

        playerJoin.complete = true;
        System.out.println(player.getDisplayName() + " has the CAPTCHA value of: " + captcha.CAPTCHA_random_num + " , and PASSED ; With ID Number of: " + pUUID.uuid);
        player.sendMessage(ChatColor.GREEN + "Successful! You have passed, Welcome!");
        player.closeInventory();
    }

}
