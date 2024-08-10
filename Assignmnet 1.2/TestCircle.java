

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius is " + c1.getRadius());
        System.out.println("Area is " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Radius is " + c2.getRadius());
        System.out.println("Area is " + c2.getArea());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Radius is " + c3.getRadius());
        System.out.println("Area is " + c3.getArea());
        System.out.println("Color is " + c3.getColor());

        // Uncomment the following lines to see the errors
        // System.out.println(c1.radius);
        // c1.radius = 5.0; // Error

        c3.setRadius(4.0);
        c3.setColor("green");
        System.out.println("Updated PartA.Circle: " + c3);
    }
}