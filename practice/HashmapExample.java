import java.util.*;
class HashmapExample
{
    public static void main(String[] args) {
    
        Hashtable h= new Hashtable<>();
        h.put(10,"Java");
        h.put(12.2f,"Phython");
        h.put(null,10);
        h.put(10,"C programming");
        h.put("Abc",12.2f);
        h.put("BCD",null);
        System.out.println(h);
        

    }
}