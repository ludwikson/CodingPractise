import java.util.Scanner;

public class FunWithInput {

    public static void main(String[] args) {

        System.out.println("Hit the numpad with your fist. I'll show you a trick! But be careful!" +
                " I want to see digits only!");

        Scanner scan = new Scanner(System.in);
        long punch = scan.nextLong();
        long length = String.valueOf(punch).length();

        String numberAsString = Long.toString(punch);

        for (int i = 0; i < length; i++) { //need to work and think on that
            int anotherDigitInPunch = numberAsString.charAt(i);

            if (i < 4)
                System.out.print("0");
            else
                System.out.print("1");

        }

    }

}