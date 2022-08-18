import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the values ");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("before the swap a "+a);
		System.out.println("before the swap b "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after the swap a "+a);
		
		System.out.println("after the swap b "+b);
	}

}
