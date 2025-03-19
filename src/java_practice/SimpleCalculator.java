package java_practice;

import java.util.*;
public class SimpleCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter num1");
	double num1 = sc.nextDouble();
	System.out.print("Enter an operator (+, -, *,/): ");
	char op = sc.next().charAt(0);
	System.out.print("enter num2");
	double num2 = sc.nextDouble();

	double result;
	switch (op) {
	case '+': result = num1 + num2; break;
	case '-': result = num1 - num2; break;
	case '*': result = num1 * num2; break;
	case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
	default: result = Double.NaN; System.out.println("Invalid operator!");
	}
	System.out.println("Result: " + result);
	sc.close();
}	
}

