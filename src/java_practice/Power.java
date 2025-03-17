package java_practice;
import java.util.*;
public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("base");
		int base = sc.nextInt();
		System.out.println("exponent");
		int exponent = sc.nextInt();
		int result =1;
		for(int i=0;i<exponent;i++) {
			result *=base;
		}
		System.out.println(result);
		
	}

}
