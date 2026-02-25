import java.util.Scanner;

public class fact_reccursion {
    private static long fact(int n) {
        if (n <= 1) return 1;// base case
        return n * fact(n - 1);// recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + fact(num));
    }
}
