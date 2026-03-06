class Shape {
    void draw(){
        System.out.println("Drawing Shape");
    }    
}
class Circle extends Shape {
void draw(){
    System.out.println("Drawing Circle");
}
}

class Rectangle extends Shape {
    void draw (){
        System.out.println("Drawing Rectangle");
    }
}
class inher3 {
    public static void main (String [] s){
        Shape ss=new Shape();
        Shape s1=new Circle();
        Shape s2=new Rectangle();
        ss.draw();
        s1.draw();
        s2.draw();
        
    }
}
