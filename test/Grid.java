import java.util.*;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   Stack neighbors = new Stack();
   int start = 1;

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      if (pixels[row][column+1] != 0 || pixels[row+1][column] != 0 || pixels[row-1][column] != 0 || pixels[row][column-1] != 0)
        System.out.println("All pixels filled!");
      else
      {
          //Checks each of the pixels neighbors if they equal zero and if it's not at the edge of the array
          pixels[row][column] = start;
          neighbors.push(start);
          start++;
          if (pixels[row+1][column] == 0 && row != 0)
          {
              pixels[row+1][column] = start;
              neighbors.push(start);
              start++;
          }
          if (pixels[row][column+1] == 0 && column != 10)
          {
              pixels[row][column+1] = start;
              neighbors.push(start);
              start++;
          }
          if (pixels[row-1][column] == 0 && row != 10)
          {
              pixels[row][column+1] = start;
              neighbors.push(start);
              start++;
          }
          if (pixels[row][column-1] == 0 && column != 0)
          {
              pixels[row][column+1] = start;
              neighbors.push(start);
              start++;
          }
          start = neightbors.pop();
      }
   }

   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
