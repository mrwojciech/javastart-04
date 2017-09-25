package zad3;

import java.util.Scanner;

public class MathQuiz {


    private Scanner scanner = new Scanner(System.in);

    public boolean question1() {
        System.out.println("Jaki jest wynik mnożenia 3*5");
        int answare = scanner.nextInt();
        return (answare == 15);
    }

    public boolean question2() {
        System.out.println("Jakie jest pole kwadratu o boku 12");
        int answare = scanner.nextInt();
        return (answare == 144);

    }

    public boolean question3() {
        System.out.println("Jaki ejst pierwiastek kwadratowy z liczby 15129");
        int answare = scanner.nextInt();
        return (answare == 123);

    }
}
