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
     this.cardHand = this.cardHand + " " + card;
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
      this.toDraw = "Yes";
      this.isDraw = true;
   }
   
   public int drawCard(int DeckTrack, String card, boolean isDraw) {
      if(isDraw == true ) {
         System.out.println("You drew " + card + " from the deck!");
         DeckTrack++;
         this.cardHand = this.cardHand + " " + card;
         this.PlayerValue += getPoints(card);
         
         if(card.equals("Ace")) {
            this.Aces++;
         }
      } else {
         System.out.println("You did not draw from the deck.");
      }
      
      while(this.PlayerValue > 21 && this.Aces > 0) {
      this.PlayerValue = AceHandler(this.Aces, this.PlayerValue);
      }
      System.out.println("============================================================");
      getHand();
      return DeckTrack;
   }

}