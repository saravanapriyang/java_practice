package java_practice;
import java.util.*;;
public class SumOfDight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("num");
int num = sc.nextInt();
int sum =0;
while(num!=0) {
	sum += num%10;
	num/=10;
}
System.out.println("sum: "+sum);

	}

}
