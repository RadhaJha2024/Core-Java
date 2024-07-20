public class operators {
    public static void main(String[] args) {
        
    
 /*   arithmetic operators
  int num1=3;
    int num2=55;
    int c= num1/num2;
    int d=num1%num2;
    
   // num1= num1+3;
   // num1 += 3;
   // num1++; //post increment;
    ++num1;//pre increment
    int f=num1+num2;
    System.out.println(c);
    System.out.println(d);
    System.out.println(f);*/

//relational operators<,>,=,+,==,!=,<=,>=;
/*int x=6;
int y=3;
boolean result=x<y;
boolean result1=x>y;
boolean result2=x>=y;
boolean result3= x!=y;
boolean result4=x==y;

System.out.println(result);
System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
System.out.println(result4);
*/


//and && or|| and not! operators
// and-- even if one is false, it is false
//or-- tt t , tf t, ft t, ff f
//xor-- 

int x=7;
int y=5;
int a=5;
int b=9;

boolean result= x>y && a>b;// first gives t second gives f; an dof t and f is f which is the output

System.out.println(result);

boolean result1=x>y || a>b;
System.out.println(result1);// this gives true since its or operation

boolean result2=x<y || a>b;
System.out.println(result2);// this gives false since its or operation

// use of not logical operator
boolean re=a>b;
System.out.println(!re);// ! of real output

}
}
