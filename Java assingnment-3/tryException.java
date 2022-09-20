class tryException {

  public static void main(String[] args){
    int a;
    int[] arr = new int[10];
    String str = null;


    try {
      a = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("This is Arithmetic Exeption");
    }
    try {
      arr[15] = 16;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Out Of Bound exception");
    }
    try {
      if(str.equals("str"))
      {
        System.out.println("Done");
      }
      else
      {
        System.out.println("Not Done");
      }
    } catch (NullPointerException e) {
      System.out.println("Null pointer Exeption");
    }
  }
}
