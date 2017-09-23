package DniTygodnia;

import java.util.Scanner;

public class TestWeekDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer dnia tygodnia:");
        int weekDayId = scanner.nextInt();
        WeekDays.checkDay(weekDayId);
    }


}


/*
Ćwiczenie
        Napisz	program,	który	na	podstawie	podanego	numeru	dnia	tygodnia	(1,	2,
        3,	4,	5,	6,	7)	wyświetli	na	ekranie:
        nazwę	tego	dnia	(poniedziałek,	wtorek,	itp.)
        informację,	czy	dzień	ten	jest	dniem	pracującym,	czy	częścią	weekendu
        (   sob        ,        nd        )
        Skorzystaj	z	instrukcji	if	oraz	switch.	Uwzględnij	kwestię	wprowadzenia
        niepoprawnego	numeru	dnia	(np.	8,	albo   -  1        ).
        Postaraj	się	napisać	program	obiektowo,	tzn.	spróbuj	wydzielić	część	logiki
        aplikacji	do	osobnej	klasy	i	metod.
        Przykładowy	wydruk	programu:
        Podany	numer	dnia	tygodnia:	2
        Wtorek	to:	dzień	pra

        */
