import java.util.*;
public class week5tutii {
    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("********");
            System.out.println("  MENU  ");
            System.out.println("********");
            System.out.println("1.- Addition");
            System.out.println("2.- Subtraction");
            System.out.println("0.- Exit");
            System.out.println("Select an option : ");
            int number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Please enter the first number");
                    double number1 = input.nextInt();
                    System.out.println("Please enter the second number");
                    double number2 = input.nextInt();
                    addition(number1, number2);
                    break;
                case 2:
                    System.out.println("Please enter the first number");
                    double number11 = input.nextInt();
                    System.out.println("Please enter the second number");
                    double number22 = input.nextInt();
                    substraction(number11, number22);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    menu();
            }
        }
        catch (Exception e){
            System.out.println("Invalid input");
            menu();
        }

    }
    public static void addition(double num1,double num2){
        double total=num1+num2;
        System.out.println("The Additon of "+num1+" and "+num2+" is : " + total);
        menu();
    }
    public static void substraction(double num1, double num2){
        double total=num1-num2;
        System.out.println("The Substraction of "+num1+" and "+num2+" is : " + total);
        menu();
    }
}
