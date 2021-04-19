public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5, "red", 10);
        System.out.println(cylinder.toString());
    }
}
