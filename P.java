
import java.util.Random;
import java.util.Scanner;

class Gussing{
    public int number;
    public int inputTheNumber;
    Scanner sc = new Scanner(System.in);

    Gussing(){
        Random rand = new Random();
        this.number = rand.nextInt(100);   // Range = 100;
    }
    void Userinput(){
        System.out.println("Guess the number");      // write your input
        inputTheNumber = sc.nextInt();
    }
    boolean CorrectNumber(){                          // check  your number is too high or too low

        if (inputTheNumber==number){
            System.out.format("Yes you guessed it right ", number );
            return true;
        }
        else if(inputTheNumber<number){
            System.out.println("Too low...");
        }
        else if(inputTheNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class P {
    public static void main(String[] args) {


        Gussing g = new Gussing();
        boolean b= false;
        while(!b){
            g.Userinput();
            b = g.CorrectNumber();
        }

    }
}

