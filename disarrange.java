import java.util.*;
public class disarrange {

	public static void main(String[] args) {
//		Scanner in =new Scanner(System.in);
//		System.out.println("enter the numbers : ");
//		int a=in.nextInt();
//		String str=String.format("%d",a);
//		for(int i=0;i<=String.valueOf(a).length();i++) {
//		if(i%2==0) {
//		System.out.println(str.charAt(i));
//		
//	}
//		}}}

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		System.out.println("enter the value:");
		int a=s.nextInt();
		int arr[]=new int[n];
		int b=n-1;

		while(a!=0) {
		arr[b]=a%10;
		a=a/10;   
		b--;                        
		}
		a=0;
		for(int i=0;i<n;i=i+2) {
		  a+=arr[i];
		  a=a*10;
		}
		a=a/10;
		System.out.println(a);
		}

		}
