import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class UserInputBufferReader {
    public static void main(String[] args) throws IOException
    {
       System.out.println("Enter a number"); // println is the method of stream class ;
       // out is an object inside print stream; used as static variable in system class
      // System.in.read();   throws io exception 
   //  int num= System.in.read();
    // System.out.println(num-48);   // gives ascii value
    InputStreamReader in= new InputStreamReader(System.in);
    BufferedReader bf= new BufferedReader(in);
    
    int num= Integer.parseInt(bf.readLine()); // can also take input from file
    System.out.println(num);
    bf.close();


}
}
