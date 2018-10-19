import java.text.DecimalFormat;

public class Main {

    public static int worldTime = 168260271;
    public static void main(String[] args) {

       System.out.println("worldTime = " + worldTime);
       System.out.println("It is " + calcHour() + ":" + calcMin() + " on day " + calcDay() + " of the year " + calcYear() + ".");
       System.out.println("Trammel is in day " + calcMoon1() + " of its 9 day phase.");
       System.out.println("Trammel is in day " + calcMoon2() + " of its 14 day phase.");
    }

    public static int calcYear(){
        return ((worldTime/1440)/365) + 1;
    }

    public static int calcDay(){
        return ((worldTime/1440)%365)+ 1;
    }

    public static String calcMin(){
        return new DecimalFormat("##.##").format(worldTime%525600%1440%60);
    }

    public static int calcHour(){
        return (worldTime%525600%1440/60);
    }

    public static int calcMoon1(){
        return ((worldTime/1440)%9) + 1;
    }

    public static int calcMoon2(){
        return ((worldTime/1440)%14) + 1;
    }
}
