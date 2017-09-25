package zad1;

public class Triangle {
    private double hypotenuse, sideA, sideB;

    public Triangle(double sideA, double sideB, double sideC) {
        if ((sideA > sideB) && (sideA > sideC)) {
            this.hypotenuse = sideA;
            this.sideA = sideB;
            this.sideB = sideC;
        }
        if ((sideB > sideA) && (sideB > sideC)) {
            this.hypotenuse = sideB;
            this.sideA = sideA;
            this.sideB = sideC;
        }
        if ((sideC > sideA) && (sideC > sideB)) {
            this.hypotenuse = sideC;
            this.sideA = sideA;
            this.sideB = sideB;
        }


    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public boolean isRightTriangle() {
        return (sideA * sideA + sideB * sideB == hypotenuse * hypotenuse);
    }
}
