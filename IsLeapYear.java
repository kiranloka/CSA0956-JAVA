import java.time.LocalDate;
import java.util.Scanner;
public class IsLeapYear {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the year: ");
      int year = sc.nextInt();
      if(year==19.47){
          System.out.println("Invalid input enter int values");
      }
    
      System.out.println("Enter the month: ");
      int month=sc.nextInt();
      if(month==00){
        System.out.println("month cannot be zero please enter valid input");
      }
      System.out.println("Enter the day: ");
      int day=sc.nextInt();
      if(day==00){
        System.out.println("Day values cannot be zero please enter valid input");
      }
    
      LocalDate givenDate = LocalDate.of(year,month,day);
    
      boolean bool = givenDate.isLeapYear();
      
      

      if(bool){
         System.out.println("Given year is a leap year ");
      }else{
         System.out.println("Given year is not a leap year ");
      }
   }
}