import java.util.Random;
import java.util.Scanner;

public class app{
    public static void main(String[] args) 
    {
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("     Guess any number!!     ");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println();

        Random r=new Random();
        int randomNumber= r.nextInt(100) +1;
        Scanner sc = new Scanner(System.in);
        int c=0,k=5,i=0;
        for(i=0;i<k;i++)
        {
            System.out.println("Guess the number between 1 to 100");
            int guessno=sc.nextInt();
            c++;

            if(guessno==randomNumber){
                System.out.println("Hurray! YOU WON THE GAME.");
                System.out.println("It took you " + c + "trials to win.");
                break;
            }

            else if(guessno>randomNumber)
            {
                System.out.println("The number you have guess is greater than the actual number, so Please try again.\n");
            }

            else
            {
                System.out.println("The number you have guess is smaller than the actual number, so Please try again.\n");
            }
        }
        if(i==k)
        {
            System.out.println("\nOoops! YOU HAVE EXHAUSTED THE GIVEN NUMBER OF TRAILS.\n\n");
            System.out.println("The number was :" + randomNumber); 
        }
    } 
}