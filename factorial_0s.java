import java.util.Scanner;
public class factorial_0s {

	public static void main(String[] args) {
		int n,i,fact=1,rem=0,count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the factorial number");
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial number is "+fact);
		while(fact!=0) {
			rem=fact%10;
			fact=fact/10;
		if(rem==0) {
			count++;
		}}
		System.out.println(count);
	}

}
