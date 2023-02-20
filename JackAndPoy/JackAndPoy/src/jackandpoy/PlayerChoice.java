/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jackandpoy;


public class PlayerChoice extends JackAndPoy {
    
    private int choice;
       public PlayerChoice(){
        super();
        this.choice = choice;
    }
       
     public choices getchoice(int choice){
        
        switch(choice){
                case 1:
                return choices.ROCK;
                case 2:
                return choices.PAPER;
        }        
        return choices.SCISSORS;
}      
}
