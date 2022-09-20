import java.util.*;
interface Iprinter 
{
    int  fibonachhi();
}

interface Iscanner
{
    void prime(int a);
}

class testInterface  implements Iprinter,Iscanner 
{
    public int fibonachhi()
    {
        return 1;
    }
      

    
    public void prime(int a)
    {
       System.out.println("Prime");
    }
    public static void main(String[] args) {
        testInterface a[]=new testInterface[5];
        Vector<testInterface> t=new Vector<testInterface>();
        for(int i=0;i<5;i++)
        {
            t.add(a[i]);
        }
        System.out.println(a);

    }

}