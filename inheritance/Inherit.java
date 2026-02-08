class rect {
    int length, breath;

    rect() {}

    rect(int l1, int b1) {
        length = l1;
        breath = b1;

    }

    void display() {
        System.out.println("length....   " + length + "breath....  " + breath);
                    }
}

class box extends rect 
{
int height;
    box(){}
  box (int length,int breath,int height){
    this.length=length;
    this.height=height;
    this.breath=breath;
  }
  double area(){
    int ara=2*(length+breath);
    return ara;
  }
void display()
    {
    System.out.println(height);
    }
    void volume(){
       double vol=area()*height;
        System.out.println(vol);
    }
}


class Main {
    public static void main  (String [] s){
    box b=new box (3,4,6);
    }
}