class Space3D {
    private static final int EXPONENT_TWO = 2;
    
    double cal(Point3D startPoint, Point3D endPoint) {
        double x = Math.pow((startPoint.x-endPoint.x), EXPONENT_TWO);
        double y = Math.pow((startPoint.y-endPoint.y), EXPONENT_TWO);
        double z = Math.pow((startPoint.z-endPoint.z), EXPONENT_TWO);
        double distance = Math.sqrt(x + y + z);
        return distance;
    }
}

class Point3D {
    int x;
    int y;
    int z;
    public Point3D(int x, int y, int z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }
}


public class Workshop01 {

    public static void main(String[] args) {
        /*int a, b, c = 0;
        a = c++;
        b = ++a;
        c++;
        b = ++c + a++;
        a = --b + c++;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
        
        Space3D space3d = new Space3D();
        Point3D startPoint = new Point3D(2, 1, 3);
        Point3D endPoint = new Point3D(0, 0, 6);
        double distance = space3d.cal(startPoint, endPoint);
        System.out.println(distance);
    }

}
