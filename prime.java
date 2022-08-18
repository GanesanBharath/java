import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter the value");
	int b=a.nextInt();
	int out=0;
	for(int i=2;i<=b/2;i++) {
		if(b%i==0)
		out=1;
		break;
	}

	if(out==0) {
		System.out.println(b  +" its is  prime");
		
	}
	else {
		System.out.println(b +" its is not prime");}
	}
}
