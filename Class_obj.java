 class Calculator
 {
    int a; // variable- outside method and inside class;
    public int add(int n1,int n2) //methods inside class
    {
      //System.out.println("in add");
      int a= n1+n2;

      return a;
    }
 }
 
 
 public class Class_obj{
    
    public static void main(String[] args){

        // int numb1=33;
        // int numb2=44;
        //calling the method;
       // add(); //gives error in java
       Calculator cal=new Calculator(); //cal is reference variable;and this is creation of the object
       int resulta= cal.add(45,54);
       System.out.println(resulta);

        //int  result=numb1+numb2;  // this is action(behaviour) and action is done through methods;
        //System.out.println(result);
    }
 }


