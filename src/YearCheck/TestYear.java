package YearCheck;

public class TestYear {

    public static void main(String[] args) {

        int year = 2017;
        YearCheck yearCheck = new YearCheck();
        System.out.println("Czy rok: "+year +" jest przestepny? "+ yearCheck.isLeap(year));
    }
}
