package carpet_cost_calculator17;

public class Floor {
    double width;
    double length;

    public Floor(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public double getArea() {
        return width * length;
    }

}
