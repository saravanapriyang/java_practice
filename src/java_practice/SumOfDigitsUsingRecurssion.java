package java_practice;

import java.util.*;
public class SumOfDigitsUsingRecurssion {
	static int sum(int num) {
		return (num == 0) ? 0 : (num % 10) + sum(num / 10);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Sum of digits: " + sum(num));
	}
	}

