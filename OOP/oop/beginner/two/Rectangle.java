package beginner.two;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateArea() {
        return a * b;
    }
}
