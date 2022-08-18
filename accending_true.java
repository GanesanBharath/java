import java.util.*;
public class accending_true {

	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		String a=in.nextLine();
		System.out.println(a);
		System.out.print("enter the 10 values : ");
		int sum = 0; 
		for (int i = 0; i < 10; i ++){ 
			in.nextInt(); 
		} 
		if( sum <=10 ) { System.out.print("True");
	      }else {
	          System.out.print("false ");
	}
	}
}

