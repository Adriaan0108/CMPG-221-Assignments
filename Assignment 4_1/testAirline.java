import java.util.Scanner;

public class testAirline
{
    public static void main(String[] args)
    {
        MyLinkedList<Flight> list = new MyLinkedList<Flight>();
        
        Scanner in = new Scanner(System.in);
        int option = 1;
        displayMenu();
        
        while (option != 6)
        {
            option = in.nextInt();
            
            if (option == 1)
            {
                System.out.println("Enter Flight Number:");
                int flightNum = in.nextInt();
                //Consume the leftover new line to prevent Scanner
                //  from skipping nextLine()
                in.nextLine();
                System.out.println("Enter Passenger ID:");
                String id = in.nextLine();
                System.out.println("Enter Passenger Name:");
                String name = in.nextLine();
                System.out.println("Enter Passenger Cell Nr:");
                String cell = in.nextLine();
                
                //Passenger passenger = new Passenger(id, name, cell);
                Flight flight = new Flight(flightNum);
                
                if (flight.reserveTicket(id, name, cell))
                {
                    //only add flight to list if flight was not added before
                    if (!list.contains(flight))
                    {
                        list.append(flight);
                    }
                    
                    System.out.println("Ticket Reserved!");
                }
                else
                {
                    System.out.println("Passenger already reserved a ticket on this flight!");
                }
                
                displayMenu();
            }
            if (option == 2)
            {
                System.out.println("Enter Flight Number:");
                int flightNum = in.nextInt();
                //Consume the leftover new line to prevent Scanner
                //  from skipping nextLine()
                in.nextLine();
                System.out.println("Enter Passenger ID:");
                String id = in.nextLine();
                System.out.println("Enter Passenger Name:");
                String name = in.nextLine();
                System.out.println("Enter Passenger Cell Nr:");
                String cell = in.nextLine();
                
                //Passenger passenger = new Passenger(id, name, cell);
                Flight flight = new Flight(flightNum);
                
                if (list.contains(flight))
                {
                    if (flight.cancelTicket(id, name, cell))
                    {
                        System.out.println("Ticket Cancelled!");
                    }
                    else
                    {
                        System.out.println("Ticket does not exist!");
                    }
                }
                else
                {
                    System.out.println("Flight does not exist!");
                }
                
                displayMenu();
            }
            if (option == 3)
            {
                System.out.println("Enter Flight Number:");
                int flightNum = in.nextInt();
                //Consume the leftover new line to prevent Scanner
                //  from skipping nextLine()
                in.nextLine();
                System.out.println("Enter Passenger ID:");
                String id = in.nextLine();
                System.out.println("Enter Passenger Name:");
                String name = in.nextLine();
                System.out.println("Enter Passenger Cell Nr:");
                String cell = in.nextLine();
                
                //Passenger passenger = new Passenger(id, name, cell);
                Flight flight = new Flight(flightNum);
                
                if (flight.checkTicket(id, name, cell))
                {
                    System.out.println("Ticket is Reserved!");
                }
                else
                {
                    System.out.println("Passenger has not reserved a ticket!");
                }
                
                displayMenu();
            }
            if (option == 4)
            {
                System.out.println("Enter Flight Number: ");
                int flightNum = in.nextInt();
                Flight flight = new Flight(flightNum);
                
                if (list.contains(flight))
                {
                    System.out.println(flight.displayPassengers());
                }
                else
                {
                    System.out.println("Flight does not exist!");
                }
                
                displayMenu();
            }
            if (option == 5)
            {
                System.out.println("Enter Flight Number: ");
                int flightNum = in.nextInt();
                Flight flight = new Flight(flightNum);
                
                if (list.contains(flight))
                {
                    MyLinkedList listWithoutDoubles = list.checkDouble();
                }
                else
                {
                    System.out.println("Flight does not exist!");
                }
                
                displayMenu();
            }
            while (!(option < 7 && option > 0))
            {
                System.out.println("Please select an option from 1 to 6.");
                displayMenu();
                option = in.nextInt();
            }
        }
        System.out.println("Exiting...");
        System.exit(0);
    }
    
    public static void displayMenu()
    {
        System.out.println("Select option from menu:");
        System.out.println("=========================");
        System.out.println("1. Reserve a ticket");
        System.out.println("2. Cancel a reservation");
        System.out.println("3. Check whether a ticket is reserved for a particular person");
        System.out.println("4. Display the passengers");
        System.out.println("5. Check double-bookings");
        System.out.println("6. EXIT");
    }
}
