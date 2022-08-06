//This program is created by 21CE042 Sneh Jani
import java.util.*;

public class Exp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int a=sc.nextInt();           //taking size of array from the user
        int[] Arr1 =new int[a];
        System.out.println("Enter array :");
        for(int i=0;i<a;i++){
            Arr1[i]=sc.nextInt();
        }
        boolean c=checkarr(Arr1);   //Fuction to check the sequance 
        System.out.println(c);
        System.out.println("This program is created by 21CE042");
        sc.close();
    }
    static boolean checkarr(int Arr1[]){
        int count1=0;
        for(int i=0;i<Arr1.length;i++){
            if(Arr1[i]==1 && Arr1[i+1]==2 && Arr1[i+2]==3){//checks if sequance is true
                count1++;
            }
            if(i==Arr1.length-2){ //the loop will break when 3rd last element is checked
                break;
            }
        }
        if(count1>=1)  //checks if count is greater than or equal to one
            return true;
        else
            return false;
            
    }
}
