public class Calculations {
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    public static double calculateTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
    public static double calculateTrapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }

    public static double calculateTrapezoidPerimeter(double side1, double side2, double base1, double base2) {
        return side1 + side2 + base1 + base2;
    }

}
