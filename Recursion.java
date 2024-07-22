public class Recursion{
    static int c=0;
    static void r(){
        c++;
        if(c<5){
        System.out.println("a");
        
        r();
    }
}

    public static void main(String[] args) {
        r();
    }
}