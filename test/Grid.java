import java.util.*;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   Stack<Integer> neighbors = new Stack();

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column, int startval)
   { //Start will always be 1. It's just here so I can do recursion easier
      //if (pixels[row][column+1] != 0 || pixels[row+1][column] != 0 || pixels[row-1][column] != 0 || pixels[row][column-1] != 0)
      //  System.out.println("All pixels filled!");
      
      pixels[row][column] = startval;
      neighbors.push(row);
      neighbors.push(column);
      startval++;
      
      if (startval == 100)
          System.out.println("All Pixels are Filled!\n");
      else
      {
          //Checks each of the pixels neighbors if they equal zero and if it's not at the edge of the array
          if (row-1 >= 0)
          {
              if (pixels[row-1][column] == 0)
              {
                  pixels[row-1][column] = startval;
                  neighbors.push(column);
                  neighbors.push(row-1);
                  startval++;
              }
          }
          if (column+1 <= 9)
          {
              if (pixels[row][column+1] == 0)
              {
                  pixels[row][column+1] = startval;
                  neighbors.push(column+1);
                  neighbors.push(row);
                  startval++;
              }
          }
          if (row+1 <= 9)
          {
              if (pixels[row+1][column] == 0)
              {
                  pixels[row+1][column] = startval;
                  neighbors.push(column);
                  neighbors.push(row+1);
                  startval++;
              }
          }
          if (column-1 >= 0)
          {
              if (pixels[row][column-1] == 0)
              {
                  pixels[row][column-1] = startval;
                  neighbors.push(column-1);
                  neighbors.push(row);
                  startval++;
              }
          }
          
          floodfill(neighbors.pop(),neighbors.pop(),startval);
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
