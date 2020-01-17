import java.util.Scanner;

public class WhoIsBetter {

    public static void main(String[] args) {

        System.out.println("Gracze z imieniem na literę M, są znacznie lepsi w Minkrafta od reszty.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Jak masz na imię?");
        String firstName = scan.nextLine();
        char firstLetterInFirstName = firstName.charAt(0);

        System.out.println("Jak ma na imię Twój kolega z Chodzieży?");
        String secondName = scan.nextLine();
        char firstLetterInSecondName = secondName.charAt(0);

        if (firstLetterInFirstName != 'M' && firstLetterInSecondName == 'M') {
            System.out.println(secondName + " jest lepszy niż " + firstName + ".");
        }
        else {
            System.out.println("Cosik żeś mie tu popsuł, kolego szanowny." +
                    " Ale pamiętaj, że Miłosz Ludwikowski jest najlepszym graczem Minkraft na świecie!");
        }
    }
}