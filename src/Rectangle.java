public class Rectangle {
    double sideA;
    double sideB;


    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() {
        this.sideA = 0.0;
        this.sideB = 0.0;
    }

    public double calcPerimeter() {
        return 2 * (sideA + sideB);
    }
    public double calcArea(){
        return sideA * sideB;
    }
    public static String getClassName() {
        return Rectangle.class.getSimpleName();
    }

    public String toString() {
        return String.format("%s o bokach %.2f i %.2f, pole = %.2f, obwód = %.2f ", this.getClass().getSimpleName(), sideA, sideB, calcArea(), calcPerimeter());
    }

}

