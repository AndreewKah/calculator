import java.util.*;

public class Calculator_project {
    public static void main(String[]args){
        // pythagorean theorem, tan cos sin, circles
        
        // BMI and nutrition requirements
    }
    public static void BMIcalculator(int kg, int height){
        double BMI = kg/(Math.pow(height,2));
        
    }

    public static void pythagoreanTheorem() {
        System.out.println("Would you like to calculate the hypotenuse or leg?");
        String chooseSide = userInput.nextLine();
        if (chooseSide.equals("hypotenuse")) {
            System.out.println("Please input the length of the 2 legs as doubles:");
            System.out.println("The length of the hypotenuse is " + Math.sqrt(Math.pow(userInput.nextDouble(), 2) + Math.pow(userInput.nextDouble(), 2)));
        } else {
            System.out.println("Please input the length of the hypotenuse and 1 leg as doubles:");
            System.out.println("The length of the remaining side is " + Math.sqrt(Math.pow(userInput.nextDouble(), 2) - Math.pow(userInput.nextDouble(), 2)));
        }
    }

    public static void circleCircumference() {
        System.out.println("Please input the diameter of the circle as a double:");
        System.out.println(userInput.nextDouble() * Math.PI);
    }
    // I will make it more effective with arrays later if we have time
    public static void incometax(int salary){

        double tax_rate = 5.06;
        double total_tax = 0;
        int leftover = salary;
        if (leftover >= 47937){
            tax_rate = 5.06;
            total_tax += 47937 * (tax_rate / 100);
            leftover -= 47937;
        }
        else {
            tax_rate = 5.06;
            total_tax += leftover * (tax_rate / 100);
        }
        if (leftover >= 47938){
            tax_rate = 7.70;
            total_tax += 47938 * (tax_rate / 100);
            leftover -= 47938;
        }
        else {
            tax_rate = 7.70;
            total_tax += leftover * (tax_rate / 100);
        }
        if (leftover >= 14201){
            tax_rate = 10.50;
            total_tax += 14201 * (tax_rate / 100);
            leftover -= 14201;
        }
        else {
            tax_rate = 10.50;
            total_tax += leftover * (tax_rate / 100);
        }
        if (leftover >= 23588){
            tax_rate = 12.29;
            total_tax += 14201 * (tax_rate / 100);
            leftover -= 14201;
        }
        else {
            tax_rate = 12.29;
            total_tax += leftover * (tax_rate / 100);
        }
        if (leftover >= 47568){
            tax_rate = 14.70;
            total_tax += 47568 * (tax_rate / 100);
            leftover -= 47568;
        }
        else {
            tax_rate = 14.70;
            total_tax += leftover * (tax_rate / 100);
        }
        if (leftover >= 71520){
            tax_rate = 16.80;
            total_tax += 71520 * (tax_rate / 100);
            leftover -= 71520;
        }
        else {
            tax_rate = 16.80;
            total_tax += leftover * (tax_rate / 100);
        }
        if (leftover >= 0){
            tax_rate = 20.50;
            total_tax += leftover * (tax_rate / 100);
            leftover -= leftover;
        }

    }

    public static void trigonometry() {
        System.out.println("Please enter the 2 known side lengths as doubles in the order of opposite, adjacent, and hypotenuse:");
        double num1 = userInput.nextDouble();
        double num2 = userInput.nextDouble();
        System.out.println("Would you like to calculate the angle using tangent, sine, or cosine?");
        String chooseTrig = userInput.nextLine();
        if (chooseTrig.equals("sine")) {
            System.out.println("The angle is " + Math.toDegrees(Math.asin(num1/num2)) + "degrees");
        } else if (chooseTrig.equals("cosine")) {
            System.out.println("The angle is " + Math.toDegrees(Math.acos(num1/num2)) + "degrees");
        } else {
            System.out.println("The angle is " + Math.toDegrees(Math.atan(num1/num2)) + "degrees");
        }
    }
}
