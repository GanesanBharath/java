import java.util.*;
public class f {

public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("enter the first name");
         String a=in.nextLine();
         System.out.println("enter the second name");
         String b=in.nextLine();
         char arr[]=a.toCharArray();
         char brr[]=b.toCharArray();
         int res=0;
         int c=0;
         for(int i=0;i<arr.length;i++) {
        res=0;
        for(int j=0;j<brr.length;j++) {
        if(arr[i]==brr[j]) {
        res=1;
        brr[j]=0;
        break;
        }
        }
        if(res!=0) {
        c++;
        }
         }
         int d=(a.length()+b.length())-(c*2);
         System.out.println(d);
         int s=d;
     String g = "flames";
         char grr[]=g.toCharArray();
         int e=1;
         if(d!=1) {
          while(g.length()>1) {          g="";
         for(int i=0;i<grr.length;i++) {
        if(grr[i]!=0) {
        if(e==d) {
         grr[i]=0;
         d=d+s-1;
         }
        else {
        g+=grr[i];
         e++;}
        }
         }        

          }
         }else {
        g="s";
         }
         System.out.println(g);
       switch(g) {
       case "f":
      System.out.println("friend");
      break;
       case "l":
      System.out.println("love");
      break;
       case "a":
      System.out.println("affection");
      break;
       case "m":
      System.out.println("marriage");
      break;
       case "e":
           System.out.println("enemy");
           break;
       case "s":
      System.out.println("sister");
      break;
       }
}

}