class Calculato{
    public void music(){
        System.out.println("music is playing");
    }
    //another method
    public String playchess(int cost){
        //System.out.println("i am playing chess");
        return "chess";
    }
}

public class Methodss{
    public static void main(String[] args){
        Calculato sree=new Calculato();
        sree.music();
        String str= sree.playchess(64);
        System.out.println(str);
   // music();
    //playchess(64); directly calling methods will not work here
    }
}