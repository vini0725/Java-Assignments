public class RectangleAreaCalculator {
    public static double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            System.out.println("Invalid input: Length or width cannot be non-positive.");
            return -1.0; // Return -1 to indicate an error
        }
        
        return length * width;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Area of rectangle with length 5 and width 4: " + calculateArea(5, 4));
        System.out.println("Area of rectangle with length 10 and width 7: " + calculateArea(10, 7));
        System.out.println("Area of rectangle with length 3.5 and width 2.5: " + calculateArea(3.5, 2.5));
        System.out.println("Area of rectangle with length 0 and width 0: " + calculateArea(0, 0));
        System.out.println("Area of rectangle with length -2 and width 5: " + calculateArea(-2, 5));
    }
}
