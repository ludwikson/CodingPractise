import java.util.Scanner;

public class DodawanieSave {


    public static void main(String[] args) {

        System.out.println("Dej liczbę całkowitą.");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();

        System.out.println("Dej jeszcze raz liczbę całkowitą.");
        int secondNumber = scan.nextInt();

        int c = firstNumber + secondNumber;

        System.out.println("Oto suma Twoich liczb: " + c);
    }

}