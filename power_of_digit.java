import java.util.Scanner;
public class power_of_digit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,i,s;
		long power =1;
		System.out.println("enter the number: ");
		n=in.nextInt();
		System.out.println("enter the value: ");
		s=in.nextInt();
		for(i=1;i<=s;i++) {
			power=power*n;
		}
		System.out.println(power);

	}

}
