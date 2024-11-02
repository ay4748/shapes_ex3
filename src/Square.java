public class Square extends Shape{
    float side;
    @Override
    public float calculateArea() {
        return side*side;
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float calculatePerimeter() {
        return side*4;
    }
}
