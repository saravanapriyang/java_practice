package java_practice;
import java.util.*;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("enter character");
char ch = sc.next().toLowerCase().charAt(0);
if(ch== 'a' || ch== 'e' || ch== 'i'|| ch== 'o' || ch== 'u') {
	System.out.println("vowel");
}else {
	System.out.println("consonant");
}
	}

}
