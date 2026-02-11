import java.util.Scanner;
class reverse_string
 {
  public static void main(String [] s) {
   Scanner sp=new Scanner (System.in);
   System.out.println("Enter a String");
   String  sc=sp.nextLine();
   System.out.print("Reversed String :  ");
   for(int i=(sc.length())-1;i>=0;i--){
   System.out.print(sc.charAt(i));
   }
  }  
  }
