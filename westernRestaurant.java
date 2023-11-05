
  
/**
 * Write a description of class Restaurant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class westernRestaurant
{
    //Data Member
    private String Name;
    private double people;
    private int floor;
    private int seat;
    private String modepayment;
    public westernRestaurant()// Default Constructor
    {
        Name = null;
        people = 0;
        floor = 0;
        seat = 0;
        modepayment = null;
    }
    
    public westernRestaurant(String a, double b,int c, int d, String e)// Normal Constructor
    {
        Name = a;
        people = b;
        floor = c;
        seat = d;
        modepayment = e;
    }
    
    public void setwesternRestaurant(String a, double b,int c,int d, String e)//Mutator : To set the object's value
    {
        Name = a;
        people = b;
        floor = c;
        seat = d;
        modepayment = e;
    }
    
    public String getName()//Accessor : Return the name's user input
    {
        return Name;
    }
    
    public double getpeople()//Accessor : Return how many people user input
    {
        return people;
    }
    
    public int getfloor()//Accessor : Return which Floor user choose
    {
        return floor;
    }
    
    public int getseat()//Accessor : Return Which Seat user choose
    {
        return seat;
    }
     
    public String getmodepayment()//Accessor : Return what ModePayment user use
    {
        return modepayment;
    }
    
    public int chooseFloor(int floor)//Processor
    {
        if(floor == 1)
        {
            int row=0;
            while(row<=4)
            {
                int col =1;
                while(col<=4)
                {
                    System.out.print("\t|" +row+col+"|");
                    col++;
                }
                System.out.print("\n\n");
                row++;
            }
        }else if(floor == 2)
        {
            int row=4;
            while(row<=9)
            {
                int col =5;
                while(col<=9)
                {
                    System.out.print("\t|" +row+col+"|");
                    col++;
                }
                System.out.print("\n\n");
                row++;
            }
        }else if(floor == 3)
        {   
            int row=10;
            while(row<=15)
            {
                int col =0;
                while(col<=5)
                {
                    System.out.print("\t|" +row+col+"|");
                    col++;
               
                }
                System.out.print("\n\n");
                row++;
            }
        }
        else
        {
            System.out.println("There have no floor here.");
        }
        
        return floor;
    }
    
    public double calcchoose(double choose)//Processor
    {
        double amount=0;
        if(choose == 1){
            System.out.println("Carbonara Beef");
            amount = 13.00;}
        else if(choose == 2){
            System.out.println("Parmigiana Chicken");
            amount = 24.00;}
        else if(choose == 3){
            System.out.println("Swedish Meatballs");
            amount = 17.00;}
        else if(choose == 4){
            System.out.println("Creamy Pasta Seafood");
            amount = 19.00;}
        else if(choose == 5){
            System.out.println("Spaghetti Currynara");
            amount = 22.00;}
        else if(choose == 6){
            System.out.println("Chicken Chop");
            amount = 16.00;}
        else if(choose == 7){
            System.out.println("Tomyum Seafood Pasta");
            amount = 20.00;}
        else if(choose == 8){
            System.out.println("Chicken Mango");
            amount =25.00;}
        else{
            System.out.println("Not in the list");}
        return amount;
    }
   
    public double calcdiscount(double people,double count)//Processor
    {
        double discount =0;
        if(people>=4)
        {
            discount = count -(count * 0.10);
        }
        else
        {
            discount = count-(count * 0.05);
        }
        return discount;
    }
    
    public void display()// To display object's value
    {
        System.out.println("\nYour Reservation");
        System.out.println("\nName :" +Name);
        System.out.println("People :" +people);
        System.out.println("NO. Floor :" +floor);
        System.out.println("NO. Seat :" +seat);
        System.out.println("Mode Payment :" +modepayment);
        
    }
}
