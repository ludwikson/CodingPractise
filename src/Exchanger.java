import java.util.Scanner;

public class Exchanger {
    public static void main(String[] args) {

        System.out.println("Proszę wkleić output z maszyny.");

        Scanner scan = new Scanner(System.in);
        String machineOutput = scan.nextLine();

        int machineOutputLenght = machineOutput.length();

        for (int i = 0; i < machineOutputLenght; i++) {
            if (machineOutput.charAt(i) == 53)
                System.out.print("s");

            if (machineOutput.charAt(i) == 48)
                System.out.print("o");

            if (machineOutput.charAt(i) == 49)
                System.out.print("i");

            else
                System.out.print(machineOutput.charAt(i));
        }

    }
}
