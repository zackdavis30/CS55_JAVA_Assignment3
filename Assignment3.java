
/**
 *
 * @author zackdavis
 * In the following code we are playing rock, paper, scissors
 * We first prompt the user and ask them to enter one of the following: rock paper or scissors
 * The second part is the computer generating its own rock, paper, or scissors choice randomly
 * We use an if .. else if statement to determine a winner
 * With a while loop we generate the game over and over. 
 */

import java.util.Scanner;
import java.util.Random;

public class Assignment3 {
    
    
public static String userChoice(Scanner userInput){
    String userChoice;
    System.out.println("Choose: rock, paper, or scissors");
    userChoice = userInput.next();
    
    return userChoice;
}
    
public static String computerChoice(Random random){
    int numberR;
    numberR = random.nextInt(3) + 1;
    String computerChoice = "";
    
    switch (numberR) {
        case 1:
            computerChoice = "rock";
            break;
        case 2:
            computerChoice = "paper";
            break;
        case 3:
            computerChoice = "scissors";
            break;
        default:
            break;
    }
    return computerChoice;
}

public static String determineWinner(String userChoice2, String computerChoice2){
    
    String winner = "Tie Game";
    String computerWins = "Computer Wins";
    String userWins = "User Wins";
    
    if(userChoice2.equalsIgnoreCase("rock") && computerChoice2.equals("scissors")){
        winner = userWins;
    }else if(computerChoice2.equals("rock") && userChoice2.equalsIgnoreCase("scissors")){
        winner = computerWins;
    }
        
    if(userChoice2.equalsIgnoreCase("paper") && computerChoice2.equals("scissors")){
        winner = computerWins;
    }else if(computerChoice2.equals("paper") && userChoice2.equalsIgnoreCase("scissors")){
        winner = userWins;
    }
    
    if(userChoice2.equalsIgnoreCase("paper") && computerChoice2.equals("rock")){
        winner = computerWins;
    }else if(computerChoice2.equals("paper") && userChoice2.equalsIgnoreCase("rock")){
        winner = userWins;
    }
        
    return winner;
}

 
  public static void main(String[] args){
      
      Scanner userInput = new Scanner(System.in);
      Random random = new Random();
      
      String userChoice2 = userChoice (userInput);
      String computerChoice2 = computerChoice (random);
      String result = determineWinner (userChoice2, computerChoice2);
    
      // displaying the winner
      System.out.println(result);
      
      // generating the game over and over 
      while(result.equals(result)){
        userChoice2 = userChoice (userInput);
        computerChoice2 = computerChoice (random);
        result = determineWinner (userChoice2, computerChoice2); 
        System.out.println(result);
      } 
      
        
  }
    
}
