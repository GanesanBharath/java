import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
	int n,i,sum=0;
	Scanner a=new Scanner(System.in);
	System.out.println("enter the value ");
	n=a.nextInt();
	for(i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println("The sum value is "+sum);
	

	}

}
