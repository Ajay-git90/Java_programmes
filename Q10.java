import java.util.Scanner;

class Words_count {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentance");
        String str = sc.nextLine();
        int count=0;
        str=str.trim(); //--> remove leading or trailing spaces
        String  words[]=str.split("\\s+");

        //---> Previous solution before using "trim()" and "split()" methods
       /* for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)!=' ' && (i==0 || str.charAt(i-1)== ' ')){
             count++;
           }
        }
       System.out.println("NUmber of words :"+(count+1));
    */
    System.out.println("Number of words : "+words.length);
    }
}
