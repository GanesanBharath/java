import java.util.*;
public class sum_constant_values {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the words");
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		int i,j, b=0,d=0;
		for(i=0;i<arr.length;i++) {
			char c='a';
			for(j=1;j<26;j++) {
				if(c==arr[i]) {
					b+=j;
					System.out.println(j);
                    if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
                    	d+=j;
				
			}
				c++;
		}
		
	}b=b-d;
System.out.println(b);
}}
}