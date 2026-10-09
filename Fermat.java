import java.util.Scanner;

public class Fermat {

    public static boolean fermatWrong(int a, int b, int c, int n) {
        return n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.print("Enter c: ");
        int c = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();

        if (fermatWrong(a, b, c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
}
