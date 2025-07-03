// Oevrrriding and Polymorphism in Java
// This code demonstrates how to use polymorphism with inner classes in Java.
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    class Circle extends Shape {
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }
    class Square extends Shape {
        public void draw() {
            System.out.println("Drawing a square");
        }
    }
}

// Oevrloading and Polymorphism in Java
class Sum{
    public int add(int a, int b)
    {
        return a + b;
    }
    public double  add(double a, double b)
    {
        return a + b;
    }
    public float add(float a, float b, float c)
    {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Oevrrriding and Polymorphism in Java
        Shape shape = new Shape();
        Shape.Circle circle = shape.new Circle();
        Shape.Square square = shape.new Square();

        circle.draw();  // Output: Drawing a circle
        square.draw();  // Output: Drawing a square

        // Oevrloading and Polymorphism in Java
        Sum sum = new Sum();
        System.out.println("Sum of integers: " + sum.add(5, 10));
        System.out.println("Sum of doubles: " + sum.add(5.5, 10.5));
        System.out.println("Sum of floats: " + sum.add(5.5f, 10.5f, 2.0f));
    }
}

