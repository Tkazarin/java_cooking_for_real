import java.lang.Math;

public class Circle {
    private double radius;
    private Point center;

    Circle(int r, int x, int y)
    {
        this.radius = r;
        this.center = new Point(x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean compareCircles(Circle otherCircle) {
        return this.radius == otherCircle.getRadius();
    }

    public String to_String()
    {
        return "Radius: " + Double.toString(this.radius)+ ", " + Double.toString(this.center.getX()) + ';' + Double.toString(this.center.getY());
    }
}
