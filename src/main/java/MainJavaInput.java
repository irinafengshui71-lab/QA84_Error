import java.util.Scanner;

public class MainJavaInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your name and surname >>>>>>");
        String name = scan.nextLine();  // beröt toljko do 1. probela// Line wsü stroku
        System.out.println("Your name is " + name);
        System.out.println("Enter your age >>>>>>");
        int age = scan.nextInt();
        System.out.println("you are >>>>" + age + " years old ");

    }
}
