import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice to know prime or not");
        int n;
        n = s.nextInt();
        if (!(n % 1 == 0 && n % n == 0)) {
            System.out.println(n + " not prime");
        } else {
            System.out.println(n + " prime");
        }
    }
}
