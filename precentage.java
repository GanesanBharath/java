import java.util.*;
public class precentage {

	public static void main(String[] args) {
		float  percentage;
		float total_marks;
		float your_score;
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the your mark: ");
		your_score =in.nextFloat();
		System.out.println("enter the total marks: ");
		total_marks=in.nextFloat();
		percentage=(float)(your_score/total_marks)*100;
		System.out.println("your percentage"+percentage);
	
	}

}
