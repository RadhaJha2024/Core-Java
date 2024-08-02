class calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
}

class AdvCalculator extends Calculator{
    public int add(int n1,int n2){
        return n1+n2+2;

    }
}

//above method overrides the Calculator method and the subsequent behaviour of the method will be displayed

public class MethodOverriding {
    public static void main(String[] args){
    AdvCalculator obj=new AdvCalculator();
    int r= obj.add(24,24);
    System.out.println(r);
    }
}
