import java.net.SocketPermission;
import java.util.Scanner;

class SS {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to perform the operations on");
        String str = sc.nextLine();
        System.out.println("...... --: MENU :-- .....");
        System.out.println("Enter 1 for string length");
        System.out.println("Enter 2 for concatination");
        System.out.println("Enter 3 for charAt");
        System.out.println("Enter 4 for getchars");
        System.out.println("Enter 5 to check if two strings are equal or not");
        System.out.println("Enter 6 for Equals ignore case");
        String choice = sc.nextLine().trim();
        int n = Integer.parseInt(choice);

        switch (n) {
            case 1:
                System.out.println("String Length ==>" + str.length());
                System.out.println();
                System.out.println();

                break;

            case 2:
                System.out.print("Enter string to cancatinate in previous string");
                String sp = sc.nextLine().trim();
                System.out.println(str + sp);
                break;

            case 3:
                System.out.println("Enter the index no. to find the character at the index");
                int index = sc.nextInt();
                if (index >= 0 && index < str.length()) {
                    System.out.println(str.charAt(index));
                } else
                    System.out.println("Invalid  Index Number");
                break;

            case 4:
                System.out.println("Enter the Starting index of string for buff");
                int x = sc.nextInt();
                System.out.println("Enter the  end index for the buff");
                ;
                int y = sc.nextInt();
                System.out.println("Enter the size of buff array");
                int z = sc.nextInt();
                char[] buff = new char[z];
                System.out.println("Enter the offset index for buff");
                int d = sc.nextInt();
                String fg = sc.nextLine();
                str.getChars(x, y, buff, d);
                break;
            case 5:
                System.out.println("Enter the  string to check if it equal to previous String");
                String sq = sc.nextLine();
                boolean b = equals(str, sq);
                System.out.println(b);
                break;
            /*
             * case 6:System.out.println()
             * str.equalsIgnoreCase(str1);
             */
        }
    }   //Main function ends here

                     static boolean equals(String s1, String s2)  {
                       if (s1.length() != s2.length())
                          return false;
                            for (int i = 0; i < s1.length(); i++) {
                               if (s1.charAt(i) != s2.charAt(i)) {
                              return false;
                          }
                       }
                   return true;
                          }
                          
                        static boolean equalsIgnoreCase(String s1,String s2){
                           if(s1.length() != s2.length())
                               return false;
                                 for (int i=0;i<s1.length();i++){
                               if(Character.toLowerCase(s1.charAt(i))!= Character.toLowerCase(s2.charAt(i))){
                              return false;
                                   }   
                                     }
                             return true;
                            }





} //class ends
