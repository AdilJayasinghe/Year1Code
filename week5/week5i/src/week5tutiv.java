import java.util.Scanner;
public class week5tutiv {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num1=input.nextInt();
        loop(num1);
    }
    public static void loop(int num1) {
        if (num1 >=0) {
            System.out.println(num1);
            loop(num1 - 1);
        }
    }
}
