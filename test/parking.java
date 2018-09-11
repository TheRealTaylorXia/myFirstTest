import java.util.*;

/**
 * Parking Program
 */
public class parking
{
    public static void main(String[] args)
    {
        Stack<Integer> street = new Stack<>();
        Stack<Integer> park = new Stack<>();
        Scanner input = new Scanner(System.in);
        int check;
        
        System.out.println("Please Add/Remove a Vehicle (Enter 0 to exit)");
        int car = input.nextInt();
        while (car != 0)
        {
            //Situation if adding a vehicle
            if (car > 0)
            {
                //Check is element is already in list. Will return element position if it is and -1 if it isn't
                check = park.search(car);
                if (check != -1)
                {
                    System.out.println("Car is already in driveway!\n");
                }
                else
                {
                    park.push(car);
                    System.out.println("Driveway:\t"+Arrays.toString(park.toArray()));
                    System.out.println("Street:\t"+Arrays.toString(street.toArray()));
                    System.out.println("Vehicle Added Successfully!\n");
                }
                System.out.println("Please Add/Remove a Vehicle (Enter 0 to exit)\n");
                car = input.nextInt();
            }
            
            //Situation if removing a vehicle
            else if (car < 0)
            {
                //Checking if car even exists
                check = park.search(-1 * car);
                if (check == -1)
                {
                    System.out.println("Car is not in driveway!\n");
                } 
                else
                {   //Pops every car and adds it to the street until it reaches the car it's looking for
                    car = -1 * car;
                    while (park.peek() != car)
                    {
                        street.push(park.pop());
                    }
                    park.pop();
                    System.out.println("Driveway:\t"+Arrays.toString(park.toArray()));
                    System.out.println("Street:\t"+Arrays.toString(street.toArray()));
                    System.out.println("Vehicle Removed Successfully!\n");
                }
                for (int i = 0; i <= street.size(); i++)
                {
                    park.push(street.pop());
                }
                System.out.println("Please Add/Remove a Vehicle (Enter 0 to exit)\n");
                car = input.nextInt();
            }
        }                    
    }
}
