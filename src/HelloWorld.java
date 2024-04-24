import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");

        int cyfra = scanner.nextInt();

        if (cyfra > 0) {

            System.out.println("Czy jest większa od 100? Y/N");
            String confirm = scanner.next();

            if (Objects.equals(confirm, "Y") && (cyfra > 100)) {
                System.out.println("Niech zgadnę.. Twoja liczba to.." + cyfra + " ! :)");                        // kiedy liczba > od 100 i odp "Y" - prawda
            } else {
                System.out.println("nie oszukuj!");                 // kiedy liczba < 100 i odp "Y" - nie prawda
                System.out.println("Jest czy nie jest większa od 100? Y/N");
                String drugaSzansa = scanner.next();
                if (Objects.equals(drugaSzansa, "Y") && (cyfra > 100)) {
                    System.out.println("no..teraz mówisz prawdę :)");
                    System.out.println("Niech zgadnę.. Twoja liczba to.." + cyfra + " ! :)");
                } else {
                    System.out.println("Koniec zabawy - nie bawię sie tak!");
                }
            }
        }
    }
}
