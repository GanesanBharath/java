import java.util.Scanner;
public class sum_firstdigit_count {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c,d,e,f,g,h;
		System.out.println("enter the first value: ");
		a=in.nextInt();
		System.out.println("enter the second value: ");
		b=in.nextInt();
		System.out.println("enter the third value: ");
		c=in.nextInt();
		System.out.println("enter the fouth value: ");
		d=in.nextInt();
		a=a/100;
		
		b=b/100;
		
		c=c/100;
	
		d=d/100;
		g=a+b+c+d;
		System.out.println("the sum value is : "+g );
		
	}

}
