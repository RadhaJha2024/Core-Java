interface A
{
void show(int i, int j, int k);

}
// class B implements A{
//     public void show()
//     {
//         System.out.println("in show");
//     }
// }

public class LambdaExpression {
 public static void main(String[] args)
 {
   A obj= (i, j, k) ->
    
        System.out.println("in show");
    
   obj.show(6,6,8);  
 }  

}
