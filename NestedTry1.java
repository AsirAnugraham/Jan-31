package test;

class NestedTry1 {
   public static void main(String args[]) {
      try {
         int a[] = {30, 45, 60, 75, 90, 105, 120, 140, 160, 200};
         
         System.out.println("Element at index 8 = "+a[12]);
         
         try {
            System.out.println("Division");
            int res = 100/ 0;
         }
         catch (ArithmeticException ex2) {
            System.out.println("Division by zero is not possible ");
         }
      }
      catch (ArrayIndexOutOfBoundsException ex1) {
         System.out.println("ArrayIndexOutOfBoundsException");
      }
   }
}