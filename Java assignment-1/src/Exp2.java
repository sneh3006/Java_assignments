//This program is created by 21CE042 Sneh Jani
import java.util.*;
public class Exp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();  //Taking input from user
        int num2=sc.nextInt();
        num1=num1%10;    //Getting last digit of number
        num2=num2%10;
        if(num1==num2)    //comparing lsat digits of both numbers
        {
            System.out.println("True");
        }
        else System.out.println("False");

        System.out.println("This program is created by 21ce042 Sneh Jani");
        sc.close();
    }
}
