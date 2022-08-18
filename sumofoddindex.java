import	java.util.Scanner;
public class sumofoddindex {

	public static void main(String[] args) {
	 		
		Scanner s=new Scanner(System.in);
		int n,i,sum=0;
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array size:");
		
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
			if(i%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("The sum of even index numbers are:");
	}

}
