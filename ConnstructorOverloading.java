public class  ConnstructorOverloading {  
    //instance variables of the class  
    int id,passoutYear;  
    String name,contactNo,collegeName;  
      
    ConnstructorOverloading(String contactNo, String collegeName, int passoutYear){  
    this.contactNo = contactNo;  
    this.collegeName = collegeName;  
    this.passoutYear = passoutYear;  
    }  
      
    ConnstructorOverloading(int id, String name){  
    this("01010101010", "YMCA", 2025);  
    this.id = id;  
    this.name = name;  
    }  
      
    public static void main(String[] args) {  
    //object creation  
   ConstructorOverloading s = new ConstructorOverloading(101, "John");  
    System.out.println("Printing Student Information: \n");  
    System.out.println("Name: "+s.name+"\nId: "+s.id+"\nContact No.: "+s.contactNo+"\nCollege Name: "+s.contactNo+"\nPassing Year: "+s.passoutYear);  
    }  
    }  
