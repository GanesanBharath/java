import java.util.Scanner;
public class reverse {
	public static void main(String args[]) {
		int n,r,s=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the value ");
		n=a.nextInt();
		while(n!=0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
			System.out.println("The reverse is "+s);
		
		
	}

}
