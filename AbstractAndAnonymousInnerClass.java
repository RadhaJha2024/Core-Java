
abstract class A {
    public abstract void show();
    {
        System.out.println("in a show");
    }
}

// class B extends A
// {
// public void show()
// {
//     System.out.println("in B show");
// }
// }
class B extends A{
    public void show(){
        System.out.println("in the show");
    }
}

public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args){
    A obj= new A(){
     public void show(){
        System.out.println("in new show");
     }

    }; // we r creating the object of this anonymous inner class

    
    }
}