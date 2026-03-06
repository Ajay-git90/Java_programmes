class Bank
{
    void getRateOfInterest()
    {
        System.out.println("Generic  Bank Interest");
    }
}

class SBI extends  Bank 
{  void getRateOfInterest(){
    System.out.println("SBI Interest is 7%");
}
}
class HDFC extends Bank{
 void getRateOfInterest(){
    System.out.println("HDFC Interest rate is 8%");
 }
}
  
class inher1 
{
    public static void main (String [] s){
        Bank b1=new  SBI();
        Bank b2=new HDFC();
        b1.getRateOfInterest();
        b2.getRateOfInterest();
    }
}