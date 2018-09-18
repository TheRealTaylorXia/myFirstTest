import java.util.*;


public class airport
{
    public static void main(String[] args)
    {
        Queue<String> landq = new LinkedList<>();
        Queue<String> takeoffq = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        String flightSymbol;
        
        System.out.println("Type in your next command:");
        String command = input.nextLine();
        
        while (command != "quit")
        {
            if (command.toLowerCase().contains("takeoff"))
            {
                System.out.println("What's the flight symbol for the flight taking off?");
                flightSymbol = input.nextLine();
                takeoffq.add(flightSymbol);
                System.out.println("\nAdded "+flightSymbol+"!");
                System.out.println(takeoffq);
                
                System.out.println("Type in your next command:");
                command = input.nextLine();
            }
            else if (command.toLowerCase().contains("land"))
            {
                System.out.println("What's the flight symbol for the flight landing?");
                flightSymbol = input.nextLine();
                landq.add(flightSymbol);
                System.out.println("\nAdded "+flightSymbol+"!");
                System.out.println(landq);
                
                System.out.println("Type in your next command:");
                command = input.nextLine();
            }
            else if (command.toLowerCase() == "next")
            {
                System.out.println("Completing landing actions first...");
                if (landq.size()
            }
        }
        
        System.out.print("Press Enter to Exit...");
        input.next();
    }
}
