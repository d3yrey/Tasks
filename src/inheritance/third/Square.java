package inheritance.third;

public class Square extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        super.area();
        System.out.println("Area of Square");
        return side*side;

    }
}
