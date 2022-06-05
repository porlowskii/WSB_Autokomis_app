package WSB.UserInterface;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Employee {
    private LocalDateTime date = LocalDateTime.now();

    public Employee() {
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        Integer controlNumber = date.getDayOfMonth();

        while (true) {
            System.out.println("Wybierz 0 aby powrócić do poprzedniego okna");
            System.out.println("Login:");
            String login = scan.nextLine();
            if (login.equals("0")) {
                break;
            }
            //normalnie, poza IDE użyłbym maskowania hasła - dla zwykłej konsoli - "console.readPassword()", dla 'frontu' <input type="password">
            System.out.println("Podaj hasło");
            String pass = scan.nextLine();
            if (pass.equals(login + controlNumber)) {
                System.out.println("Pomyślnie zalogowano");
                System.out.println("Wybierz dział");
                System.out.println("1: Salon Sprzedaży");
                System.out.println("2: Warsztat");
                System.out.println("3: Złomowisko");
                System.out.println("0: Powrót do ekranu logowania");
                System.out.println("X: Wyjście z programu");
                String input = scan.nextLine();
                if (input.toLowerCase(Locale.ROOT).equals("x")) {
                    System.exit(0);
                    Integer target;
                    try {
                        target = Integer.valueOf(input);
                    } catch (Exception e) {
                        System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                        continue;
                    }
                    if (target == 0) {
                        break;
                    }
                    if (target == 1) {

                    }
                    if (target == 2) {

                    }
                    if (target == 3) {

                    }
                } else {
                    System.out.println("Spróbuj ponownie");
                    continue;
                }
            }
        }
    }
}