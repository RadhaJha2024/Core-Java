enum Days{
    MONDAY,THURSDAY,FRIDAY,SATURDAY;
}


public class EnumSwitch {
public static void main(String[] args)
{Days d= Days.MONDAY;

    switch(d){
        case MONDAY:
        System.out.println("its monday");
          break;

        case FRIDAY:
        System.out.println("Its Friday"); 
        break;
        
        case SATURDAY:
        System.out.println("its saturday");
        break;
    }
  }
    
}
