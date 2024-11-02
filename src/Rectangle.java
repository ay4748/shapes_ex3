public class Rectangle extends Square{
    float long1;
    float short1;

    public Rectangle(float side, float long1, float short1) {
        super(side);
        this.long1 = long1;
        this.short1 = short1;
    }

    @Override
    public float calculateArea() {
        return long1*short1;
    }
    @Override
    public float calculatePerimeter() {
        return long1+long1+short1+short1;
    }
}
