import java.util.Scanner;

public class MainInputCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number>>>>>");
        double first = scan.nextDouble();
        System.out.println("enter second number>>>>");
        double second = scan.nextDouble();
        System.out.println("enter action (+, -, *, /)>>>>>");
        String action = scan.next();
        double res = calculator(first,second,action);
        System.out.println("the = " + res);
        scan.close();

    }
    public static double calculator(double a, double b, String action){
        double res = 0;
        switch (action){
            case "+" : res = a + b; break;
            case "-" : res = a - b; break;
            case "*" : res = a * b; break;
            case "/" : res = a / b; break;
            default:
                System.out.println("Wrong Action");
        }
        return res;
    }
}
