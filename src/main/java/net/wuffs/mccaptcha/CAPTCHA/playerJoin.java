package net.wuffs.mccaptcha.CAPTCHA;

import net.wuffs.mccaptcha.Player.kick;
import net.wuffs.mccaptcha.Player.pass;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;
import net.wuffs.mccaptcha.Override.Main;
import net.wuffs.mccaptcha.Player.pUUID;

import java.io.IOException;
import java.net.URISyntaxException;

public class playerJoin implements Listener {

    private static Main main;
    FileConfiguration config = Main.plugin.getConfig();
    String SUCMSG = this.config.getString("Success-MSG");
    String KICKMSG = this.config.getString("KICK-MSG");
    String delayFunc = this.config.getString("Delay");
    public static boolean complete;

    public static int CAPTCHA_random_num;
    public static int min;
    public static int max;







    public playerJoin(Main main){ this.main = main; }

    @EventHandler
    public void Join(PlayerJoinEvent e) throws InterruptedException {
        min = 1;
        max = 8;

        //Generate random int value from 0 to 9 for the Inventory Values
        CAPTCHA_random_num = (int)Math.floor(Math.random()*(max-min+1)+min);


        Player player = e.getPlayer();
        inventory.CPAInvis((Player) player);

        pUUID.uuidGEN();

        //CAST THE PLAYER METHOD
        complete = false;
        player.sendMessage(ChatColor.YELLOW + "You have 15 seconds to complete the CAPTCHA!");
        player.sendMessage(ChatColor.YELLOW + "Your CAPTCHA ID number is: " + pUUID.uuid);

        new BukkitRunnable(){
            @Override
            public void run() {
                kick.kick(player);
            }
        }.runTaskLater(main, 15*20);

    }

    @EventHandler
    public void CAPTCHACLICK(InventoryClickEvent e) throws IOException, URISyntaxException {

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.BLACK + "Complete the CAPTCHA")) {

            if (e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {
                    case RED_CONCRETE:
                        kick.kick(player);

                        break;
                    case GREEN_CONCRETE:
                        pass.pass(player);
                        complete = true;

                        break;
                    default:
                        break;


                }
            }

        }

    }

}
