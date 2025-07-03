

   class Animal {
        void sound()
        {
            System.out.println("Animal makes a sound");
        }
    } 
   class Dog extends Animal {
        void sound()
        {
            System.out.println("Dog barks");
        }
    }
     class Cat extends Animal {
        void sound()
        {   
            System.out.println("Cat meows");
        }
    }
public class Inheritance {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound(); // Outputs: Dog barks
        myCat.sound(); // Outputs: Cat meows
    }
 }
    

