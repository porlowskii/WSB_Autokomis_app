package WSB.UserInterface;

import java.util.Locale;
import java.util.Scanner;

public class Guest {
    Scanner scan = new Scanner(System.in);
    public Guest(){}

    public void start() {

        while(true) {
            System.out.println("Jaki rodzaj pojazdu Cię interesuje [wpisz liczbę] :");
            System.out.println("1: Samochód");
            System.out.println("2: Motocykl");
            System.out.println("3: Przyczepa");
            System.out.println("0: Powrót do poprzedniego widoku");
            System.out.println("X: Wyjście z programu");
            String input = scan.nextLine();
            if (input.toLowerCase(Locale.ROOT).equals("x")) {
                System.exit(0);
            }
            Integer target;
            try {
                target = Integer.valueOf(input);
            } catch (Exception e) {
                System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                continue;
            }
            System.out.println(target);
            if (target==0) {
                break;
            }
            //TODO: podział na rodzaj pojazdu
            if (target==1) {
                System.out.println("auto");
                System.exit(0);
            }
            if (target==2) {
                System.out.println("moto");
                System.exit(0);
            }
            if (target==3) {
                System.out.println("przyczepa");
                System.exit(0);
            } else {
                System.out.println("Wybrano błędną liczbę, spróbuj ponownie.");
            }

        }

    }
}
