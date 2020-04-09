import java.util.Scanner;

public class Exchanger {
    public static void main(String[] args) {

        System.out.println("Please, paste Machine's output.");

        Scanner scan = new Scanner(System.in);
        String machineOutput = scan.nextLine();

        for (int i = 0; i < machineOutput.length(); i++) {
            if (machineOutput.charAt(i) == '0')
                System.out.print("o");

            else if (machineOutput.charAt(i) == '1')
                System.out.print("i");

            else if (machineOutput.charAt(i) == '5')
                System.out.print("s");

            else if (machineOutput.charAt(i) == '4')
                System.out.print("a");

            else
                System.out.print(machineOutput.charAt(i));
        }

    }
}
