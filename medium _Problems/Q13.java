import java.util.Scanner;

class Q13 {
   public static void main  (String  []  s){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the size of array");
    int size =sc.nextInt();
    int []  array=new int [size];
    System.out.println("Enter the arrray elements");
   
    for(int i=0;i<size;i++){
      array[i]=sc.nextInt();
      System.out.print(array[i]);
    }
       

   } 
}
