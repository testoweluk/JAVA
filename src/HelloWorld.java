import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
                int pierwszaLiczba = scanner.nextInt();
        System.out.println("podaj druga liczbe");
                int drugaLiczba = scanner.nextInt();
                int result = pierwszaLiczba + drugaLiczba;
        System.out.println("Dodawanie " + result );
    }

}
