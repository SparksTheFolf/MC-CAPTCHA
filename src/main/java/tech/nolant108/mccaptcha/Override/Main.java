package tech.nolant108.mccaptcha.Override;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tech.nolant108.mccaptcha.CAPTCHA.playerJoin;

public final class Main extends JavaPlugin {

    int version = 100421;
    public static boolean testMode = true;  //TODO: WHEN GOING TO PROD SERVER CHANGE TO FALSE!!!
    public static Main plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic


        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        plugin = this;


        if(!testMode){

            String licence = this.getConfig().getString("License");
            String ValidationServer = this.getConfig().getString("Validation-Server");


            String PluginValidServerName = this.getConfig().getString("Plugin-Name-Server");

            if(!new AdvancedLicense(licence, AdvancedLicense.ValidationServer + AdvancedLicense.EndValidServer, this).register());


        }else{

            System.out.println("[]===========TESTING MODE==========[]");
            System.out.println("[ The Plugin will make NO attempt   ]");
            System.out.println("[ To Contact the licensing server!! ]");
            System.out.println("[ For AUTH, Disable testing mode!   ]");
            System.out.println("[]===========TESTING MODE==========[]");


        }

        Bukkit.getPluginManager().registerEvents(new playerJoin(this), this);

        System.out.println("CAPTCHA is ENABLED");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("CAPTCHA is DISABLED");

    }
}
