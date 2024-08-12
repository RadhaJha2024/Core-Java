public class For_each_loop{
    public static void main(String[] args){
   int nums[]=new int[4];
   nums[0]=2;
   nums[2]=3;
   nums[1]=4;
   for(int n : nums)
   {
    System.out.println(n);
   }
}
}



//enhanced loop
/*for(Student re:record){
    System.out.println(re.name+" : "+re.rollno+ " : "+ re.marks);
 }*/

