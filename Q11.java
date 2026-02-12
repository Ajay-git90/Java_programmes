import java.util.Scanner;

class Largest_inArray {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        String str = sc.nextLine();
        int size=Integer.parseInt(str);
        int[] ar = new int[size];
         System.out.println("Enter the elements of Arrray");
        for (int i = 0; i <size; i++) {
           
            ar[i] = sc.nextInt();
        }
        int temp = ar[0];
        for (int i = 0; i <size; i++) {
            if(ar[i]>temp)
                temp=ar[i];
        
        }
        System.out.println(temp);
    }
}
