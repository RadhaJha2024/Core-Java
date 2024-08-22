interface A
{
    //interface shows the design of behaviour, which is achieved by the object itself using class 
    //interface is not a class, while abstract is
    int age=22;  //final and static by default
    String area="Area";
    void show();
    void config();
}



class B implements A{
   // implements interface methods
   //if u said implements, you have to define both the methods contained in an interface, else the class becomes an abstract class 
   public void show()
   {
    System.out.println("in show");
   }

   public void config()
   {
    System.out.println("in config");
   }

}


public class Interface2 {
    public static void main(String[] args){
       // A obj;
      A obj = new B();
       obj.show();
       obj.config();
       //System.out.println(A.area);
    }
    
}
