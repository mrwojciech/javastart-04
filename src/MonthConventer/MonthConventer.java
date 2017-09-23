package MonthConventer;

public class MonthConventer {


    public String convert(int monthId) {
        String month;

        switch (monthId) {
            case 1:
                month = "styczen";
                break;
            case 2:
                month =  "luty";
                break;
            case 3:
                month ="marzec";
                break;
            case 4:
                month ="kwiecien";
                break;
            case 5:
                month ="maj";
                break;
            case 6:
                month = "czerwied";
                break;
            case 7:
                month="lipiec";
                break;
            case 8:
                month="sierpien";
                break;
            case 9:
                month="wrzesien";
                break;
            case 10:
                month="pazdziernik";
                break;
            case 11:
                month="listopad";
                break;
            case 12:
                month="grudzien";
                break;
            default:
                month="Podany miesiac nie istnieje";
        }
        return month;
    }


}

/*
Ćwiczenie*
        Zdefiniuj	klasę
        MonthConverter
        a	w	niej	metodę
        convert        .
        Metoda	jako argument	powinna	przyjmować	liczbę	typu	całkowitego,	a	w	wyniku
        zwracać	napis	z	nazwą	miesiąca.	W	przypadku	podania	błędnego
        argumentu	(<0	lub	>12)	powinna	zostać	zwrócona	wartość
        "        undefined        ".
        W	osobnej	klasie	przetestuj	działanie	metody	dla	kilku	wartości	z	czego
        przynajmniej	jedna	jest	prawidłowa,	a	jedna
*/