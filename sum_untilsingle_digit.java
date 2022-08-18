import java.util.*;
public class sum_untilsingle_digit {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("enter the values ");
		n=in.nextInt();
		while(n>0||sum>9) {
			if(n==0) {
				n=sum;
				sum=0;	
			}
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
	}

}
