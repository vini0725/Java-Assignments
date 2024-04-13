public class CircleAreaCalculator {
    public static double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    
    public static void main(String[] args) {
        double[] radii = {2.0, 3.5, 5.0, 7.2, 10.0};
        for (double radius : radii) {
            System.out.println("Radius: " + radius + ", Area: " + calculateArea(radius));
        }
    }
}
