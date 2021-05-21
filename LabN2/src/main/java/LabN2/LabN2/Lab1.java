package LabN2.LabN2;

public class Lab1 {
    public static void main(String[] args) {
        Point3d p1 = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        Point3d p2 = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        Point3d p3 = new Point3d();

        System.out.println("P: " + computeArea(p1, p2, p3));
    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        // Чек равенства точек
        if (p1.isEqual(p2) || p2.isEqual(p3) || p3.isEqual(p1)) {
            return -1;
        } else {
            double a = p1.distanceTo(p2);
            double b = p2.distanceTo(p3);
            double c = p3.distanceTo(p1);
            double p = (a+b+c)/2;
            return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        }
    }
}