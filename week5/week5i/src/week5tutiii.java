import java.util.Scanner;
public class week5tutiii {
    public static void main(String args[]) {
        loop(0);
    }
    public static void loop(int num1) {
        if (num1 <= 100) {
            System.out.println(num1);
            loop(num1 + 1);
        }
    }
}
