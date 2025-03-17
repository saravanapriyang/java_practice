package java_practice;

import java.util.Scanner;

import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter num");
	int n = sc.nextInt();
	boolean isPrime = true;
	if(n<=1) {
		isPrime= false;
	}else if(n%2==0){
		isPrime = false;
	}
	if (isPrime) {
		System.out.println(n + " is a Prime Number");
		} else {
		System.out.println(n + " is not a Prime Number");
		}
	
	}
}
