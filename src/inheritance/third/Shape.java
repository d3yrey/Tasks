package inheritance.third;

public class Shape {
    double area(){
       return 0;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.area());
    }
}
