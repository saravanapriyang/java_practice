package java_practice;

import java.util.*;
public class SortArrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num");
	int num = sc.nextInt();
	int arr[] = new int[num];
	System.out.println("numbers");
	for(int i = 0;i<num;i++) {
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
}
}
