import java.util.Scanner;

class Largest3 {
public static void main  (String [] s)
{
    int largest=Integer.MIN_VALUE;
    int slargest=Integer.MIN_VALUE ;
    int tlargest=Integer.MIN_VALUE;
   Scanner New=new Scanner(System.in);
   System.out.println("ENter the size of array");
   int size =Integer.parseInt(New.nextLine());
   int A[]=new int[size];
   System.out.println("Enter array  Elemnts");
   for(int i=0;i<size;i++){
    A[i]=New.nextInt();
    if(A[i]>largest){
       tlargest=slargest;
        slargest=largest;
        largest=A[i];
    }
    if(A[i]>slargest  && A[i]<largest){
        tlargest=slargest;
        slargest=A[i];
      }else if(A[i]>tlargest && A[i]<slargest){
        tlargest=A[i];
      }


   }
   System.out.println("Third Largest  Element : "+tlargest);
}
}
