import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHierarchy {
    public static void main(String[] args){
    // object class
    // throwable (class) -> errors and exceptions
    // errors cant be handled eg, thread death; Io, virtual machine error, out of memory
    //in exceptions-> runtime exceptions and sql, IO..
    //runtime-> arithmetic, arrayIndexOutOfBound, NullPointer...... are unchecked exceptions
  
        
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
        }
    }
}

