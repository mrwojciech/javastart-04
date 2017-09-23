package numbers;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();
        int i = scanner.nextInt();
        System.out.println("Podaj trzy liczby calkowite");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(
                calculator.greatest(a, b, c));
        calculator.least(a, b, c);
        calculator.avg(a, b, c);


    }
}
