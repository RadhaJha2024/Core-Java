// throws" keyword 
//checked exceptions

//8716328580;2908


class A
{
    public void show() throws ClassNotFoundException
    {
          Class.forName("DuckingException");
        
        
    }
}




public class DuckingException {
 static{
    System.out.println("class has been loaded");
 }
        public static void main(String[] args) 
        {
           
            A obj= new A();
            try {
                obj.show();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           
        }   
       }
       



