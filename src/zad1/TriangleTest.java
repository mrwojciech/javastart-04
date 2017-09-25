package zad1;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sideA, sideB, sideC;
        Triangle triangle;
        System.out.println("Podaj boki trójkąta:");
        sideA = scanner.nextDouble();
        sideB = scanner.nextDouble();
        sideC = scanner.nextDouble();
        triangle = new Triangle(sideA, sideB, sideC);
        boolean isRight = triangle.isRightTriangle();
        System.out.println("Czy trójkąt jest prostokątny? : "+ isRight);

    }
}
