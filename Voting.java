import java.util.Scanner;

public class Voting {
    public static void main(String[]args)
    {
        int age,shrt;
    Scanner scan= new Scanner(System.in);
    System.out.println("Please enter your age: ");
    age=scan.nextInt();
    if(age>=18)
    {
        System.out.println("Welcome to the voting system you can vote");

    }
    else
    {
        shrt=(18-age);
        System.out.println("Sorry,You can vote after:" +shrt+ "years");

    }
    }    
}
