interface A{
    void dance();
    void read();
}

interface B{
    void play();
    void exercise();
}

interface D extends B{

}

//class - class -> extends
//class - interface -> implements
//interface - interface ->  extends
class C implements A,D{
    public void dance()
    {
        System.out.println("I am dancing on the floor");
    }

    public void play()
    {
        System.out.println("I am playing the piano");

    }

    public void read()
    {
        System.out.println("I am learning Interface");
    }

    public void exercise()
    {
        System.out.println("I am doing exercise");

    }
}


public class Interface3 {
    public static void main(String[] args)
    {
     A obj;
     obj=new C();
     B obj1= new C();
     obj1.play();
     obj.read();
     obj1.exercise();
     obj.dance();
    }
}
