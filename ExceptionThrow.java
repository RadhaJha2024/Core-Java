public class ExceptionThrow {
 public static void main(String[] args)

 {

    // int i=20; // gives no exception
    int i=20;
    int j=0;

     try
     {
          j=18/i;
     
     // EVEN IF CATCH IS NOT CALLED, I WANNA CALL IT 
        if(j==0)
        throw new ArithmeticException(" I dont want to print zero");
       System.out.println("thats the default O/P" );
     }
     catch(Exception e )
     {
        System.out.println("Something went wrong" +e);
     }
     System.out.println(j);
     System.out.println("Bye");
 }   


}
