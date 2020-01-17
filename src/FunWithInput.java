import java.util.Scanner;

public class FunWithInput {

    public static void main(String[] args) {

        System.out.println("Hit the numpad with your fist. I'll show you a trick! But be careful!" +
                " I want to see digits only!");

        Scanner scan = new Scanner(System.in);
        long punch = scan.nextLong();

        String numberAsString = Long.toString(punch);
        System.out.println(numberAsString);

        int lengthOfPunch = numberAsString.length();
        System.out.println(lengthOfPunch);

        if (numberAsString.charAt(0) < 5)
            System.out.println("0");
        else
            System.out.println("1");


    }

}