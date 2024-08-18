class A{
    int age;
    public void show(){
        System.out.println("in show of class A");

    }

    static class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        A obj= new A();
        obj.show();
       // for non static class A.B obj1= obj.new B();
       // for static the syntax is 
       A.B obj1= new A.B();
        obj1.config();
    }
    
}
