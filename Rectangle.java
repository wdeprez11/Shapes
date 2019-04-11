public class Rectangle implements Shape {
    private double side1, side2;
    private double area;

    public Rectangle(double side) {
        this.side1 = side; this.side2 = side;
        area = side * side;
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        area = side1 * side2;
    }

    public double getArea() {
        return area;
    }
}
