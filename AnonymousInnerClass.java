class A {
    public void show(){
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


public class AnonymousInnerClass {
    public static void main(String[] args){
    A obj= new A(){  // this is an anonymous inner class;
        public void show(){
            System.out.println("in new show");
        }
    }; // we r trying to override the behaviour of show()

    obj.show();
}
}