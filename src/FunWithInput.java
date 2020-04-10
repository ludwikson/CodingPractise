import java.util.Scanner;

public class FunWithInput {

    public static void main(String[] args) {

        System.out.println("Hit the numpad with your fist. I'll show you a trick! But be careful!" +
                " I want to see digits only!");
        //scanning next line and initiating input as var punch
        Scanner scan = new Scanner(System.in);
        long punch = scan.nextLong();

        //changing type of variable from long to String
        //it's necessary to count length of String
        String punchAsString = Long.toString(punch);

        //counting number of digits in input
        int lengthOfPunch = punchAsString.length();

        //loop to check each of digits
        //checking and returning every one depending on the if statement
        for (int i = 0; i < lengthOfPunch; i++) {
            if (punchAsString.charAt(i) < '5')
                System.out.print("0");
            else
                System.out.print("1");
        }

    }

}


/*

class Adrian
{
    public static void main(String[] args)
    {
        System.out.println("Hit the numpad with your fist. I'll show you a trick! But be careful!"
                + " I want to see digits only!");

        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();

        //najważniejsze
        for (int i = 0; i < digits.length(); ++i)
        {
            if (Character.getNumericValue(digits.charAt(i)) < 5)
                System.out.print("0");
            else
                System.out.print("1");
        }
    }
}

 */