import java.util.Scanner;
public class duplicate {

	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the size of array: ");
		      int n = sc.nextInt();
		      int arr[] = new int[n];
		      int arr1[] = new int[n];
		    
		      System.out.println("Enter " +n+ " array elements between 0 to "+(n-1));
		      for(int i=0; i<n ; i++) {
		         arr[i] = sc.nextInt();
		         arr1[arr[i]]++;
		      }
		      for(int i=0; i<n; i++) {
		          if(arr1[i]>1)
		            System.out.println(i +" is repeat at "+ arr1[i] + " times");
		      }
		 }
		}   