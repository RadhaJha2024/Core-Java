// we are creating two classes, both having constructors;
//

    class A{

        public A(){
          super();
          System.out.println("in a");
        }

        public A(int n){
            super();
            System.out.println("in A int");
        }
    }
         

    class B extends A{
        public B(){
            super();
            System.out.println("in B");
        }

        public B(int m){
              super(m);
              System.out.println("in B int");
        }
    }




    public class ThisAndSuper {
        public static void main(String[] args){
            B obj=new B(5);
        }
}
