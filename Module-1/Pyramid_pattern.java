import java.util.Scanner;

public class Pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows number: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {         
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();                    
        }
    }
}
