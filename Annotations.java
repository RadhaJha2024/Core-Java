//annotations are supplement to the compiler or runtime
@Deprecated

class A{
    
    public void ShowTheDataBelongingToThisClass()
    {
System.out.println("in A show");
    }
}

class B extends A{
    @Override
    public void ShowTheDataBelongingToThisClass()
    {
        System.out.println("in B show");
    }
}


public class Annotations {
    public static void main(String[] args)
    {
        B obj= new B();
        obj.ShowTheDataBelongingToThisClass();
    }
}
