// Asami, Brian - CS-170-01 - Lab 2
//Complete Class
package VolumeCaluculation;
import java.lang.Math;

public class CircularVolume {
    private static final double PI = 3.1416;
    //Value of pi

    static class Sphere {
        double radius;
        //Sphere values

        Sphere(double radius) {
            this.radius = radius;
        }
        // Constructor for Sphere class

        public double computeVolume() {
            return 4.f/3.f * PI * Math.pow(radius, 3);
        } //Method calculates and returns Sphere volume
    } //Sphere class

    static class Cylinder {
    double radius;
    double height;
    //Cylinder values

    Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        } //Constructor for Cylinder class

        public double computeVolume() {
            return PI * height * Math.pow(radius, 2);
        } //Method calculates and returns Cylinder volume
    } //Cylinder class

    static class Ellipsoid {
        double a;
        double b;
        double c;
//Ellipsoid Values
        Ellipsoid(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        } //Constructor for Ellipsoid class

        public double computeVolume() {
            return (4.f/3.f) * PI * a * b * c;
        } //Method calculates and returns Ellipsoid volume
    } //Ellipsoid class

    CircularVolume() { }

    public void computeVolume(double radius) {
        Sphere sphere = new Sphere(radius);

        System.out.println("Created object: Sphere");
        System.out.println("Given input: Radius -> " + radius);
        System.out.println("Calculated volume: " + sphere.computeVolume());
        //Output for sphere
    }
    public void computeVolume(double radius, double height) {
        Cylinder cylinder = new Cylinder(radius, height);

        System.out.println("Created object: Cylinder");
        System.out.println("Given input: Radius -> " + radius + ", Height -> " + height);
        System.out.println("Calculated volume: " + cylinder.computeVolume());
        //Output for cylinder
    }
    public void computeVolume(double a, double b, double c) {
        Ellipsoid ellipsoid = new Ellipsoid(a, b, c);

        System.out.println("Created object: Ellipsoid");
        System.out.println("Given input: a -> " + a + ", b -> " + b + ", c -> " + c);
        System.out.println("Calculated volume: " + ellipsoid.computeVolume());
        //Output for ellipsoid
    }



}