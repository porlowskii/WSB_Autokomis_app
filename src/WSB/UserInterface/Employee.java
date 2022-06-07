package WSB.UserInterface;

import WSB.Departaments.Factory;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Employee {
    private LocalDateTime date = LocalDateTime.now();
    private Factory factory = new Factory(10, 0.0);

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
            //hasło to login + dzień miesiąca
            System.out.println("Podaj hasło");
            String pass = scan.nextLine();
            if (pass.equals(login + controlNumber)) {
                System.out.println("Pomyślnie zalogowano");
                System.out.println("Wybierz dział");
                System.out.println("1: Salon Sprzedaży");
                System.out.println("2: Warsztat");
                System.out.println("3: Fabryka");
                System.out.println("0: Powrót do ekranu logowania");
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
                if (target == 0) {
                    break;
                }
                if (target == 1) {

                }
                if (target == 2) {

                }

                //FABRYKA
                if (target == 3) {
                    while (true) {
                        System.out.println("Jaki pojazd chcesz wyprodukować?");
                        System.out.println("1: Samochód");
                        System.out.println("2: Motocykl");
                        System.out.println("3: Przyczepę");
                        System.out.println("0: Powrót");
                        System.out.println("X: Wyjście z programu");
                        String inputFabryka = scan.nextLine();
                        if (inputFabryka.toLowerCase(Locale.ROOT).equals("x")) {
                            System.exit(0);
                        }
                        Integer targetFabryka;
                        try {
                            targetFabryka = Integer.valueOf(inputFabryka);
                        } catch (Exception e) {
                            System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                            continue;
                        }
                        if (targetFabryka == 0) {
                            break;
                        }
                        if (targetFabryka == 1) {
                            System.out.println("Jaki typ samochodu?");
                            System.out.println("1: SUV");
                            System.out.println("2: SuperCar");
                            System.out.println("3: PickUp");
                            System.out.println("X: Wyjście z programu");
                            String inputCar = scan.nextLine();
                            if (inputCar.toLowerCase(Locale.ROOT).equals("x")) {
                                System.exit(0);
                            }
                            Integer targetCar;
                            try {
                                targetCar = Integer.valueOf(inputCar);
                            } catch (Exception e) {
                                System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                                continue;
                            }

                            //SUV
                            if (targetCar == 1) {
                                System.out.println("Podaj model");
                                String model = scan.nextLine();
                                System.out.println("Podaj marke");
                                String producer = scan.nextLine();
                                System.out.println("Wybierz typ silnika:");
                                System.out.println("1: Benzynowy");
                                System.out.println("2: Diesel");
                                System.out.println("3: Hybryda");
                                String engineType = scan.nextLine();
                                Integer engineTypeNumber;
                                try {
                                    engineTypeNumber = Integer.valueOf(engineType);
                                } catch (Exception e) {
                                    System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                                    continue;
                                }
                                if (engineTypeNumber == 1) {
                                    engineType = "benzine";
                                }
                                if (engineTypeNumber == 3) {
                                    engineType = "diesel";
                                }
                                if (engineTypeNumber == 1) {
                                    engineType = "hybrid";
                                } else {
                                    System.out.println("Nieprawidłowa liczba, wybierz ponownie");
                                }
                                System.out.println("Jaki ma mieć prześwit?");
                                System.out.println("1: Standardowy");
                                System.out.println("2: Powiększony");
                                Double clearence = 20.0;
                                String clearenceInput = scan.nextLine();
                                Integer clearenceValue;
                                try {
                                    clearenceValue = Integer.valueOf(clearenceInput);
                                } catch (Exception e) {
                                    System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                                    continue;
                                }
                                if(clearenceValue != 2 && clearenceValue != 1){
                                    System.out.println("Nieprawidłowa liczba, wybierz ponownie");
                                }
                                if (clearenceValue ==2) {
                                    clearence = 35.0;
                                }
                                factory.createSUV(model, producer, engineType, clearence);
                                System.out.println("Pojazd trafił na linie produkcyjna");
                                break;
                            }

                            //SuperCar
                            if (targetCar == 2) {
                                System.out.println("Podaj model");
                                String model = scan.nextLine();
                                System.out.println("Podaj marke");
                                String producer = scan.nextLine();
                                System.out.println("Wybierz typ silnika:");
                                System.out.println("1: Benzynowy");
                                System.out.println("2: Diesel");
                                System.out.println("3: Hybryda");
                                String engineType = scan.nextLine();
                                Integer engineTypeNumber;
                                try {
                                    engineTypeNumber = Integer.valueOf(engineType);
                                } catch (Exception e) {
                                    System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                                    continue;
                                }
                                if (engineTypeNumber == 1) {
                                    engineType = "benzine";
                                }
                                if (engineTypeNumber == 3) {
                                    engineType = "diesel";
                                }
                                if (engineTypeNumber == 1) {
                                    engineType = "hybrid";
                                } else {
                                    System.out.println("Nieprawidłowa liczba, wybierz ponownie");
                                }
                                System.out.println("Jaka moc silnika?");
                                System.out.println("1: Standardowa");
                                System.out.println("2: TurboBurbo Doładowana");
                                Integer horsePower = 200;
                                String horsePowerInput = scan.nextLine();
                                Integer horsePowerValue;
                                try {
                                    horsePowerValue = Integer.valueOf(horsePowerInput);
                                } catch (Exception e) {
                                    System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                                    continue;
                                }
                                if (horsePowerValue!=1 && horsePowerValue!=2){
                                    System.out.println("Nieprawidłowa liczba, wybierz ponownie");
                                }
                                if (horsePowerValue ==2) {
                                    horsePower = 350;
                                }
                                factory.createSuperCar(model, producer, engineType, horsePower);
                                System.out.println("Pojazd trafił na linie produkcyjna");
                                break;
                            }
                            if (targetCar == 3) {
                                System.out.println("Podaj model");
                                String model = scan.nextLine();
                                System.out.println("Podaj marke");
                                String producer = scan.nextLine();
                                System.out.println("Wybierz typ silnika:");
                                System.out.println("1: Benzynowy");
                                System.out.println("2: Diesel");
                                System.out.println("3: Hybryda");
                                String engineType = scan.nextLine();
                                Integer engineTypeNumber;
                                try {
                                    engineTypeNumber = Integer.valueOf(engineType);
                                } catch (Exception e) {
                                    System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                                    continue;
                                }
                                if (engineTypeNumber == 1) {
                                    engineType = "benzine";
                                }
                                if (engineTypeNumber == 3) {
                                    engineType = "diesel";
                                }
                                if (engineTypeNumber == 1) {
                                    engineType = "hybrid";
                                } else {
                                    System.out.println("Nieprawidłowa liczba, wybierz ponownie");
                                }
                                System.out.println("Jaka ładowność?");
                                System.out.println("1: Standardowa");
                                System.out.println("2: Powiększona");
                                Double capacity = 1500.0;
                                String capacityInput = scan.nextLine();
                                Integer capacityValue;
                                try {
                                    capacityValue = Integer.valueOf(capacityInput);
                                } catch (Exception e) {
                                    System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                                    continue;
                                }
                                if (capacityValue!=1 && capacityValue !=2) {
                                    System.out.println("Nieprawidłowa liczba, wybierz ponownie");
                                    continue;
                                }
                                if (capacityValue ==2 ) {
                                    capacity = 2000.0;
                                }
                                factory.createPickUp(model, producer, engineType, capacity);
                                System.out.println("Pojazd trafił na linie produkcyjna");
                                break;
                            }
                        } else {
                            System.out.println("Spróbuj ponownie");
                            continue;
                        }
                    }
                }
            }
        }
    }
}

