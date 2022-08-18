import java.util.Scanner;
public class nthprime {

	public static void main(String[] args) {
		int num=1,count=0,i;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the nth prime number");
		int b=a.nextInt();
		while(count<b) {
			num=num+1;
			for(i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if (i==num) {
				count=count+1;																	;
			}
		}
		System.out.println("The " + b +"th prime number is: " + num);
	}

}
