//example 1;
/*import java.util.*;
public class conditional {
    public static void main(String[] args){
    
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        
        if(age>=18){
            System.out.println("eligible for voting amd is an adult");

        }
        else{
            System.out.println("not an adult, cannot vote");

        }
    }
    
}*/

//example2; if number is odd or even
/*import java.util.*;
public class conditional{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        if(x%2==0){
            System.out.println("provided number is an even number");
        } else{
            System.out.println("its an odd number");
        }
    }
}*/

//example3: take a and b as input and apply equal,greater or smaller conditions in loop of [if,else if,......else]
/*import java.util.*;
public class conditional{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==b){
            System.out.println(" a is equal to b");
        }else if(a>b){
            System.out.println("a is the greater one");
        }else{
            System.out.println("a is the smaller");
        }
        

    }
}
*/

//printing greetings using if else loop
/*import java.util.*;
public class conditional{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();

        if(button==1){
            System.out.println("hello");
        }
        else if(button==2){
            System.out.println("namaste");
        }
        else{
            System.out.println("bonjour");
        }
    }
}*/

//using switch condition
/*import java.util.*;
public class conditional{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();

        switch(button){
            case 1:System.out.println("hello");
            break;

            case 2:System.out.println("namaste");
            break;

            case 3:System.out.println("bonjour");
            break;

            default:
            System.out.println("its an invalid button");

        }
    }
}

*/

//ternary operator


/* 
public class conditional{
public static void main(String[] args){
    int n=5;
    int result=0;
    result=n%2==0? 10: 20;// condition provided? is true: is false;

    System.out.println(result);
}
}
*/

// updated version in java having switch
//program having alarm days' timings
/*import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String day= sc.nextLine();
        switch(day){
            case"sat","sun"-> System.out.println("6 am");
            case"monday"-> System.out.println("7am");
            case"tuesay","wed"->System.out.println("9am");
            default->System.out.println("what is this dear");
        }
    }
}
*/
// switch  as an expression
//take a variable say result;instead of using syso everytime,replace it with result=""; this will provide the same result;


// we can simply write the code as 
//case"sat"->"6am";
//case"sat": yield"6am";
