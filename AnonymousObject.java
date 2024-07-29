class A{
    public A(){ //CONSTRUCTOR
        System.out.println("object created");

    }
    public void show(){
        System.out.println("showing A");
    }
}

public class AnonymousObject {
    public static void main(String[] args)
{
    new A(); 
    new A();//ANONYMOUS OBJECT
    new A().show();
    //CANNOT BE USED AGAIN; 
}     
}
