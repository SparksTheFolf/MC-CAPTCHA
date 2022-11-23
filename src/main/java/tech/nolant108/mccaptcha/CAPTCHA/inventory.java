package tech.nolant108.mccaptcha.CAPTCHA;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class inventory {

    public static Inventory CPAInventory;
    public static ItemStack GREEN;
    public static ItemMeta GREENMeta;
    public static ItemStack RED;
    public static ItemMeta REDMeta;


    public static void CPAInvis(Player player) {

        if (playerJoin.CAPTCHA_random_num == 1) {
            CPAInventory = Bukkit.createInventory(null, 9, ChatColor.BLACK + "Complete the CAPTCHA");
            GREEN = new ItemStack(Material.GREEN_CONCRETE);
            GREENMeta = GREEN.getItemMeta();
            GREENMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            GREEN.setItemMeta(GREENMeta);

            RED = new ItemStack((Material.RED_CONCRETE));
            REDMeta = RED.getItemMeta();
            REDMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            RED.setItemMeta(REDMeta);

            CPAInventory.setItem(0, RED);
            CPAInventory.setItem(1, GREEN);
            CPAInventory.setItem(2, RED);
            CPAInventory.setItem(3, RED);
            CPAInventory.setItem(4, RED);
            CPAInventory.setItem(5, RED);
            CPAInventory.setItem(6, RED);
            CPAInventory.setItem(7, RED);
            CPAInventory.setItem(8, RED);

            player.openInventory(CPAInventory);

        }
        else if (playerJoin.CAPTCHA_random_num == 2) {
            CPAInventory = Bukkit.createInventory(null, 9, ChatColor.BLACK + "Complete the CAPTCHA");
            GREEN = new ItemStack(Material.GREEN_CONCRETE);
            GREENMeta = GREEN.getItemMeta();
            GREENMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            GREEN.setItemMeta(GREENMeta);

            RED = new ItemStack((Material.RED_CONCRETE));
            REDMeta = RED.getItemMeta();
            REDMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            RED.setItemMeta(REDMeta);

            CPAInventory.setItem(0, RED);
            CPAInventory.setItem(1, RED);
            CPAInventory.setItem(2, GREEN);
            CPAInventory.setItem(3, RED);
            CPAInventory.setItem(4, RED);
            CPAInventory.setItem(5, RED);
            CPAInventory.setItem(6, RED);
            CPAInventory.setItem(7, RED);
            CPAInventory.setItem(8, RED);

            player.openInventory(CPAInventory);

        }
        else if (playerJoin.CAPTCHA_random_num == 3) {
            CPAInventory = Bukkit.createInventory(null, 9, ChatColor.BLACK + "Complete the CAPTCHA");
            GREEN = new ItemStack(Material.GREEN_CONCRETE);
            GREENMeta = GREEN.getItemMeta();
            GREENMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            GREEN.setItemMeta(GREENMeta);

            RED = new ItemStack((Material.RED_CONCRETE));
            REDMeta = RED.getItemMeta();
            REDMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            RED.setItemMeta(REDMeta);

            CPAInventory.setItem(0, RED);
            CPAInventory.setItem(1, RED);
            CPAInventory.setItem(2, RED);
            CPAInventory.setItem(3, GREEN);
            CPAInventory.setItem(4, RED);
            CPAInventory.setItem(5, RED);
            CPAInventory.setItem(6, RED);
            CPAInventory.setItem(7, RED);
            CPAInventory.setItem(8, RED);

            player.openInventory(CPAInventory);

        }
        else if (playerJoin.CAPTCHA_random_num == 4) {
            CPAInventory = Bukkit.createInventory(null, 9, ChatColor.BLACK + "Complete the CAPTCHA");
            GREEN = new ItemStack(Material.GREEN_CONCRETE);
            GREENMeta = GREEN.getItemMeta();
            GREENMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            GREEN.setItemMeta(GREENMeta);

            RED = new ItemStack((Material.RED_CONCRETE));
            REDMeta = RED.getItemMeta();
            REDMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            RED.setItemMeta(REDMeta);

            CPAInventory.setItem(0, RED);
            CPAInventory.setItem(1, RED);
            CPAInventory.setItem(2, RED);
            CPAInventory.setItem(3, RED);
            CPAInventory.setItem(4, GREEN);
            CPAInventory.setItem(5, RED);
            CPAInventory.setItem(6, RED);
            CPAInventory.setItem(7, RED);
            CPAInventory.setItem(8, RED);

            player.openInventory(CPAInventory);

        }
        else if (playerJoin.CAPTCHA_random_num == 5) {
            CPAInventory = Bukkit.createInventory(null, 9, ChatColor.BLACK + "Complete the CAPTCHA");
            GREEN = new ItemStack(Material.GREEN_CONCRETE);
            GREENMeta = GREEN.getItemMeta();
            GREENMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            GREEN.setItemMeta(GREENMeta);

            RED = new ItemStack((Material.RED_CONCRETE));
            REDMeta = RED.getItemMeta();
            REDMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            RED.setItemMeta(REDMeta);

            CPAInventory.setItem(0, RED);
            CPAInventory.setItem(1, RED);
            CPAInventory.setItem(2, RED);
            CPAInventory.setItem(3, RED);
            CPAInventory.setItem(4, RED);
            CPAInventory.setItem(5, GREEN);
            CPAInventory.setItem(6, RED);
            CPAInventory.setItem(7, RED);
            CPAInventory.setItem(8, RED);

            player.openInventory(CPAInventory);

        }
        else if (playerJoin.CAPTCHA_random_num == 6) {
            CPAInventory = Bukkit.createInventory(null, 9, ChatColor.BLACK + "Complete the CAPTCHA");
            GREEN = new ItemStack(Material.GREEN_CONCRETE);
            GREENMeta = GREEN.getItemMeta();
            GREENMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            GREEN.setItemMeta(GREENMeta);

            RED = new ItemStack((Material.RED_CONCRETE));
            REDMeta = RED.getItemMeta();
            REDMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            RED.setItemMeta(REDMeta);

            CPAInventory.setItem(0, RED);
            CPAInventory.setItem(1, RED);
            CPAInventory.setItem(2, RED);
            CPAInventory.setItem(3, RED);
            CPAInventory.setItem(4, RED);
            CPAInventory.setItem(5, RED);
            CPAInventory.setItem(6, GREEN);
            CPAInventory.setItem(7, RED);
            CPAInventory.setItem(8, RED);

            player.openInventory(CPAInventory);

        }

        else if (playerJoin.CAPTCHA_random_num == 7) {
            CPAInventory = Bukkit.createInventory(null, 9, ChatColor.BLACK + "Complete the CAPTCHA");
            GREEN = new ItemStack(Material.GREEN_CONCRETE);
            GREENMeta = GREEN.getItemMeta();
            GREENMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            GREEN.setItemMeta(GREENMeta);

            RED = new ItemStack((Material.RED_CONCRETE));
            REDMeta = RED.getItemMeta();
            REDMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            RED.setItemMeta(REDMeta);

            CPAInventory.setItem(0, RED);
            CPAInventory.setItem(1, RED);
            CPAInventory.setItem(2, RED);
            CPAInventory.setItem(3, RED);
            CPAInventory.setItem(4, RED);
            CPAInventory.setItem(5, RED);
            CPAInventory.setItem(6, RED);
            CPAInventory.setItem(7, GREEN);
            CPAInventory.setItem(8, RED);

            player.openInventory(CPAInventory);

        }

        else if (playerJoin.CAPTCHA_random_num == 8) {
            CPAInventory = Bukkit.createInventory(null, 9, ChatColor.BLACK + "Complete the CAPTCHA");
            GREEN = new ItemStack(Material.GREEN_CONCRETE);
            GREENMeta = GREEN.getItemMeta();
            GREENMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            GREEN.setItemMeta(GREENMeta);

            RED = new ItemStack((Material.RED_CONCRETE));
            REDMeta = RED.getItemMeta();
            REDMeta.setDisplayName(ChatColor.GRAY + "CHOOSE THE NON-SAME COLOR");
            RED.setItemMeta(REDMeta);

            CPAInventory.setItem(0, RED);
            CPAInventory.setItem(1, RED);
            CPAInventory.setItem(2, RED);
            CPAInventory.setItem(3, RED);
            CPAInventory.setItem(4, RED);
            CPAInventory.setItem(5, RED);
            CPAInventory.setItem(6, RED);
            CPAInventory.setItem(7, RED);
            CPAInventory.setItem(8, GREEN);

            player.openInventory(CPAInventory);


        }
    }
}