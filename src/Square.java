public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        this.side = 0.0;
    }

    public  double calcArea() {
        return side * side;
    }

    public  double calcPerimeter() {
        return 4 * side;
    }
    public static String getClassName() {
        return Square.class.getSimpleName();
    }

    public String toString() {
        return String.format("%s o boku %.2f, pole = %.2f, obwód = %.2f", this.getClass().getSimpleName(), side, calcArea(), calcPerimeter());
    }

}


