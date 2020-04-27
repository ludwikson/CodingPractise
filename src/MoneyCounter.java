import java.util.Scanner;

public class MoneyCounter {

    public static void main(String[] args) {

        int amount500 = 50000;
        int amount200 = 20000;
        int amount100 = 10000;
        int amount50 = 5000;
        int amount20 = 2000;
        int amount10 = 1000;
        int amount5 = 500;
        int amount2 = 200;
        int amount1 = 100;
        int amount050 = 50;
        int amount020 = 20;
        int amount010 = 10;
        int amount005 = 5;
        int amount002 = 2;
        int amount001 = 1;


        System.out.println("Proszę podać kwotę.");

        Scanner scan = new Scanner(System.in);
        float moneyBefore = scan.nextFloat();

        int money = (int)(moneyBefore * 100);


        int howManyTimes500 = (money / amount500);
        if (howManyTimes500 >= 1)
            System.out.println(howManyTimes500 + " " + "x" + " 500 zł");

        int minus = howManyTimes500 * amount500;
        money = money - minus;


        int howManyTimes200 = money / amount200;
        if (howManyTimes200 >= 1)
            System.out.println(howManyTimes200 + " x" + " 200 zł");

        minus = howManyTimes200 * amount200;
        money = money - minus;


        int howManyTimes100 = money / amount100;
        if (howManyTimes100 >= 1)
            System.out.println( howManyTimes100 + " " + "x" + " 100 zł");

        minus = howManyTimes100 * amount100;
        money = money - minus;


        int howManyTimes50 = money / amount50;
        if (howManyTimes50 >= 1)
            System.out.println( howManyTimes50 + " " + "x" + " 50 zł");

        minus = howManyTimes50 * amount50;
        money = money - minus;


        int howManyTimes20 = money / amount20;
        if (howManyTimes20 >= 1)
            System.out.println(howManyTimes20 + " " + "x" + " 20 zł");

        minus = howManyTimes20 * amount20;
        money = money - minus;


        int howManyTimes10 = money / amount10;
        if (howManyTimes10>= 1)
            System.out.println(howManyTimes10 + " " + "x" + " 10 zł");

        minus = howManyTimes10 * amount10;
        money = money - minus;


        int howManyTimes5 = money / amount5;
        if (howManyTimes5 >= 1)
            System.out.println(howManyTimes5 + " " + "x" + " 5 zł");

        minus = howManyTimes5 * amount5;
        money = money - minus;


        int howManyTimes2 = money / amount2;
        if (howManyTimes2 >= 1)
            System.out.println(howManyTimes2 + " " + "x" + " 2 zł");

        minus = howManyTimes2 * amount2;
        money = money - minus;


        int howManyTimes1 = money / amount1;
        if (howManyTimes1 >= 1)
            System.out.println(howManyTimes1 + " " + "x" + " 1 zł");

        minus = howManyTimes1 * amount1;
        money = money - minus;


        int howManyTimes050 = money / amount050;
        if (howManyTimes050 >= 1)
            System.out.println(howManyTimes050 + " " + "x" + " 0.50 zł");

        minus = howManyTimes050 * amount050;
        money = money - minus;


        int howManyTimes020 = money / amount020;
        if (howManyTimes020 >= 1)
            System.out.println(howManyTimes020 + " " + "x" + " 0.20 zł");

        minus = howManyTimes020 * amount020;
        money = money - minus;


        int howManyTimes010 = money / amount010;
        if (howManyTimes010 >= 1)
            System.out.println(howManyTimes010 + " " + "x" + " 0.10 zł");

        minus = howManyTimes010 * amount010;
        money = money - minus;


        int howManyTimes005 = money / amount005;
        if (howManyTimes005 >= 1)
            System.out.println(howManyTimes005 + " " + "x" + " 0.05 zł");

        minus = howManyTimes005 * amount005;
        money = money - minus;


        int howManyTimes002 = money / amount002;
        if (howManyTimes002 >= 1)
            System.out.println(howManyTimes002 + " " + "x" + " 0.02 zł");

        minus = howManyTimes002 * amount002;
        money = money - minus;


        int howManyTimes001 = money / amount001;
        if (howManyTimes001 >= 1)
            System.out.println(howManyTimes001 + " " + "x" + " 0.01 zł");

    }
}