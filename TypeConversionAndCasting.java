public class TypeConversionAndCasting{
    public static void main(String[] args){

        byte b= 127;
        int a= 256;
        int z=257;
        //  b=a;// cannot convert from int to byte
        a=b;//explicit conversion is called as casting
       b=(byte)a;
        b=(byte)z;
       // type casting
        float f=2.6f;
        int x=(int)f;


        // this is TYPE PROMOTION;
        byte s=20;
        byte r= 10;
        // s*r gives byte result out of the range so we r using int
        int p= s*r;



        System.out.println(a);//127;256
        System.out.println(b);//127;0
        System.out.println(p);
        System.out.println(x);
    
       // System.out.println(z);
    

    

    
    }
}