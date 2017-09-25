package zad3;

public class MathQuizeTest {

    public static void main(String[] args) {
        int score = 0;
        MathQuiz mathQuiz = new MathQuiz();
        System.out.println("Witaj w quizie");
        System.out.println("Odpowiedz na trzy proste pytania");
        if (mathQuiz.question1()) {score++;}
        if (mathQuiz.question2()) {score++;}
        if (mathQuiz.question3()) {score++;}
        System.out.println("Twoj wynik to: "+score+"/3");
    }
}
