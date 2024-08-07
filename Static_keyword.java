class Mobile{
    String brandname;
    int price;
    //use it with and without static keyword
    static String name;
    
    public void show()
    {
        System.out.println(brandname+ ":"+price+":"+name);

    }
}

public class Static_keyword {
  public static void main(String[] args){
  Mobile mo=new Mobile();
  mo.brandname="samsumg";
  mo.price=15000;
 mo.name="whatever";

 Mobile po=new Mobile();
 po.brandname="oneplus";
 po.price=18000;
 po.name="dontknow";

 mo.show();
 po.show();
  }  
}
