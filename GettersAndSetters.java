class Human{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }

    public void SetAge(int a){
        age=a;

    }

    public String GetName(){
        return name;

    }
    public void setName(String n){
        name=n;
    }
}

public class GettersAndSetters {
    public static void main(String[] args){
        Human obj= new Human();
        obj.SetAge(30);
        obj.setName("Radha");
        System.out.println(obj.GetName() + ":" + obj.getAge());
    }
}
