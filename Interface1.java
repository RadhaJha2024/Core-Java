// to make application loosely coupled ..
interface Computer{
     void code();

    }

// generalized this class

class Laptop implements Computer{
    public void code(){
        System.out.println("code,compile and run . .");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code,compile and run faster . .");
    }
}


class Developer{
    public void devapp(Computer lap){
       System.out.println("coding"); 
       lap.code();
    }
}

public class Interface1 {
    public static void main(String[] args){
        Computer lap=new Laptop();
        Computer desk= new Desktop();
        Developer Radha= new Developer();
        Radha.devapp(lap);
    }
    
}
