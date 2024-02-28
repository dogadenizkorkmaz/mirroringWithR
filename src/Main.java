import java.util.Scanner;
public class Main {
    public static void recursive(int n) {//method here
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        recursive(n - 5);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//define scanner
        System.out.print("Enter the Number: ");//get value from user
        int n = input.nextInt();
        recursive(n); //call method
    }
}
