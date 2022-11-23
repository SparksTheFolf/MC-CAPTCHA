package net.wuffs.mccaptcha.Override;

import net.wuffs.mccaptcha.CAPTCHA.playerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    int version = 112222;
    public static boolean testMode = true;  //TODO: WHEN GOING TO PROD SERVER CHANGE TO FALSE!!!
    public static Main plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic


        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        plugin = this;

        String licence = this.getConfig().getString("License");

        String regularLicense = "L0ZD-HO0A-N6PZ-D5WB";

        if(Objects.equals(licence, regularLicense)) {

            System.out.println("[]===============[MWCA License-System]===============[]");
            System.out.println("Thank you for using basic MCCaptcha! \n");

            System.out.println("Perks of buying the enterprise license: \n" +
                    "1. No more CAPTCHA's for staff members\n" +
                    "2. No more CAPTCHA's for players with a permission node\n" +
                    "3. No more CAPTCHA's for players with a certain rank\n" +
                    "4. CAPTCHA's UUID's get uploaded to the webserver for quick diagnostic of why the player was kicked\n"
            );

            System.out.println("To buy the enterprise edition of MCCaptcha, please visit: https://captcha.wuffs.net/enterprise");
            System.out.println("[]===============[MWCA License-System]===============[]");



        }else {

            try{
                String ValidationServer = this.getConfig().getString("Validation-Server");


                String PluginValidServerName = this.getConfig().getString("Plugin-Name-Server");

                //new AdvancedLicense(licence, AdvancedLicense.ValidationServer + AdvancedLicense.EndValidServer, this).register();


                if(!new AdvancedLicense(licence, AdvancedLicense.ValidationServer + AdvancedLicense.EndValidServer, this).register()) return;

                System.out.println("Thank you for using the enterprise edition of MCCaptcha!");

            } catch (Exception e) {
                System.out.println("License is invalid or typed in wrong! Please check your license and try again!");
            }

        }



        Bukkit.getPluginManager().registerEvents(new playerJoin(this), this);

        System.out.println("CAPTCHA is ENABLED");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        saveDefaultConfig();


        System.out.println("CAPTCHA is DISABLED");

    }
}
