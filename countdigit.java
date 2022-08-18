import java.util.Scanner;
public class countdigit {
	public static void main (String args[]) {
		Scanner a=new Scanner (System.in);
		int count=0;
		System.out.println("Enter the value ");
		int num =a.nextInt();
		while(num!=0) {
			num=num/10;
			count++;
			
		}
		
		System.out.println("The values are "+ count);
		
		
		
	}

}
