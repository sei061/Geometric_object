public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double length) {
        this.width = length;
        this.height = length;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        this.setColor(color);
        this.setFilled(filled);
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    /** Return area */
    public double getArea() {
        return width * height;
    }

    @Override
    /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

  @Override
  public String toString () {
    return "Rectangle\nWidth: " +  getWidth() + " Height: " + getHeight() + "\n" + super.toString();
  }

    public boolean equals(Object other) {
        if (other instanceof Rectangle) {
            Rectangle t = (Rectangle) other;
            return true;
        }
        return false;
    }
}
