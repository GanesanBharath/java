import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		int n,r,sum=0,n1;
		Scanner a= new Scanner(System.in);
		System.out.println("enter the values ");
		n=a.nextInt();
		n1=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("its  palindrome number "+sum);
		}
		else {
			System.out.println("its not palindrome number "+n1);
		}
	}}


