public class Circle  extends Shape{
    float radius;
    @Override
    public float calculateArea() {
        return (float) (3.14 * radius * radius);
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2*3.14*radius);
    }
}
