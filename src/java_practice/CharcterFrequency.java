package java_practice;

import java.util.HashMap;
import java.util.Scanner;
public class CharcterFrequency {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine().toLowerCase();
HashMap<Character, Integer> freqMap = new HashMap<>();
for (char ch : str.toCharArray()) {
if (Character.isLetter(ch)) {
freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
}
}
System.out.println("Character Frequencies: " + freqMap);
sc.close();
}
}