package test;

class NestedTry {
   public static void main(String args[]) {
      try
      {
         int a[]=new int[10];
         
         System.out.println(a[12]);

         try {
            System.out.println("Division");
            int res = 100/ 0;
         }
         catch (ArithmeticException ex2) {
            System.out.println("Division by zero is not possible!");
         }
      }
      catch (ArrayIndexOutOfBoundsException ex1) {
         System.out.println("ArrayIndexOutOfBoundsException");
      }
   }
}