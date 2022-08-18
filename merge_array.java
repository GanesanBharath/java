import java.util.Scanner;
public class merge_array {

	public static void main(String[] args) {
		int k=0;
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first values: ");
		
		for(int i=0;i<5;i++) {
			a[i] =in.nextInt();
			c[i]=a[i];
			}
		System.out.println("enter the second values: ");
		for(int i=0;i<5;i++) {
			b[i] =in.nextInt();
			c[i+5]=b[i];
		}
//		for(int i=0;i<5;i++,k++) {
//			c[i]=a[i];
//		}
//		for(int i=0;i<5;i++,k++) {
//			c[i]=b[i];
//		}
			
		System.out.println("merge the two values: ");
		for( int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

	}

}
