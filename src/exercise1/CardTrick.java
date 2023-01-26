package exercise1;

import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Jialin Wu
 * @author Jialin Wu Jan 25, 2023 
 */
public class CardTrick 
{
    
    public static void main(String[] args) 
    {
        
        Card[]  hand = new Card[7];
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number and a suit name : ");
        int value = keyboard.nextInt();
        String suit = keyboard.next();
        
        for (int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();  //new card object
            card.setValue((int)(1 + Math.random()*13));
             //card 1 wil be created....
            //card.setValue(insert call to random number generator here)
            // 
            card.setSuit(Card.SUITS[(int)(0 + Math.random()*3)]);
            hand[i]= card; 
            System.out.println(hand[i].getSuit() + hand[i].getValue());
           
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
       
        
        int flag = 0;
        for(Card playerCard:hand)
        {
            if(playerCard.getValue()==value && playerCard.getSuit().equals(suit))
            {
                flag = 1;
                System.out.println("found");
            }
        }
            if(flag==0)
            {
                System.out.println("Not found");

            }
    }
    private static void printInfo() 
    {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
    }
}