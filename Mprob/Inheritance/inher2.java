class Employee{
    void calculateSalary(){
      System.out.println("Salary calculation of Employee");  
    }
}
class Manager extends Employee{
void calculateSalary() {
    System.out.println("Salary Calculation of Manager with bonus");
}
}

class inher2{
 public static void main (String []s){
    Employee e1 =new Manager();
    e1.calculateSalary();
}
}