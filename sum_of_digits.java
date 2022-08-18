import java.util.Scanner;
public class sum_of_digits {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("enter the value : ");
		i=in.nextInt();
		while(i>0) {
			n=i%10;
			sum=sum+n;
			i=i/10;
		}
		System.out.println(sum);
	}

}
