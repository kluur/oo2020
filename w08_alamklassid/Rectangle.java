public class Rectangle extends Shape {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * (sideA + sideB) ;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return sideA * sideB;
    }

    @Override
    public double getDiagonal() {
        // TODO Auto-generated method stub
        return Math.sqrt((sideA * sideA) + (sideB * sideB));
    }
    
}