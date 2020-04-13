import java.util.Scanner;
public class Parzysta {

    public static int getInput(String text)
    {
        System.out.println(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void print(int x) {

        System.out.println(x % 2 == 0 ? "PARZYSTA" : "NIEPARZYSTA");
    }

    public static void main(String [] args)
    {
        int a = getInput("Napisz liczbę całkowitą.");

        print(a);
    }
}

//   public static void main(String[] args) {
//
//        System.out.println("Napisz liczbę całkowitą.");
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();

//        System.out.println(a % 2 == 0 ? "PARZYSTA" : "NIEPARZYSTA");
//    }
