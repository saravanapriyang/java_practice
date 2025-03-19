package java_practice;

import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
Arrays.sort(arr);
System.out.print("Array without duplicates: " + arr[0]);
for (int i = 1; i < n; i++) {
if (arr[i] != arr[i - 1]) {
System.out.print(" " + arr[i]);
}
}
sc.close();
}
}
