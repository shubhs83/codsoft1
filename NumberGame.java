
import java.util.Random;
import java.util.Scanner;



public class NumberGame{


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random=new Random();


        int minimumRange = 1;
        int maxRange =150;
        int maxAttempts=10;
        int score=0;

        boolean playAgain= true;

        while(playAgain){
            int targetNumber = random.nextInt(maxRange -minimumRange+ 1)+minimumRange;
            int attempts=0;
            boolean   guessed=false;

            System.out.println("Welcome to the Number Guessing Game");
            System.out.println("i will picked a number between" +minimumRange+"and"+maxRange+".");

            while(!guessed && attempts < maxAttempts){
                System.out.print("Enter your guess ");
                int userGuess= scanner.nextInt();

                if(userGuess < targetNumber){
                    System.out.println("Number is Too low! Try again.");
                    }else if(userGuess > targetNumber){
                    System.out.println("Number is Too high! Try again.");
                    }else{
                        guessed = true;
                        score++;
                        System.out.println("Congratulations! you guessed the number "+ targetNumber+" in "+(attempts+1)+" attempts.");
                    }
                attempts++;

            }if(!guessed){
                System.out.println("Sorry ,you has used all your attempts.The Number was"+targetNumber+".");
            }
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
            }
        System.out.println("Thank you for playing ! Your total score is"+score+".");
        System.out.println(" programmed by Shubham wankhede  ");

    }

}


/***************Output****************

Welcome to the Number Guessing Game
i will picked a number between1and150.
Enter your guess 34
Number is Too low! Try again.
Enter your guess 80
Number is Too high! Try again.
Enter your guess 50
Number is Too high! Try again.
Enter your guess 40
Number is Too low! Try again.
Enter your guess 45
Congratulations! you guessed the number 45 in 5 attempts.
Do you want to play again? (yes/no)
no
Thank you for playing ! Your total score is1.
 programmed by Shubham wankhede
Press any key to continue . . .

***************************************/
















