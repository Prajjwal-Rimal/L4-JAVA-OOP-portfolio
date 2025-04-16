public class MultiSphere {
    public static void main(String[] args) {
        // Create multiple Sphere objects
        Sphere sphere1 = new Sphere(10.0);
        Sphere sphere2 = new Sphere(5.0);

        // Update the diameter of sphere1
        sphere1.setDiameter(15.0);

        // Print information about the spheres
        System.out.println(sphere1);
        System.out.println("Volume of sphere1: " + sphere1.calculateVolume());
        System.out.println("Surface area of sphere1: " + sphere1.calculateSurfaceArea());

        System.out.println(sphere2);
        System.out.println("Volume of sphere2: " + sphere2.calculateVolume());
        System.out.println("Surface area of sphere2: " + sphere2.calculateSurfaceArea());
    }
}
