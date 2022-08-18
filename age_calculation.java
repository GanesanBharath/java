import java.time.LocalDate;  
import java.time.Period; 
import java.util.*;
public class age_calculation {

	public static void main(String[] args) {
		System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
		Scanner scanner = new Scanner(System.in);  
	
		String input = scanner.nextLine();  
		scanner.close();  
		
		LocalDate dob = LocalDate.parse(input);  
			System.out.println("You are " + calculateAge(dob)+" years old.");  
		}  
		
		public static int calculateAge(LocalDate dob)   
		{  
		   
		LocalDate curDate = LocalDate.now();  
		
		if ((dob != null) && (curDate != null))   
		{  
		return Period.between(dob, curDate).getYears();
		}
		else
		{
			return 0;
		}   

	}

}
