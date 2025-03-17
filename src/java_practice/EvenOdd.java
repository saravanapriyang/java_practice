package java_practice;

import java.util.*;
public class EvenOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter an num: ");
	int check = sc.nextInt();
	if(check%2==0) {
		System.out.print("even");
	}else {
	System.out.print("odd");
	}
}
}
