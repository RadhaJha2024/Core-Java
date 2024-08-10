class Encaps {
    private int age;
    private String name;
    private String hobby;
    // now since they are private, i have to make their methods in order to access them;
    // public int getAge(){
    //     return age;
    // }

    // getting getters and setters through sourcename, this gives the variable "this";
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    //    Encaps en1=new Encaps();

    //     en1.age = age; //this also gives error
    }
    public String getName() {
        return name; 
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // public void setAge(int n){
    //  age=n;
    // }

    

}

public class This {
    public static void main(String[] args){
    Encaps en=new Encaps();
    // en.age=33;
    // en.name="rahul";
    // en.hobby="singing";
    // System.out.println(en.name);
    // System.out.println(en.age);// this will give error since age is private ;
    en.setAge(40);
   System.out.println(en.getAge());
    }

}

