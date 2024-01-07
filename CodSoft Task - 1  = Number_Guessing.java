import java.util.Random;
import java.util.Scanner;
class Game {
   public int number;
   public int UserInput;
   public int noOfGuess = 0;
    public int getNoOfGuess(){

        return noOfGuess;
    }
    public void setNoOfGuess(int noOfGuess){

        this.noOfGuess = noOfGuess;
    }
    Game(){
        Random rd = new Random();
        number = rd.nextInt(100);
    }
    public void UserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess th Number : ");
        UserInput = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuess++;
        if(UserInput==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number,noOfGuess);
            return true;
        }
        else if(UserInput<number){
            System.out.println("Too low...");
        }
        else if(UserInput>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class Number_Guessing {
    public static void main(String[] args) {
        Game G = new Game();
        boolean b = false;
        while(!b) {
            G.UserInput();
            G.isCorrectNumber();
        }
    }
}

