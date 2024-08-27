//enum is a class 
enum Laptop{
MACBOOK(2500),DELL(3200),XPS(2800),SURFACE,THINKPAD(9800),IDEAPAD(4509);
private int price;

private Laptop()
{
    price=500;
    System.out.println("in laptop" + this.name());
}
private Laptop(int price){
    this.price=price;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}


}





public class EnumClass {
    public static void main(String[] args){
    // Laptop lap=Laptop.MACBOOK;
    // System.out.println(lap + ":" + lap.getPrice());

    for(Laptop lap: Laptop.values()){
        System.out.println(lap + ":" + lap.getPrice()); 
    }
}
}
