class Demo{
    // constructor looks like a method itself
    private int age;
    private String name;
    // creating a constructor
    public Demo(){                  //default constructor
       // System.out.println("in constructor");
    age=12;
    name="radha";
    }

    public Demo(int age, String name){  //parameterized constructor
        this.age=4;
        this.name="JJ";
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}



public class Constructors {
    public static void main(String[] args){
        Demo obj=new Demo();
        Demo obj1=new Demo();
    //System.out.println(obj.getName());
    //System.out.println(obj1.getName());

//   obj.setAge(30);
//   obj.setName("radhe");
    }
}
