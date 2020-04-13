import java.util.Scanner;

public class LepszeDodawanie {


    public static void main(String[] args) {

        System.out.println("Napisz liczbę całkowitą.");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();

        System.out.println("Napisz liczbę całkowitą jeszcze raz.");
        int secondNumber = scan.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Oto suma Twoich liczb: " + sum);
    }


    public static int sum (int number1, int number2) {
        return number1 + number2;
    }
}