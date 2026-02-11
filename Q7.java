
import java.util.Scanner;
public class Q7 {
public static void main (String [] S){
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter String 1");
 String str1=sc.nextLine();
 System.out.println("Enter String 2");
 String str2=sc.nextLine();
 boolean b=str1.equals(str2);
 if (b==true){
    System.out.println("Strings are  equal");
 } else{
    System.out.println("Strings are not equal"); 
}
}    
}
