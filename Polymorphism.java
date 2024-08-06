// many behaviours
 // types are compile time and run time 
 //below is the code for runtime polymorphism

 class Animal{
    void eat(){
     System.out.println("eating");
    }

    class Cat extends Animal{
        void eat(){
            System.out.println("Cat is eating");
        }
    }

    class Dog extends Animal{
        void eat(){
            System.out.println("Dog is eating");
        }
    }
}

    public class Polymorphism{
        public static void main(String[] args){
            Animal a=new Animal(); 
            a.eat(); 
            a=new Cat();  
            a.eat();
            a=new Dog(); 
            a.eat();  
            
        }
    }
 