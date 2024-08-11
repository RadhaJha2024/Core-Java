public class Strings {
    public static void main(String[] args){

    String name= "Radha";// this will not be added in the capacity;

    StringBuffer sa= new StringBuffer();
    System.out.println(sa.capacity());

    // this will be added in the capacity
    StringBuffer sb= new StringBuffer("Radha");// this will give capacity of 16+5;
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    // append string
    sb.append( " Jha");
    System.out.println(sb);
    //deleting a character
    sb.deleteCharAt(2);
    System.out.println(sb);
    String str=sb.toString();
    System.out.println(str);//gives Raha Jha
    //inserting an element
    sb.insert(0," Java ");
    System.out.println(sb);
    sb.setLength(30);
    System.out.println(sb);
    sb.ensureCapacity(100);
    System.out.println(sb);
    }
}

