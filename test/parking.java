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
                    System.out.println("Car is already in driveway!");
                    System.out.println("Please Add/Remove a Vehicle (Enter 0 to exit)");
                    car = input.nextInt();
                }
                else
                {
                    park.push(car);
                    System.out.println("Driveway:\t"+Arrays.toString(park.toArray()));
                    System.out.println("Street:\t"+Arrays.toString(street.toArray()));
                    System.out.println("Vehicle Added Successfully!");
                    System.out.println("Please Add/Remove a Vehicle (Enter 0 to exit)");
                    car = input.nextInt();
                }
            }
            
            //Situation if removing a vehicle
            if (car < 0)
            {
                //Checking if car even exists
                check = park.search(car);
                if (check == -1)
                {
                    System.out.println("Car is not in driveway!");
                    System.out.println("Please Add/Remove a Vehicle (Enter 0 to exit)");
                    car = input.nextInt();
                }
                else
                {   //Pops every car and adds it to the street until it reaches the car it's looking for
                    while (park.peek() != car)
                    {
                        street.push(park.pop());
                    }
                    park.pop();
                    System.out.println("Driveway:\t"+Arrays.toString(park.toArray()));
                    System.out.println("Street:\t"+Arrays.toString(street.toArray()));
                    System.out.println("Vehicle Removed Successfully!");
                    System.out.println("Please Add/Remove a Vehicle (Enter 0 to exit)");
                    car = input.nextInt();
                }
            }
        }                    
    }
}
