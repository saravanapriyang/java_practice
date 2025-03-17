package java_practice;
import java.util.*;
final class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("a");
		int a = sc.nextInt();
		System.out.println("b");
		int b = sc.nextInt();
		int gcd = a, temp = b;
		while (temp != 0) {
		int temp2 = temp;
		temp = gcd % temp;
		gcd = temp2;
		}
		int lcm = (a * b) / gcd;
		System.out.println("LCM: " + lcm);
	}

}
