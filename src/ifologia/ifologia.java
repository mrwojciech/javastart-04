package ifologia;

public class ifologia {

    public static void main(String[] args) {

        int number = -32;

        switch (number % 2) {
            case 0:
                System.out.printf("Liczba %d jest parzysta", number);
                break;
            case 1:
                System.out.printf("Liczba %d jest nieparzysta", number);
                break;
            case -1:
                System.out.printf("Liczba %d jest ujemna i nieparzysta", number);
                break;
            default:
                System.out.println("Zadne z powyzszych");
        }
    }
}

