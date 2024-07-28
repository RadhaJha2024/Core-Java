//store multiple values in a single variable
// String[] cars;
// providing values={"x","y","z"};  ={2,4,6,8};
//access element--> refer its index number


/*

public class Arrays{
    public static void main(String[] args){
        String[] fruits= {"banana","apple","mango","pineapple","strawberry"};
          //accessing the elements from the array of strings

        System.out.println(fruits[2]); //gives output mango
          //chnaging an element from the array of strings

        fruits[1]="papaya";
        fruits[4]="mastmelon";
        System.out.println();
        System.out.println(fruits[4]);
          //finding the length of the array of string

        System.out.println(fruits.length);
        fruits[1]=" ";
        System.out.println(fruits[1]);
    }
}
*/


//loop through the array of string
//using FOR_LOOP and using the LENGTH PROPERTY to specify how many times should the loop be run
/*

public class Arrays{
    public static void main(String[] args){
        String[] veggies={"potato","tomato","brinjal","onion"};
        for(int i=0;i<veggies.length;i++){
            System.out.println(veggies[i]);
        }
    }
}

*/

//"FOR EACH LOOP" being exclusively used in array
/*public class Arrays{
    public static void main(String[] args){
        String[] friends={"contractor saab","locha","pritam","cutie:)"};
        for(String i: friends){
            System.out.println(i);
        }

    }
}
*/


//multidimensional array of strings; when u want to store data in tabular form with rows and columns

/* 
public class Arrays{
    public static void main(String[] args){
        String[][] family={{"vater","mother","cousin"},{"papa","mummy","sister"},{"vatto","mummy","sohn"}};
        
       
        System.out.println(family.length);
        family[0][2]="parents";
        System.out.println(family[0][2]);

        for(int i=0;i<family.length;i++){
            for(int j=0;j<family[i].length;j++){
            //System.out.println(family[i][j]);
            System.out.print(family[i][j]+ " ");}
            System.out.println();
        }
    }

}
*/

//using FOR EACH LOOP IN MULTIDIMENSIONAL ARRAY

/*public class Arrays{
    public static void main(String[] args){
    String[][] states={{"delhi","lucknow","prayagraj","goa"},{"westbengal","kolkata","madrid"},{"gujrat","rajasthan","faridabad"}};
    for(String[] row: states){
        for(String i:row){
            System.out.println(i);
        }
    }
    }
}
*/

/*
public class Arrays{
    public static void main(String[] args){
        int num[]={3,4,5,6};
        System.out.println(num[0]);
        num[1]=8;
        System.out.println(num[1]);
        //making array dynamic
        //int num[]=new int[4];  gives all values as 0
        int nums[]=new int[4];
        nums[3]=3;
        System.out.println(nums[3]);
        //print all the values
        for(int i=0;i<=3;i++){
            System.out.println(nums[i]);
        }
    }
}
    */


    //generating random values;
    /*public class Arrays{
        public static void main(String[] args){
            int nums[][]=new int[3][4];
            
            for(int i=0;i<=4;i++){
                for(int j=0;j<=3;j++){
                    nums[i][j]=(int)(Math.random()*100);
                    System.out.print(nums[i][j]);
                } System.out.println();
            }
        }
    }

    */

    //Jagged and 3D Array
    /*
    
    public class Arrays{
        public static void main(String[] args){
            int num[][]= new int[3][]; //a jagged array
            //individually specify columns
            
            num[0]=new int[4];
            num[1]=new int[12];
            num[2]=new int[6];
            
           for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j] +" ");}
                System.out.println();
            
    }}}

    */


    //
    