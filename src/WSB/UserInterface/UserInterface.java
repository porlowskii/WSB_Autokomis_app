package WSB.UserInterface;

import java.util.Scanner;

public class UserInterface {
    public UserInterface() {}
    Employee employee = new Employee();
    Guest guest = new Guest();

    public void start() {


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj cel wizyty [wpisz liczbę] :");
            System.out.println("1: Kupno pojazdu");
            System.out.println("2: Praca");
            System.out.println("0: Opuść program");
            String input = scan.nextLine();
            Integer target;
            try {
                target = Integer.valueOf(input);
            } catch (Exception e) {
                System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                continue;
            }
            if (target == 1) {
                guest.start();
                continue;
            }
            if (target == 2) {
                employee.start();
                continue;
            }
            break;
        }
    }
}
