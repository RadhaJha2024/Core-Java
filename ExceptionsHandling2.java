
public class ExceptionsHandling2
 {
   public static void main(String[] args)
   {           

       int i=0;

       int j=0;
       int nums[]= new int[5];
       String str=null;

       try{
        j=19/i;
        System.out.println(str.length());
        System.out.println(nums[2]);
        System.out.println(nums[5]);// array index out of bound exception

       }
       catch(ArithmeticException e)
       {
        
        System.out.println("cant divide by zero");
       }

       catch(ArrayIndexOutOfBoundsException e)
       {
        System.out.println("stay here only");
       }

       catch(Exception e)  // parent class would be written at the end ;
       // else, other sub class exceptions might not even be needed to be worked upon;
       {
        System.out.println("hellowww");
       }
 System.out.println(j);
 System.out.println("Bye");

   } 

}
