package codetest;

import java.util.Scanner;

public class AreaofShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.print("Enter your choice (1, 2, 3, or 4): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = calculateCircleArea(radius);
                System.out.println("The area of the circle is: " + circleArea);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = calculateRectangleArea(length, width);
                System.out.println("The area of the rectangle is: " + rectangleArea);
                break;
            case 3:
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = calculateTriangleArea(base, height);
                System.out.println("The area of the triangle is: " + triangleArea);
                break;
            case 4:
            	System.out.println("Enter the side length of a square: ");
            	int side = scanner.nextInt();
            	int squareArea = calculateSquareArea(side);
            	System.out.println("The area of the square is:  " + squareArea);
            	break;
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    public static int calculateSquareArea(int side) {
    	return 4 * side;
    }
}