class Student 
{
    int id;
    String Name;
    int marks;
    Student(int id,String Name,int marks){
        this.id=id;
        this.Name=Name;
        this.marks=marks;
    }
    void display()
    {
        System.out.println("ID :  "+id+"\n"+"Name:  "+Name+"\n"+"Marks :  "+marks);
    }
    public static void main( String [] s)
    {
        Student s1=new Student(101,"Ajay",85);
       s1.display();
        
       

    }
}