import java.util.Scanner;

class Q12 {
  public static void main(String[] s) {
    Scanner ss = new Scanner(System.in);
    System.out.println("Enter the size of Array");
    int size = ss.nextInt();
    int ar[] = new int[size];
    System.out.println("Enter the  array elements");
    int sum=0;
    for (int i = 0; i < size; i++) {
      ar[i] = ss.nextInt();
      sum=sum+ar[i];
    }
  
    

    System.out.println("Sum of Elements :" + sum);
  }
}
