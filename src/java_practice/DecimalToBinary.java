package java_practice;

import java.util.*;
public class DecimalToBinary{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a decimal number: ");
	int num = sc.nextInt();
	System.out.println("Binary representation: " + Integer.toBinaryString(num));
	}
}
