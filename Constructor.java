//constructor example.....

import java.io.*;

class Anju {
    int num;
    String name;
 
    
    Anju() { System.out.println("Constructor called"); }
}
 
class GFG {
    public static void main(String[] args)
    {
        
        Anju anju1 = new Anju();
 
        
        System.out.println(anju1.name);
        System.out.println(anju1.num);
    }
}