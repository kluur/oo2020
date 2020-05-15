public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(3, 4.6);
        Shape shape2 = new Rectangle(4.1, 2.5);
        Shape shape3 = new Rectangle(7, 3);

        System.out.println(shape1.getArea());
        System.out.println(shape2.getDiagonal());
        System.out.println(shape3.getPerimeter());
    }
}