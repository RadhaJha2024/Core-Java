import java.util.Scanner;

public class FibonacciTriangle {
    public static void main(String[] args){
        int a=0,b=1;
        int c,i,j;
        System.out.println("enter the limit");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n);

        for( i=1;i<= n;i++){
            a=0;
            b=1;
        System.out.println("b");
        for(j=1;j<i;j++)
        {

            c=a+b;
            System.out.println("c");
            a=b;
            b=c;

        }       
     } 
    System.out.println("\n");
    }

}
