package java_practice;

import java.util.*;
public class LargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("enter:");
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int largest = arr[num-1];
		System.out.println(largest);

	}

}
