package com.game.mechanics;

public class Deck {
   protected String [] DeckList = new String[52];
   
   public String getDeck(int index) {
      return DeckList[index];
   }
   
   public void createDeck(String [] Ranks){
      
      int n = 4 * Ranks.length;
      for (int i = 0; i < Ranks.length; i++) {
          for (int j = 0; j < 4; j++) {
              this.DeckList[4 * i + j] = Ranks[i];
          }
      }
     
      for (int i = 0; i < n; i++) {
          int r = i + (int) (Math.random() * (n-i));
          String temp = this.DeckList[r];
          this.DeckList[r] = this.DeckList[i];
          this.DeckList[i] = temp;
      }
     
      for (int i = 0; i < n; i++) {
          System.out.print(this.DeckList[i] + " ");
      }      
      System.out.print("\n");
   }
   
   int ShuffleDeck(int DeckTrack, boolean Shuffle, String [] Ranks) {
      if(DeckTrack > 46) {
         createDeck(Ranks);
         System.out.println("Deck has been reshuffled!");
         return 0;
      } else {
      return DeckTrack;
      }
   }
}
