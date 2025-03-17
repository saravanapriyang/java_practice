package java_practice;
import java.util.*;
public class CountNumbers {
	public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter num");
int num = sc.nextInt();
int count = 0;
while(num!=0) {
	num/=10;
	count++;
}
System.out.println(count);
}
}
