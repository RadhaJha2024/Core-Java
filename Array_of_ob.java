class Student{
    int rollno;
    String name;
    int marks;
}

public class Array_of_ob {
    public static void main(String[] args) {
        //creating record of three students using objects
        Student s1=new Student();
        s1.rollno=1;
        s1.name="Radha";
        s1.marks=99;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="Sudha";
        s2.marks=98;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="Gazala";
        s3.marks=97;

        //creating an array to store these records
        Student record[]=new Student[3];
        record[0]=s1;
        record[1]=s2;
        record[2]=s3;
       //  for(int i=0;i<record.length;i++){
         //   System.out.println(record[i].name +":"+record[i].marks);
         //}




         //enhanced loop
         for(Student re:record){
            System.out.println(re.name+" : "+re.rollno+ " : "+ re.marks);
         } 
    
    }
}
