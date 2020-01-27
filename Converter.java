
//The program will convert the distance to kilometers, inches, or feet, depending on the user’s selection.
import java.util.*;
class prg
{
   public static void main(String args[])
   {
       prg object = new prg();
       object.menu();  
   }
   void menu()
   {
       Scanner input = new Scanner(System.in);
       prg object = new prg();
       System.out.print("Enter distance in meters : ");
       int distance = input.nextInt();
       int user_Choice;
      
       while(true)
       {
           System.out.println("1. Convert to kilometers");
           System.out.println("2. Convert to inches");
           System.out.println("3. Convert to feet");
           System.out.println("4. Quit the program");
           System.out.print("Enter your choice : ");
           user_Choice = input.nextInt();
          
           if(user_Choice > 4 || user_Choice < 1 )
           {
               System.out.println("Invalid Choice ");
               continue;
           }
          
           if(user_Choice == 1)
           {
               double km = object.getKilometer(distance);
               km = (double) Math.round(km * 100) / 100;
               System.out.println(distance + " meters is " +km+ " kilometers\n");
           }
           else if(user_Choice == 2)
           {
               object.showInch(distance);
           }
           else if(user_Choice == 3)
           {
               object.showFeet(distance);
          
           }
           else
           {
               System.out.println();
               System.out.println("Exiting Program...");
               break;
           }
       }
   }
  
   double getKilometer(int distance)
   {
       return distance * 0.001;
   }

   void showFeet(int distance)
   {
       double feet = distance * 3.281;
       feet = (double) Math.round(feet * 100) / 100;
       System.out.println(distance+ " meters is " +feet+ " feet\n");
   }
  
   void showInch(int distance)
   {
       double inch = distance * 39.37;
       inch = (double) Math.round(inch * 100) / 100;
       System.out.println(distance+ " meters is " +inch+ " Inch\n");
   }
  
}