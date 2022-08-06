//This program is written by 21CE042 SNEH JANI
import java.util.Scanner;
public class Exp1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 String :");
        String str1=s.next();                       //input string
        char c=str1.charAt(0);
        char d=str1.charAt(1);
        
        if(c=='o') System.out.print("o");  //checks if first char is "o"
        if(d=='z') System.out.println("z"); // checks if second char is "z"


        System.out.println("This program is created by 21CE042");
        s.close();

    }
}