//written by 21CE042

public class Exp6{
    //Here pyramid is given for 7 entries and so loop will run 8 times
    private static final String string = " ";
    public static void main(String[] args){
        int number = 0;
        for (int row = 0; row <= 7; row++) {
            for (int column = 1; column <= 7 - row; column++) {
                System.out.printf("%4s", string);
            }
            for (int column = 0; column <= row; column++) {
                number = (int) Math.pow(2, column);//gives square for given position's number 
                System.out.printf("%4d", number);
            }
            for (int column = row - 1; column >= 0; column--) {
                number = (int) Math.pow(2, column);
                System.out.printf("%4d", number);
            }
            System.out.println();// printing rows and columns accordingly
        }
    }
}