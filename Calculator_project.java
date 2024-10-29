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
            System.out.println("Please input the length of the hypotenuse and 1 leg as doubles::");
            System.out.println("The length of the remaining side is " + Math.sqrt(Math.pow(userInput.nextDouble(), 2) - Math.pow(userInput.nextDouble(), 2)));
        }
    }

    public static void circleCircumference() {
        System.out.println("Please input the diameter of the circle as a double:");
        System.out.println(userInput.nextDouble() * Math.PI);
    }
}
