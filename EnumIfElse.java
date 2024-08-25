enum Status
{
    RUNNING, FAILED, PENDING, SUCCESS;
}




public class EnumIfElse {
 public static void main(String[] args)
 {
    Status s= Status.PENDING;
    if(s==Status.RUNNING){
        System.out.println("heyy");
    }
    else if(s==Status.FAILED){
        System.out.println("Hello");

    }
    else if(s==Status.PENDING){
        System.out.println("Good day");
    }
    else{
        System.out.println("okay,thats it");
    }
 }
    

}
