import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Witaj!");

        do {
            System.out.println("Wybierz opcję:");
            System.out.println("1 - oblicz pole prostokąta");
            System.out.println("2 - oblicz pole kwadratu");
            System.out.println("3 - pole trapezu i trojkata");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Wybrales prostokat!");
                    System.out.println("Podaj dlugosc bokow do obliczenia:");
                    System.out.print("Bok a: ");
                    double sideA = scanner.nextDouble();
                    System.out.print("Bok b: ");
                    double sideB = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(sideA,sideB);
                    System.out.println(rectangle.toString());
                    break;

                case 2:
                    System.out.println("Wybrales kwadrat!");
                    System.out.println("Podaj dlugosc boku do obliczenia:");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    System.out.println(square.toString());
                    break;

                case 3:
                    double triangleArea = Calculations.calculateTriangleArea(5, 8);
                    System.out.println("Triangle area: " + triangleArea);

                    double trianglePerimeter = Calculations.calculateTrianglePerimeter(3, 4, 5);
                    System.out.println("Triangle perimeter: " + trianglePerimeter);

                    double trapezoidArea = Calculations.calculateTrapezoidArea(3, 6, 4);
                    System.out.println("Trapezoid area: " + trapezoidArea);

                    double trapezoidPerimeter = Calculations.calculateTrapezoidPerimeter(3, 4, 5, 6);
                    System.out.println("Trapezoid perimeter: " + trapezoidPerimeter);
                    break;


                default:
                    System.out.println("Nieprawidlowa opcja.");
                    break;
            }
            System.out.println("Czy chcesz obliczyć jeszcze raz? (T/N)");
        } while  (scanner.next().equalsIgnoreCase("T"));
        System.out.println("Do widzenia!");
    }
}
