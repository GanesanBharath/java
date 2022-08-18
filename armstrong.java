import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		int n,r,sum=0,n1;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the value : ");
		n=a.nextInt();
	    n1=n;
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("it is armstrong number "+n1);}
		else
		{
			System.out.println("it is not armstrong "+n1);
		}
		

	}

}
