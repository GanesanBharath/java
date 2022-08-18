import java.util.Scanner;
public class sum_lastdigit_count {

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
		e=a%10;
		f=b%10;
		g=c%10;
		h=d%10;
		System.out.println(e+f+g+h);
}}