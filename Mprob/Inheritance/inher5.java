class Account {
    void message(){
        System.out.println("This is generic account");
    }
    void printMessage(){
        message();
    }
}

class SavingAccount extends Account {
    void message(){
        System.out.println("This is Saving Account");
    }
}
class inher5{
    public static void main (String [] s){
        Account a=new SavingAccount();
        a.printMessage();
    }
}