
package jackandpoy;

import java.util.Random;


public class ComputerChoice extends JackAndPoy {
    private Random choice;
    
    
    public ComputerChoice(){
        super();
        choice = new Random();
    }
    
    public choices getchoice(){
        
        int computer = 1 + choice.nextInt(3);
        
        switch(computer){
                case 1:
                return choices.ROCK;
                case 2:
                return choices.PAPER;
        }        
        return choices.SCISSORS;
}
}
