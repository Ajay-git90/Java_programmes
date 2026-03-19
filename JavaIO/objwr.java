import java.io.* ; 

class Com implements Serializable
{
 String password ;
 void getpass(String str)
    { 
    password =str;
    } 
  void showpass()
        {
          System.out.println(password);
          }
}


class ObjW 
 {
  public static void main (String []s) 
      {
     try   { 
      Com c1=new Com();
       c1.getpass(s[0]);
       FileOutputStream fos=new FileOutputStream("T.txt");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject((Com)c1);
          fos.close();
           }
       catch (Exception e)
               {
                 System.out.println(e);
                }
            finally
                 {}
   
            }
  }



class ObjR 
{
 public static void main (String [] s) throws IOException , FileNotFoundException,ClassNotFoundException

   {
     Com c1;
      FileInputStream fis=new FileInputStream ("T.txt");
      ObjectInputStream ois =new ObjectInputStream (fis);
        c1=(Com) ois.readObject();
         c1.showpass();
    }
}