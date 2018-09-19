import java.util.*;


public class airport
{
    public static void main(String[] args)
    {
        Queue<String> landq = new LinkedList<>();
        Queue<String> takeoffq = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        String flightSymbol;
        
        System.out.println("Type in your next command (quit to exit):");
        String command = input.nextLine();
        
        while (command.toLowerCase().contains("quit") != true)
        {
            if (command.toLowerCase().contains("takeoff"))
            {
                System.out.println("What's the flight symbol for the flight taking off?");
                flightSymbol = input.nextLine();
                takeoffq.add(flightSymbol);
                System.out.println("\nAdded "+flightSymbol+"!");
                System.out.println("Take Off Queue: "+takeoffq);
                
                System.out.println("\nType in your next command:\n");
                command = input.nextLine();
            }
            else if (command.toLowerCase().contains("land"))
            {
                System.out.println("What's the flight symbol for the flight landing?");
                flightSymbol = input.nextLine();
                landq.add(flightSymbol);
                System.out.println("\nAdded "+flightSymbol+"!");
                System.out.println("Landing Queue: "+landq);
                
                System.out.println("\nType in your next command:\n");
                command = input.nextLine();
            }
            else if (command.toLowerCase().contains("next"))
            {
                System.out.println("\nNOTE: Ladning planes have priority over takeoff planes.\n ");
                if (landq.peek() != null)
                {
                    System.out.println("Flight "+landq.remove() + " landed\n");
                    System.out.println("Landing Queue: "+landq);
                    System.out.println("Take Off Queue: "+takeoffq);
                    System.out.println("\nType next to continue executing the queue. Otherwise, type a different command\n");
                    command = input.nextLine();
                }
                else
                {
                    System.out.println("\nNo planes in landing queue! Moving to take off queue...");
                    System.out.println("Flight "+takeoffq.remove() + " has taken off\n");
                    System.out.println("Landing Queue: "+landq);
                    System.out.println("Take Off Queue: "+takeoffq);
                    System.out.println("\nType next to continue executing the queue. Otherwise, type a different command\n");
                    command = input.nextLine();
                }
            }
        }
    }
}
