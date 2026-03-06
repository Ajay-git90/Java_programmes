class Device {
    void start (){
        System.out.println("The Device is started");

    }
    void  runDevice(){
    start();
    }
}

class Laptop extends Device {
void start(){
 System.out.println("Laptop is started");
}
void runDevice(){

    System.out.println("runDevice of Child class");
    start();
}

}

class inher6 {
public static void main (String [] s){
    Device d=new Laptop();
    d.runDevice();
}

}