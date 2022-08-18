import java.util.*;
public class line_by_line {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("your character: ");
		String s=in.nextLine();
	char arr[]=s.toCharArray();

		int i, j ,a=0;   
		
		for(i=0; i<arr.length; i++)   
		{   
	
		for(j=0; j<=i; j++)   
		{   
		
		System.out.print(arr[a]); 
		a++;
		}   
if(a-1>=arr.length/2) {
	break;
}
		System.out.println();   
		}   }}