package java_practice;
import java.util.*;
public class StrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter num:");
		int num = sc.nextInt();
		int temp=num, sum=0;
		while(temp>0) {
			int digit =temp%10;
			sum+= factorial(digit);
			temp/=10;
		}
		System.out.println((sum==num)?"Strong number" : "not");
	}
	static int factorial(int n) {
	int fact=1;
	for(int i=2;i<=n;i++) {
		fact*=i;
	}
	return fact;
}
}
