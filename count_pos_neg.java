import java.util.Scanner;
public class count_pos_neg {

	public static void main(String[] args) {
		int a[]=new int[5];
		int pos=0,neg=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first values: ");
		
		for(int i=0;i<5;i++) {
			a[i] =in.nextInt();
			if (a[i]>0) {
				pos++;
			}
			if (a[i]<0) {
				neg++;
			}
			
	}System.out.println( "the number of positive count is "+pos);
	System.out.println("the number of positive count is "+neg);

	}}

