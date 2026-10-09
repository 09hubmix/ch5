import java.util.Scanner;

public class Quadratic {
	
	public static double solvepositive(int a, int b, int c, double discriminant) {
		return (-b + Math.sqrt(discriminant))/ (2 * a);
	}

		public static double solvenegative(int a, int b, int c, double discriminant) {
		return (-b - Math.sqrt(discriminant))/ (2 * a);
	}
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter a: ");
	if (!in.hasNextInt()) {
		System.out.println("You must enter a number");
		return;
	}
	int a = in.nextInt();
	
	System.out.println("Enter b: ");
	if (!in.hasNextInt()) {
		System.out.println("You must enter a number");
		return;
	}
		int b = in.nextInt();
	
	System.out.println("Enter c: ");
	if (!in.hasNextInt()) {
		System.out.println("You must enter a number");
		return;
	}
	int c = in.nextInt();
	
	double discriminant = Math.pow(b, 2) - 4 * a * c;
	
	if (a == 0) {
    System.out.println("The a value cannot equal zero");
	} else if (discriminant < 0) {
    System.out.println("The discriminant cannot be less than zero");
	} else {
    System.out.println("X equals: " + solvepositive(a, b, c, discriminant)
        + " and " + solvenegative(a, b, c, discriminant));
}
}
}
