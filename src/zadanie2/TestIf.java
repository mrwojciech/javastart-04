package zadanie2;

public class TestIf {

    public static void main(String[] args) {

        int number = 9;

        System.out.println("Licza " + number + " jest:");
        if (number % 2 == 0) {
            System.out.println("parzysta");

        } else {
            System.out.println("nieparzysta");
        }

        if (number > 0) {
            System.out.println("dodatnie");
        } else {

            System.out.println("dodatnie");
        }

        if (number * 9 % 6 == 0) {
            System.out.println(number * 9 + " jest podzielna przez 6");
        } else if (number * number < 100) {
            System.out.println(number * number + " jest mniejsza od 100");
        }
    }
}