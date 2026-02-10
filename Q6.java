class Test
 {
  void method1()
 {
  System.out.println("Method 1 called");
  
 }    
  void method2(){
    this.method1();
    System.out.println("Method 2 called");
 }
 public static void main (String []S)
 {
  Test t1=new Test();
  t1.method2();
 }
}
