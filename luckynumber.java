import java.util.Scanner;

public class luckynumber {
    public static void main(String[] args) {
        System.out.println("Enter four digit number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (!(n > 999 && n < 10000)) {
            System.out.println(n + " is not four digit number");
        } else {
            int fourthDigit = n % 10; // D
            int thirdDigit = (n / 10) % 10; // ABC % 10=C
            int secondDigit = (n / 100) % 10; // AB % 10 =B
            int firstDigit = (n / 1000) % 10; // A%10=A
            if (firstDigit + secondDigit == thirdDigit + fourthDigit) {
                System.out.println("Lucky Number");
            } else {
                System.out.println("Not Lucky Number");
            }

        }
    }
}