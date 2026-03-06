class Food {
    void type(){

        System.out.println("What is your food type?");
    }
    void serve(){
        type();
    }
}
class Pizza extends Food{
 void type(){
    System.out.println("My food type is pizza");
 }
}
class  Momo extends Food{
    void type (){
        System.out.println("My  food type is MOMO");
    }
}
class inher7{
    public static void main  (String [] s){
        Food f1=new Food();
        Food f2=new Pizza();
Food f3=new Momo();

        f1.serve();
        f2.serve();
        f3.serve();

    }
}
