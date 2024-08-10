public class Rectangle {
    // Rectangle properties
    private double width;
    private double height;
    private static String color;

    

    // Parameterized constructor
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        Rectangle.color = color;
    }

    // Accessor methods (getters)
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static String getColor() {
        return color;
    }

    // Mutator methods (setters)
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public static void setColor(String color) {
        Rectangle.color = color;
    }

    
    public double findArea() {
        return width * height;
    }


    public double findPerimeter() {
        return 2 * (width + height);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle [Width = " + width + ", Height = " + height + ", Color = " + color + 
               ", Area = " + findArea() + ", Perimeter = " + findPerimeter() + "]";
    }
}
public class Rectangle {
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 50.0, "yellow");
        Rectangle rect2 = new Rectangle(5.0, 50.0, "yellow");

        // Display the properties and areas of both rectangles
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
    }
}
