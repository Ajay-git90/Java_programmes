import java.util.Scanner;

class Largest_inArray {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] ar = new int[size];
         System.out.println("Enter the elements of Arrray");
        for (int i = 0; i <=size; i++) {
           
            ar[i] = sc.nextInt();
        }
        int temp = ar[0];
        for (int i = 0; i <=size; i++) {
            
            if (ar[i+1] > ar[i ]) {
                temp = ar[i+1];
            }
        }
        System.out.println(temp);
    }
}
