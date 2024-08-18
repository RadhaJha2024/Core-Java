//taking input using scanner class
//package name
/*import java.util.*;
public class Input {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
// scanner is a class; sc is object; next() is a function
        String name= sc.nextLine();
        System.out.println(name);
// next, nextLine for full name, nextInt, nextFloat

    }
    
}*/
//take 2 variables as a and b as input using scanner class, and print their sum;
// import java.util.*;
// public class Input{
//     public static void main(String[]args)
//     {
//         @SuppressWarnings("resource")
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();
        

//         int b=sc.nextInt();
        
//         int sum= a+b;
//         System.out.println(sum);

//     }
// }


public class Input {
	public static void main(String[] args) {
		int i = 1, j = 10;
		do {
			j--;
		} while (++i < 5);
		System.out.println("i = " + i + " and j = " + j);
	}
}
 