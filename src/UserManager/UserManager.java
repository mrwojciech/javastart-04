package UserManager;

import java.util.Scanner;

public class UserManager {


    public static void main(String[] args) {
        String pesel;
        int age;
        String name;
        String surname;

        User user;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pesel:");
        pesel = scanner.nextLine();
        System.out.println("Podaj wiek:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj imie:");
        name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        surname = scanner.nextLine();

        user = new User(pesel, age, name, surname);
        user.showUser();

    }
}
