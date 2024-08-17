abstract class Car{
    public abstract void drive(); // this is an abstract keyword
    // not implementing anything, still works in java 
    public abstract void fly();
    

    public void playmusic(){
    System.out.println("play music ");
    }
}

abstract class wagonR extends Car{
    // i want this to implement the drive feature 
    // i will define it here
    public void drive(){
        System.out.println("driving");
    }

    public void fly(){
        System.out.println("car is flying...");
    }

}

class UpdatedOne extends wagonR{    // this is a concrete class
    public void fly(){
        System.out.println("the objecct is flying ...");
    }

}


public class AbstractKeyword {
    // abstract keyword is a non access modifier 
    //can be achieved with either abstract classes or interfaces 
    public static void main(String[] args){
        //    Car obj= new Car(); // cant create object of an abstract class
        Car obj= new UpdatedOne();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}
