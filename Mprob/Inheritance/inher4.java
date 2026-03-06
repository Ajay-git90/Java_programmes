class Person {
    void role(){
        System.out.println("I am a Person");
    }
}

class Teacher extends Person 
{
    void role ()
    {
        System.out.println ("I am a Teacher");
    }
    void subject(){
        System.out.println("I teach java");
    }
}

class inher4{
    public static void main (String [] s){
        Person p =new Teacher();
        p.role();
        p.subject();
    }
}
