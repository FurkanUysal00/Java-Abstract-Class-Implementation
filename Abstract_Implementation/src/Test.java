public class Test {
    public static void main(String[] args) {
        System.out.println("********** CIRCLE **********");
        Circle c1=new Circle(Math.random()*10,Math.random()*10,Math.random()*10);
        System.out.println("X: "+c1.x);
        System.out.println("Y: "+c1.y);
        System.out.println("Radius: "+c1.getRadius());
        System.out.println("Area of circle: "+c1.calculateArea());
        System.out.println("Circumference of circle: "+c1.calculateCircumference());

        System.out.println("\n********** RECTANGLE **********");
        Rectangle r1=new Rectangle(Math.random()*10,Math.random()*10,Math.random()*10,Math.random()*10);
        System.out.println("X: "+r1.x);
        System.out.println("Y: "+r1.y);
        System.out.println("Height: "+r1.getHeight());
        System.out.println("Width: "+r1.getWidth());
        System.out.println("Area of Rectangle: "+r1.calculateArea());
        System.out.println("Perimeter of circle: "+r1.calculateCircumference());

        System.out.println("\n********** TRIANGLE **********");
        Triangle t1=new Triangle(Math.random()*10,Math.random()*10,Math.random()*10,Math.random()*10);
        System.out.println("X: "+t1.x);
        System.out.println("Y: "+t1.y);
        System.out.println("Height: "+t1.getHeight());
        System.out.println("Base: "+t1.getBase());
        System.out.println("Area of Triangle: "+t1.calculateArea());
        System.out.println("Perimeter of Triangle: "+t1.calculateCircumference());
    }
}