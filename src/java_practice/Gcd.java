package java_practice;

import java.util.*;
public class Gcd {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("a");
	int a = sc.nextInt();
	System.out.println("b");
	int b = sc.nextInt();
	while(b!=0) {
		int temp = b;
		b = a % b;
		a= temp;
				
	}
	System.out.println(a);
}
}
