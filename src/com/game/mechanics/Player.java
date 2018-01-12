package com.game.mechanics;

public class Player extends Cards {
   protected int Money, ID, sum, PlayerValue = 0; 
   protected String name, cardHand = "Player's Hand:";
   
   Player(int a, int b, String c){
      this.Money = a;
      this.ID = b;
      this.name = c;
   }
   
   public int setHand(String card, int index) {
     this.cardHand = cardHand + " " + card;
     this.PlayerValue += getPoints(card);
     index++;
     return index;
   }
   
   public void getHand() {
      System.out.println(cardHand + "   Card Points: " + PlayerValue);
   }
   
   public void clearHand() {
      this.cardHand = "Player's Hand:";
      this.PlayerValue = 0;
   }

}