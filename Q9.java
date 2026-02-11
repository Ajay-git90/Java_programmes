//COUNT VOWELS IN A STRING

import java.util.Scanner;

class Vowel_count {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        str=str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
          if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u'){
               count++;
          }
        }
      System.out.println("Number of vowels :"+count);
    }

}
