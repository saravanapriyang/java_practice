package java_practice;

import java.util.*;

public class PerfectNumber {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enetr number:");
	 int num = sc.nextInt();
	 int sum =0;
	 for (int i = 1; i <= num / 2; i++) {
		 if (num % i == 0) {
		 sum += i;
		 }
		 }
	 System.out.println((sum==num)? "perfect number" : "not");
	 
 }
}
