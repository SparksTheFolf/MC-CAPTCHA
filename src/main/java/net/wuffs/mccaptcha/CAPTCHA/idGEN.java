package net.wuffs.mccaptcha.CAPTCHA;

public class idGEN {

    public static int random_int;

    public static int numGen(){
        int min = 0;
        int max = 8;

        //Generate random int value from 0 to 8 for the Inventory Values
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);

        return random_int;

    }

}
