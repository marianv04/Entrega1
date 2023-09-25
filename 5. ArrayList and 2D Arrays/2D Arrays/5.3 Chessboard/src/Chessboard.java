public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];
      char blanco = '\u25A1';
      char negro = '\u25A0';

      /* Create and print a chessboard. */
      for (int i = 0; i < 8; i = i + 1) {
         for (int j = 0; j < 8; j = j + 1) {
            if ((i + j) % 2 == 0)
               chessboard[i][j] = blanco;
            else
               chessboard[i][j] = negro;
         }
      }
      for (char[] fila: chessboard) {
         for (char cuadrado: fila) {
            System.out.print(cuadrado);
         }
         System.out.println();
      }
   }
}