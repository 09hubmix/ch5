import java.util.Scanner;

public class Triangle {
	
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	
	//length of stick 1
	System.out.println("Enter length of stick 1");
	if (!in.hasNextInt()) {
		System.out.println("Stick length must be a number");
		return;
	}
	int stick1 = in.nextInt();
	if (stick1 <= 0) {
		System.out.println("Stick length must be larger than zero");
		return;
	}
	
	//length of stick 2
	System.out.println("Enter length of stick 2: ");
	if (!in.hasNextInt()) {
		System.out.println("Stick length must be a number");
		return;
	}
	int stick2 = in.nextInt();
	if (stick2 <= 0) {
		System.out.println("Stick length must be larger than zero");
		return;
	}
	//length of stick 3
	System.out.println("Enter length of stick 3: ");
	if (!in.hasNextInt()) {
		System.out.println("Stick length must be a number");
		return;
	}
	int stick3 = in.nextInt();
	if (stick3 <= 0) {
		System.out.println("Stick length must be larger than zero");
		return;
	}
	if (stick1 > stick2 + stick3 || stick2 > stick1 + stick3 || stick3 > stick1 + stick2) {
		System.out.println("Your sticks cannot form a triangle");
	} else {
		System.out.println("Your sticks can form a triangle!");
	}
}
}


