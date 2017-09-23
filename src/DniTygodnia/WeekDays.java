package DniTygodnia;


public class WeekDays {


    public static void checkDay(int weekDayId) {

        switch (weekDayId) {
            case 1:
                System.out.print("poniedziałek: ");
                break;
            case 2:
                System.out.print("wtorek: ");
                break;
            case 3:
                System.out.print("sroda: ");
                break;
            case 4:
                System.out.print("czwartek: ");
                break;
            case 5:
                System.out.print("piatek: ");
                break;
            case 6:
                System.out.print("sobota: ");
                break;
            case 7:
                System.out.print("niedziela: ");
                break;
            default:
                System.out.println("Nie ma takiego dnia");
        }
        if ((weekDayId >= 1) && (weekDayId <= 5)) {
            System.out.println("to dzien pracujący");
        } else if ((weekDayId >= 6) && (weekDayId <= 7)) {
            System.out.println(" - Weekend");
        }
    }

}
