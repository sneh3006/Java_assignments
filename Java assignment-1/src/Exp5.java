//written by 21Ce042
import java.util.Scanner;
public class Exp5{
    static void wordsWithout(String x[],String y){   //fuction to remove alphabets from string
        int count=0;
        for(int i=0;i<x.length;i++){//compares both strings
            if(x[i].equals(y)){
                count++;
            }
        }
        String[] d=new String[x.length-count];//creates new string //length is reduced by counts
        int j=0;
        for(int i=0;i<x.length;i++){
            if(x[i].equals(y))
            {}
            else{
                d[j]=x[i];
                j++;
            }
        }
        /*
        Here if element of x equls to y then loop add nothing to string d
        but for else it copies elements of x in it
         */
        System.out.println("New Array is :");
        for(String element:d){
            System.out.println(element);//gives output
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int a=sc.nextInt();//input of array size
        String[] b=new String[a];
        System.out.println("Enter array : ");
        for(int i=0;i<b.length;i++){//input for array
            b[i]=sc.next();
        }
        System.out.println("Enter string you want to remove");
        String c=sc.next();//input of second string to remove alphabet from first string
        wordsWithout(b,c);//passes both string to function and exicutes further in fuction
        sc.close();
    }


}