class Mobile{
String brand;
int price;
static String name;

public void show1(){
    System.out.println(brand+":"+price+":"+name);
}
// using static void show() in order to make it a static method
public static void show(Mobile obj){
    //System.out.println(brand+":"+price+":"+name); // gives error for being instance variables
    System.out.println(obj.brand+":"+obj.price+":"+name); //class and object has been provided as arguments 
}
}


//now in main class,we will be calling the static method using class name, instead of the object name 

public class Static_method {
 public static void main(String[] args){
 Mobile mo=new Mobile();
 mo.brand="samsung";
 mo.price=130000;
 mo.name="radha";

 Mobile po=new Mobile();
 po.brand="nokia";
 po.price=22000;
 po.name="pooji";

mo.show1();
po.show1();

//        Mobile.show();// gives error 
Mobile.show(po); 

}   
}
