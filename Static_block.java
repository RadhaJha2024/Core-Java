public class Static_block {
    int price;
    static String name;
    String brand;


static{
    name="phone";
    System.out.println("i am inside the static block");
}
public void show(){
    System.out.println(brand+":"+price+":"+name);
}
 //constructor is being created
 public Static_block(){
    int price;
    String name;
    String brand;
    System.out.println("i am the constructor");
 }
}
class Demo{
    public static void main(String[] args)
    throws ClassNotFoundException
    {
      //creating object
    //   Static_block sb=new Static_block();
    //   sb.price=15000;
    //   sb.name="opppo";
    //   sb.brand="android";
    //   sb.show();

    //   Static_block sbi=new Static_block();
    //   sbi.price=15000;
    //   sbi.name="opppo";
    //   sbi.brand="android";
    //   sbi.show();

    Class.forName("Static_block"); // this is rarely used; it calls the class first

    }
}