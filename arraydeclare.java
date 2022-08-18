import java.util.Scanner;
public class arraydeclare {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("entr the value");
		int b=a.nextInt();
		int arr[]=new int[b];
		System.out.println("enter the single digit 5 ");
		System.out.println("enter the double digit 5");
		for(int i=0;i<b;i++) {
			arr[i]=a.nextInt();
		}
		int min=0;
		int max=0;
		for(int i=0;i<b;i++) {
			if(arr[i]<10&&arr[i]>0) {
				min=min+arr[i];
			}
			else if(arr[i]<100&&arr[i]>0) {
				max=max+arr[i];
			}
			else {
				System.out.println("it is three digit : "+arr[i]);
			}
		}
		System.out.println("single digit  "+min);
		System.out.println("double digit  "+max);
	}

}
