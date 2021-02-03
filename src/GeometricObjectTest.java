import java.util.ArrayList;

public class GeometricObjectTest {
    public static void main(String[] args) {

        GeometricObject c1 = new Circle(3, "red", true);
        GeometricObject c2 = new Circle(12);

        GeometricObject t1 = new Triangle(3, 2, 3);
        GeometricObject t2 = new Triangle();

        GeometricObject r1 = new Rectangle(10);
        GeometricObject r2 = new Rectangle(3, 8);

        ArrayList<GeometricObject> list = new ArrayList<GeometricObject>();
        list.add(GeometricObject.max(c1, c2));
        list.add(GeometricObject.max(t1, t2));
        list.add(GeometricObject.max(r1, r2));

        System.out.println("The biggest circle: \n" + list.get(0) + "\n");
        System.out.println("The biggest triangle: \n" + list.get(1) + "\n");
        System.out.println("The biggest rectangle: \n" + list.get(2) + "\n");

        GeometricObject max = list.get(0);

        for (GeometricObject current : list) {
            if (current.getArea() > max.getArea()) {
                max = current;
            }
        }
        System.out.println("The biggest geometric object is:\n" + max);
    }
}

