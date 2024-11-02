public class Triangle extends Shape{
    float h;
    float side;

    public Triangle(float h, float side) {
        this.h = h;
        this.side = side;
    }

    @Override
    public float calculateArea() {
        return h*side;
    }
    @Override
    public float calculatePerimeter() {
        return side*3;
    }
}
