//29.12.2021
import java.util.*;
class Guess
{
    Random rn = new Random();//Creating object for Random class
    Scanner in = new Scanner(System.in);//Creating object for Scanner class
    public void guess()
    {
        System.out.println("Enter your name");
        String name =in.nextLine();
        System.out.println("#####################");
        System.out.println("Jarvis  vs "+name);
        System.out.println("#####################");
        System.out.println("Welcome to Guess number game\nEnter a number between 1 to 1000 you will be having 10 turns\nBest of luck");
        int computer = rn.nextInt(1000);
        int i = 0,turns=0;
        Boolean BOOYAH=false;
        while(BOOYAH==false)
        {
            int guess = in.nextInt();
            turns++;
            if(guess==computer)
            {
                BOOYAH=true;
                System.out.println("BOOYAH");
                System.out.print("You used "+turns+" to guess the right number");
                System.out.println("Your score is "+((10-turns)*11)+ " out of 100");
            }
            else if (i>8)
            {
                System.out.println("Defeated! The right guess was "+computer);
                int row=5;
                for(int a =0;a<=row;a++)
                {
                    for(int b =0;b<=row;b++)
                    {
                        if((a+b)%2==0)
                        {
                            System.out.print(" 0");
                        }
                        else
                        {
                            System.out.print(" 1");
                        }
                    }
                    System.out.println();
                }
                break;
            }
            else if(guess<computer)
            {
                i++;
                System.out.println("Your Guess is less than right guess\nturns left "+(10-i));
            }
            else
            {
                i++;
                System.out.println("Your Guess is greater than right guess\nturns left "+(10-i));
            }
        }
    }
}
public class Guess_the_number 
{
    public static void main(String[] args) 
    {
        Guess number = new Guess();
        number.guess();
    }    
}
