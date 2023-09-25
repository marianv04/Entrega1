public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 1;
      int number = 2;
      while (count < 100) {
         number++;
         for(int divisor = number - 1; divisor > 1; divisor--) {
            if (number % divisor == 0) {
               break;
            } else if (divisor == 2) {
               count++;
            }
         }
      }
      System.out.println(number);
   }
}