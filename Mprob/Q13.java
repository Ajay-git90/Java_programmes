import java.util.Scanner;

class Q13 {
  public static void main(String[] s) {
    Scanner sc = new Scanner(System.in);
    int largest = Integer.MIN_VALUE, slargest = Integer.MIN_VALUE;
    System.out.println("Enter the size of array");
    int size = Integer.parseInt(sc.nextLine().trim());
    
    int[] array = new int[size];
    System.out.println("Enter the arrray elements");

    for (int i = 0; i < size; i++) {
      String ss = sc.nextLine();
      array[i] = Integer.parseInt(ss);
      if (array[i] > largest) {
        slargest = largest;
        largest = array[i];
      }else if(array[i]>slargest && array[i]<largest){
        slargest=array[i];
      }
    }
    if(slargest==Integer.MIN_VALUE)
    System.out.println("No Second Largest Element is Found" );
      System.out.println("Second Largest Element : " + slargest);
  }
}
