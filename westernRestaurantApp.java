/**
 * Write a description of class RestaurantApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Java program to read data of various types using Scanner class.
import java.util.*;
public class westernRestaurantApp
{
    public static void main(String args[])//Main Method
    {
       //To input using I/O console
       Scanner in = new Scanner(System.in);// Create a Scanner object
       Scanner inLine = new Scanner(System.in);
       
       //To create WeternRestaurant object
       westernRestaurant x = new westernRestaurant();// Using access control to the calling object
        
       System.out.println("Welcome to the Western Restaurant");
       System.out.print("\nEnter you Name: ");
       String Name = inLine.nextLine(); // Read user input
       
       System.out.print("How many people? :");
       int people = in.nextInt();
       
       System.out.print("Which Floor?(1/2/3): ");
       int floor = in.nextInt();
       
       x.chooseFloor(floor); //Calling the method
       
       System.out.println("\nSeats that are available\n");
       
       System.out.print("Enter your seat: ");
       int seat = in.nextInt();
       
       
       int count = 0;
       double amount=0,charge=0, discount =0, balance=0;
       char decide='y';
       
        while(decide!='n')
       {
        System.out.println("\nPlease select your menu: ");
        System.out.println("1.Carbonara Beef \t\t[RM13.00] \n2.Parmigiana Chicken \t\t[RM24.00]\n3.Swedish Meatballs \t\t[RM17.00] \n4.Creamy Pasta Seafood  \t[RM16.00]");
        System.out.println("5.Spaghetti Currynara \t\t[RM22.00] \n6.Chicken Chop \t\t\t[Rm16.00] \n7.Tomyum Seafood Pasta\t\t[RM20.00] \n8.Chicken Mango \t\t[RM25.00] ");
       
        System.out.print("\nChoose you menu :");
        int choose = in.nextInt();
        
        charge = x.calcchoose(choose);
        System.out.println("Your charge is RM"+charge);// Output user input
        
        System.out.print("Do you want anything else? (y/n) :");
        decide = in.next().charAt(0);
        
        count+=charge;
        
       }
       
       System.out.println("\nYour payment is RM"+count);
       
    
       System.out.print("Enter your mode payment(credit/cash) :");
       String modepayment = in.next();
       if(people>=4)
       {
           System.out.println("You got discount 10%");
       }
       else
       {
           System.out.println("You got discount 5%");
       }
       
       x.setwesternRestaurant(Name,people,floor,seat,modepayment);
      
      
       x.display();
       
       System.out.println("Total after Discount :RM"+x.calcdiscount(people ,count));
    }
}
