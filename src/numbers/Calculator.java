package numbers;

public class Calculator {


    public int greatest(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public int least(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public double avg(int a, int b, int c) {
        return (a+b+c)/3;
    }
}
