class tryException2 {

    public static void main(String[] args){
      int a;
      int[] arr = new int[10];
      String str = null;
  
  
      try {
        a = 10 / 0;
        arr[15] = 16;
      } catch (ArithmeticException e) {
        System.out.println("This is Arithmetic Exeption");
      }
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Out Of Bound exception");
      }
      finally
      {
        System.out.println("This is Final Statement");
      }
    }
}
