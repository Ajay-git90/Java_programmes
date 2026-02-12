 class Employee {
    static int count=0 ;
    Employee(){
        count ++;
    }
    void display(){
        System.out.print("Total  Employee : "+count);
    }
    public static void main(String [] s){
      Employee e1=new Employee();
      Employee e2 =new Employee();
      Employee e3=new Employee();
     e1.display();
     e2.display();
     e3.display();
    }
}
