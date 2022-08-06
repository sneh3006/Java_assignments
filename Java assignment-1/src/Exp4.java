    //written by 21CE042
    import java.util.Scanner;
    import static java.lang.Math.min;
        public class Exp4{
            static int checkstring(String x,String y){
                int count=0;
                int m=min(x.length(),y.length());//gives minimum length of string
                for(int i=0;i<m-1;i++){
                    String z=x.substring(i,i+2);//creates sub string of x
                    String t=y.substring(i,i+2);//creates sub string for y
                    if(z.equals(t)){//compares both sub strings in loop
                        count++;
                    }
                }
                return count;//returns count
            }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String S1=sc.next();//Input of first string1
        System.out.println("Enter second string : ");
        String S2=sc.next();//Input of string2
        int n=checkstring(S1,S2);//passes string to function and returns the value of n
        System.out.println(n);
            System.out.println("");
            System.out.println("This program is written by 21CE042 Sneh Jani");
            sc.close();
        }

    }
