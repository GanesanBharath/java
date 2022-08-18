import java.util.Scanner;
public class matrixsum {
	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the value n");
		int n=a.nextInt();
		System.out.println("enter the value m");
		int m=a.nextInt();
		int b[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i][j]=a.nextInt();
			}
		}for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int c=0;
		for(int i=0;i<m;i++) {
			c+=b[i][2];
			}
		System.out.println(c);
	}
}
