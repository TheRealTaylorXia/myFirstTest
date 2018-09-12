import java.io.*;
import java.util.*;

public class uniquewords
{
    public static void main(String[] args)
    {
        Set<String> words = new TreeSet<>();
        
        try
        {
            File file = new File("whatdidyousay.txt");
            Scanner read = new Scanner(file);
            while (read.hasNext())
            {
                //Did this instead of using read.next() so it woudln't iterate to the next word everytime
                String nextword = read.next();
                if (words.contains(nextword) == false)
                {//Checks if the word looked at is already in the treeset
                    words.add(nextword);
                }
            }
        }
        
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        
        for (String entry: words)
        {
            System.out.print(entry+" , ");
        }
        System.out.println("\n\nUnique words: "+words.size());
    }
}
