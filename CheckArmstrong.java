import java.util.*;

public class CheckArmstrong 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(number);
        int originalNumber,remainder,result=0;
        originalNumber=number;
        while(originalNumber!=0)
        {
            remainder=originalNumber%10;
            result+=Math.pow(remainder,3);
            originalNumber/=10;

        }

        if(result==number)
        {
        System.out.println(number + "is an armstrong number");
        }
        else
        {
        System.out.println(number + "is not an armstrong number");
         }
     }

    private static int nextInt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextInt'");
    }  

  }

