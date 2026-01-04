package practice.inhertiancePolymorphism;

public class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }
}
