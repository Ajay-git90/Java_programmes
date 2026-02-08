
class Complex {
  int real=1;
  int img=1;
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class (inherits Animal)
class Dog extends Complex {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
  class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        // Method of parent class
        d.eat();    // inherited from Animal

        // Method of child class
        d.bark();   // Dog's own method
    }
}
