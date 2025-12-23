package inheritance.third;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        super.area();
        System.out.println("Area of Circle");
        return Math.PI* radius * radius;
    }
}
