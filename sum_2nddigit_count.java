import java.util.Scanner;
public class sum_2nddigit_count {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d,e,f,g,h;
		System.out.println("first element please...");
		a=in.nextInt();
		System.out.println("second element please...");
		b=in.nextInt();
		System.out.println("third element please...");
		c=in.nextInt();
		System.out.println("fourth element please...");
		d=in.nextInt();
		a=a/10;
		e=a%10;
		b=b/10;
		f=b%10;
		c=c/10;
		g=c%10;
		d=b/10;
		h=c%10;
		System.out.println(e+f+g+h);
	}
}
