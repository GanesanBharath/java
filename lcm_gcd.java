import java.util.Scanner;
public class lcm_gcd {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
    System.out.println("enter the 1 number:");
    int a=in.nextInt();
    System.out.println("enter the 2 number:");
        int b=in.nextInt();
        int lcm=2;
        int c = 0;
        for(;;) {
        if(lcm%a==0 && lcm%b==0) {
        break;
        }lcm++;  
        c=(a*b)/lcm;
       
        }
        System.out.println("the gcd is: "+c);
       
}
}


