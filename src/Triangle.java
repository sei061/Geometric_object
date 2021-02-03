class Triangle extends GeometricObject {

    private double side1, side2, side3;


    public Triangle() {
        super("Yellow", false);
        side1 = side2 = side3 = 1.0;
    }

    public Triangle(double sideValue) {
        super("Blue", true);
        if (checkLegality(sideValue, sideValue, sideValue))
            side1 = side2 = side3 = sideValue;
        else
            side1 = side2 = side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        if (checkLegality(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else
            this.side1 = this.side2 = this.side3 = 1.0;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setColor(color);
        this.setFilled(filled);

    }

    private double getSide1() {
        return side1;
    }

    private double getSide2() {
        return side2;
    }

    private double getSide3() {
        return side3;
    }

    public void setSide1(double setSide1) {
        this.side1 = setSide1;
    }

    public void setSide2(double setSide2) {
        this.side2 = setSide2;
    }

    public void setSide3(double setSide3) {
        this.side3 = setSide3;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString () {
        return "Triangle\nSides: " +  getSide1() + ", " + getSide2() + ", " + getSide3() + ", " + "\n" + super.toString();
    }

    private boolean checkLegality(double side1, double side2, double side3) {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            return false;
        }
        return !(side1 >= side2 + side3) && !(side1 <= Math.abs(side3 - side2));
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Triangle) {
            Triangle t = (Triangle) other;
            return (side1 == t.side1 && side2 == t.side2 && side3 == t.side3);
        }
        return false;
    }
}
