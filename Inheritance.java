class A{

}
class B{

}
class C extends B{

}
public class Inheritance {
    public static void main(String[] args){
InhAdvCalc obj=new InhAdvCalc();
int r= obj.mul(4,6);
int s= obj.div(5,4);
int t= obj.sub(9,5);
int u= obj.add(222,444);
//double v = obj.power(2,2);
System.out.println(r+" "+s+" "+t+" "+u+" ");
    }
}
