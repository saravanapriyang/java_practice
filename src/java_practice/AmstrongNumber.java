package java_practice;

import java.util.*;
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int temp = num;
		int sum =0;
		int length = String.valueOf(num).length();
			while(temp>0) {
				int digit = temp % 10; // Extract last digit
	            double result = Math.pow(digit, length); // Raise to power of length
	           //System.out.println(digit + "^" + length + " = " + (int) result); // Print calculation
	            sum += result; // Add to sum
	            temp /= 10; // Remove last digit
				
			}
			if(sum==num) {
				System.out.print("amstrong");
			}else {
				System.out.print("not");
			}
		}
}
