import java.util.Scanner;
public class CheckPrime{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the value of n");
        System.out.println(n);

        boolean flag= false;
        if(n==0||n==1){
               flag= true;
        }
       for(int i=2;i<n/2;++i){
        if(n%i==0){
            flag=true;
            break;
        }
       }
       if(!flag){
        System.out.println(n +"is a prime number");
       }
       else{
        System.out.println(n+"is not a prime number");
       }
    }
}