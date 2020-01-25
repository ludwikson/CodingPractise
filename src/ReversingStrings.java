import java.util.Scanner;

public class ReversingStrings {


    public static void main(String[] args) {

       Scanner anything = new Scanner(System.in);
       String first = anything.nextLine();
       StringBuilder second = new StringBuilder();
       second.append(first);
       second = second.reverse();
       System.out.println(second);
    }
}