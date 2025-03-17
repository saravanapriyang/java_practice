package java_practice;

import java.util.Scanner;
public class SecondLargest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
for (int num : arr) {
if (num > first) {
second = first;
first = num;
} else if (num > second && num != first) {
second = num;
}
}
if (second == Integer.MIN_VALUE) {
System.out.println("No second largest element");
} else {
System.out.println("Second Largest Element: " + second);
}
sc.close();
}
}