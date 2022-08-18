import java.util.Scanner;
public class negative_into_positive {

	public static void main(String[] args) {
		int n,p=1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the values ");
		n=in.nextInt();
		if(n<0) {
			p=n*(-1);
			//System.out.println("change the negative into positive " +p);
		}
		System.out.println("change the negative into positive " +p);
	}
	
}

