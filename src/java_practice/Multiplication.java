package java_practice;
import java.util.*;
public class Multiplication {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("num:");
	int num = sc.nextInt();
	for(int i=1;i<=num;i++){
		System.out.println(num*i);
	}
}
}
