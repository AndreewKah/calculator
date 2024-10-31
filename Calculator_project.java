import java.util.*;

public class Calculator_project {
    public static void main(String[]args){
        List<Runnable> methods = new ArrayList<>();
        methods.add(() -> circleCircumference());
        methods.add(() -> incometax());
        methods.add(() -> pythagoreanTheorem());
        methods.add(() -> trigonometry());
        methods.add(() -> quadraticFormula());
        methods.add(() -> horizonDistance());

        Scanner UI = new Scanner(System.in);
        boolean run = true;

        // dictionary
        HashMap<String, Runnable> methods_dict = new HashMap<>();
        methods_dict.put("circle circumference", calculator::circleCircumference);
        methods_dict.put("calculate income tax", calculator::incometax);
        methods_dict.put("pythagorean theorem", calculator::pythagoreanTheorem);
        methods_dict.put("trigonometry", calculator::trigonometry);
        methods_dict.put("quadratic formula", calculator::quadraticFormula);
        methods_dict.put("horizon distance", calculator::horizonDistance);
//        List<Runnable> methods = new ArrayList<>();


        Scanner UI = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("What would you like to do? Options: (type in exactly as written in the desctription)");
            System.out.println("circle circumference; calculate income tax\npythagorean theorem; trigonometry\nquadratic formula; horizon distance");
            String choice = UI.nextLine();
            boolean exists = methods_dict.containsKey(choice);
            if (exists) {
                methods_dict.get(choice).run();
            } else {
                System.out.println("I do not know what \"" +choice+ "\" is, please try again");
            }
        }
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
    public static void incometax(){
        Scanner UI = new Scanner(System.in);
        System.out.println("What is your salary?");
        int salary = UI.nextInt();
        UI.nextLine();

        double tax_rate = 5.06;
        double total_tax = 0;
        int leftover = salary;
        int federal_leftover = salary;
        if (leftover >= 47937){
            tax_rate = 5.06;
            total_tax += 47937 * (tax_rate / 100);
            leftover -= 47937;
        }
        else {
            tax_rate = 5.06;
            total_tax += leftover * (tax_rate / 100);
        }
        if (federal_leftover >= 55867){
            tax_rate = 15.00;
            total_tax += 55867 * (tax_rate / 100);
            federal_leftover -= 55867;
        }
        else{
            tax_rate = 15.00;
            total_tax += federal_leftover * (tax_rate / 100);
            federal_leftover -= federal_leftover;
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
        if (federal_leftover >= 55866){
            tax_rate = 20.5;
            total_tax += 55866 * (tax_rate / 100);
            federal_leftover -= 55866;
        }
        else{
            tax_rate = 20.5;
            total_tax += federal_leftover * (tax_rate / 100);
            federal_leftover -= federal_leftover;
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
        if (federal_leftover >= 61472){
            tax_rate = 26;
            total_tax += 61472 * (tax_rate / 100);
            federal_leftover -= 61472;
        }
        else{
            tax_rate = 26;
            total_tax += federal_leftover * (tax_rate / 100);
            federal_leftover -= federal_leftover;
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
        if (federal_leftover >= 73547){
            tax_rate = 29;
            total_tax += 73547 * (tax_rate / 100);
            federal_leftover -= 73547;
        }
        else{
            tax_rate = 29;
            total_tax += federal_leftover * (tax_rate / 100);
            federal_leftover -= federal_leftover;
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
        if (federal_leftover >= 0){
            tax_rate = 33.0;
            total_tax += federal_leftover * (tax_rate / 100);
            federal_leftover -= federal_leftover;
        }

        System.out.println("Your total tax is " + Math.round(total_tax) + " dollars, you have " + Math.round(salary-total_tax) + " left over");
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
    public static void quadraticFormula() {
        System.out.println("Please enter a, b, and c as doubles:");
        double a = userInput.nextDouble();
        double b = userInput.nextDouble();
        double c = userInput.nextDouble();
        System.out.print("Possible solutions are ");
        try {
            System.out.print((-b + sqrtCheck(Math.pow(b, 2) - 4*a*c))/2*a);
        } catch (ArithmeticException e) {
            System.out.print(e.getMessage());
        }
        System.out.print(" and ");
        try {
            System.out.println((-b - sqrtCheck(Math.pow(b, 2) - 4*a*c))/2*a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double sqrtCheck(double num) {
        if (num < 0) {
            throw new ArithmeticException("[Sqrt negative number error]");
        } else {
            return Math.sqrt(num);
        }
    }
    public static void horizonDistance() {
        System.out.println("Please enter the radius of the planet and height above sea level in meters as doubles:");
        double radius = userInput.nextDouble();
        double height = userInput.nextDouble();
        System.out.println("You are " + Math.sqrt(2*radius*height) + "meters from the horizon");
    }
    public static void triangleArea() {
        System.out.println("Please enter the 3 side lengths of the triangle as doubles:");
        double a = userInput.nextDouble();
        double b = userInput.nextDouble();
        double c = userInput.nextDouble();
        double s = (a + b + c)/2;
        System.out.println("The area of this triangle is " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}
