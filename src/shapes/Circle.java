package shapes;
public class Circle {
    private double radius;
    private double area;
    public Circle(double radius) {
        this.radius = radius;
        area = Math.pow(radius, 2) * Math.PI;
    }

    public double getArea() {
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        recalcArea();
    }

    private void recalcArea() {
        area = Math.pow(radius, 2) * Math.PI;
    }

    public boolean equals(Object o) {
        Circle other = (Circle) o;
        return (this.radius == other.radius);

    }

    public String toString() {
        return "[ " + "Radius: " + radius + "Area: " + area + " ]";
    }
}
