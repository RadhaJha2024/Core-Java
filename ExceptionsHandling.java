// errors -> compile time error, runtime error, logical error 



// public class Exceptions {
//     public static void main(String[] args)
//     {
//        System.out.Println("I am");   -> COMPILE TIME ERROR 
//        System.out.println(2+2);

//        //execution stops in runtime error 

//     }
// }



// exception handling using try catch block 
// statements can be normal or critical 
public class ExceptionsHandling{
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        try
        {
             j=18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        System.out.println(j);   // gives arithmetic exception
        System.out.println("GoodEvening");   // even this doesnt work since execution has stopped in above line ; 
    }
}