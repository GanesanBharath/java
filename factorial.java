import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int n,i,fact=1;
		Scanner in= new Scanner(System.in);
		System.out.println("enter the fact number");
	    n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial number is "+fact);


	}

}