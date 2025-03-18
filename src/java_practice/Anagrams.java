package java_practice;

import java.util.*;
public class Anagrams {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter chanr a");
	String a = sc.nextLine();
	System.out.println("enter chanr b");
	String b = sc.nextLine();
	char str1[] = a.toCharArray();
	char str2[] = b.toCharArray();
	Arrays.sort(str1);
	Arrays.sort(str2);
	if(Arrays.equals(str1, str2)) {
		System.out.println("it is anagrams");
	}else {
		System.out.println("it is not");
	}
	
}
}

