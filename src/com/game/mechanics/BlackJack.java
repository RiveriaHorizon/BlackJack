package com.game.mechanics;

import com.game.mechanics.*;
import java.util.Scanner;

public class BlackJack {
   public static void main(String[] args) {
     int Round = 1;
     int Bet;
     int PlayerValue, DealerValue;
    
int [] cardValue = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
String [] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
     
     Deck gameDeck = new Deck(Ranks);
     gameDeck.createDeck(Ranks);
     
     for(int i=0; i<Ranks.length*4; i++) {
        System.out.println(gameDeck.DeckList[i]);
     }
     
     System.out.println("---WELCOME TO BLACKJACK THE GAME---");
     
     Scanner sc = new Scanner(System.in);
     Player P1 = new Player(1000, 498102, "Dylan");
        do {
           System.out.println("Round " + Round++ + ": " + "You have $"+P1.Money);
           System.out.println("How much would you like to bet?");
           System.out.print(">");
           Bet = sc.nextInt();
           
           P1.setHand();
           PlayerValue = P1.getHand();
           System.out.println(PlayerValue);
           
        } while(P1.Money > 0);
        sc.close();
     
   }
}