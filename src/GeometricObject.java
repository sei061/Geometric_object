public abstract class GeometricObject  {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  java.util.Date getDateCreated() {
    return dateCreated;
  }

  /** Return a string representation of this object */

  public String toString() {
    return "Created on " + dateCreated + "\nColor: " + color + "\n" +
      "Is filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();

  public abstract boolean equals (Object other);

  private int compareTo(GeometricObject obj1) {
    if (getArea() < obj1.getArea())
      return -1;
    else if (getArea() == obj1.getArea())
      return 0;
    else
      return 1;
  }

  public static GeometricObject max (GeometricObject obj1, GeometricObject obj2 ) {
    if (obj1.compareTo(obj2) > 0)
      return obj1;
    else
      return obj2;
  }
}
