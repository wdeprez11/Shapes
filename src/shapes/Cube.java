public class Cube extends Rectangle implements Shape3D {
    private double height;
    public Cube(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
