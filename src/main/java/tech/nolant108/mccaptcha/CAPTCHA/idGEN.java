package tech.nolant108.mccaptcha.CAPTCHA;

public class idGEN {

    public static int ID_random_num;
    public static int ID_min;
    public static int ID_max;


    public static void numGen(){
        ID_min = 11111111;
        ID_max = 99999999;

        //Generate random int value from 0 to 9 for the Inventory Values
        ID_random_num = (int)Math.floor(Math.random()*(ID_max-ID_min+1)+ID_min);

    }

}
