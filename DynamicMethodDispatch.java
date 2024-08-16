

class A{
public void show(){
    System.out.println("in A show");
}
}


class B extends A{
    public void show(){
        System.out.println("in ABshow");
    }
}
class C extends A{
    public void show(){
        System.out.println("in c show");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args){
    A obj= new A();  // TYPE OF OBJ IS 'A'; HOWEVER ITS IMPLEMENTATION IS B
    obj.show();
    obj.show();
    obj=new B();
    obj.show();
    obj= new C();
    obj.show();
    }
}
