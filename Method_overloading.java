public class Method_overloading{
    //multiple methods can have same name with different parameters {
    static int method(int x, int y){
        return x+y;
    }
    static float method(float x,float y, float z){
        return x+y+z;
    }
    static char method(char a,char b){

        return 'a'+'b';    }


public static void main(String[] args)
{
    System.out.println(method(3,4));
    //or
    int value1= method(24,45);
    System.out.println(value1);
    float value2= method(5.63f,6.53f,57.75f);
    System.out.println(value2);
    int val3= method(55,55);
    System.out.println(val3);


}
}