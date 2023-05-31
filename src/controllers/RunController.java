package controllers;

import interfaces.dzieicakzbogatejulicyInterface;
import models.dzieciekzbogetejulicy;
import models.Dzieciakzbiednejulicy;
import java.util.Arrays;
import java.util.Scanner;


public class RunController {
    public void run() {
        System.out.println("Witaj Przywoływaczu,");
        System.out.println("Tu rozpoczyna się twoja Historia .");
        System.out.println("Ty zadecydujesz czy będziesz szukał szczęścia i podążysz za pieniądzem");
        System.out.println("Jesteś twórcą postaci. Wybierz ścieszkę którą bedziesz podążał:");
        System.out.println("- Dzieciak z biednej rodziny");
        System.out.println("- Dzieciak z bogatej rodziny");
        System.out.println("Podaj nazwę ścieżki życia: ");

        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();

        switch (decision) {
            case "Dzieciak z bogatej rodziny" -> {
                dzieciakzbogatej dzieciakzbogatej = new dzieciakzbogatej();
                dzieciakzbogatej.welcome(decision);
                dzieciakzbogatej.breakLine();
                System.out.println("Podaj imię postaci");
                dzieciakzbogatej.setName(scanner.nextLine());
                    return;
                }
                dzieciakzbogatej.setType(scanner.nextLine());
                System.out.println("Podaj budowę ciała (wysportowany, chudy, gruby,)");
                String bodyBuild = scanner.nextLine();
                if (!isValidBodyBuild(bodyBuild)) {
                    System.out.println("Nieprawidłowa budowa ciała. Tworzenie postaci anulowane.");
                    return;
                }
                dzieciakzbogatej.setBodyBuild(bodyBuild);
                System.out.println("Podaj kolor włosów (czarny, blond, rudy, brunet)");
                String hairColor = scanner.nextLine();
                if (!isValidHairColor(hairColor)) {
                    System.out.println("Nieprawidłowy kolor włosów. Tworzenie postaci anulowane.");
                    return;
                }
                dzieciakzbogatej.setHairColor(hairColor);
                System.out.println("Podaj kolor oczu (niebieskie, brązowe, zielone, szare");
                String eyeColor = scanner.nextLine();
                if (!isValidEyeColor(eyeColor)) {
                    System.out.println("Nieprawidłowy kolor oczu. Tworzenie postaci anulowane.");
                    return;
                }
            }
            case "Dzieciakzbiednej" -> {
                dzieciakzbiednej dzieciakzbiednej = new dzieciakzbiedenj();
                dzieciakzbiednej.welcome(decision);
                dzieciakzbiednej.breakLine();
                System.out.println("Podaj imię postaci");
                dzieciakzbiednej.setName(scanner.nextLine());
                    return;
                }
                dzieciakzbiedenj.setType(scanner.nextLine());
                System.out.println("Podaj budowę ciała (wysportowany, chudy, gruby)");
                String bodyBuild = scanner.nextLine();
                if (!isValidBodyBuild(bodyBuild)) {
                    System.out.println("Nieprawidłowa budowa ciała. Tworzenie postaci anulowane.");
                    return;
                }
                dzieciakzbiendej.setBodyBuild(bodyBuild);
                System.out.println("Podaj kolor włosów (czarny, blond, rudy, brunet)");
                String hairColor = scanner.nextLine();
                if (!isValidHairColor(hairColor)) {
                    System.out.println("Nieprawidłowy kolor włosów. Tworzenie postaci anulowane.");
                    return;
                }
                dzieciakzbiendej.setHairColor(hairColor);
                System.out.println("Podaj kolor oczu (niebieskie, brązowe, zielone, szare)");
                String eyeColor = scanner.nextLine();
                if (!isValidEyeColor(eyeColor)) {
                    System.out.println("Nieprawidłowy kolor oczu. Tworzenie postaci anulowane.");
                    return;

                }
            }
            default -> {
                System.out.println("Błędny wybór");
                this.run();
            }
        }
        this.breakLine();
        System.out.println("Zakończono Tworzenie Postaci Witamy w twoim nowym życiu pzywoływaczu");
    }

    private boolean isValidHairColor(String hairColor) {
        String[] validHairColors = {"czarny", "blond", "rudy", "brunet"};
        return Arrays.asList(validHairColors).contains(hairColor);
    }

    private boolean isValidBodyBuild(String bodyBuild) {
        String[] validBodyBuilds = {"wysportowany", "chudy", "gruby"};
        return Arrays.asList(validBodyBuilds).contains(bodyBuild);
    }

    private boolean isValidEyeColor(String eyeColor)
        String[] validEyeColors = {"niebieskie", "brązowe", "zielone", "szare"};
        return Arrays.asList(validEyeColors).contains(eyeColor);
    }
    }

    private void breakLine() {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        RunController controller = new RunController();
        controller.run();
    }
}