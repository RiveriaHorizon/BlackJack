package com.game.mechanics;

public class Cards extends Deck{
   protected int Aces = 0;
   
   int getPoints(String card) {
      switch(card) {
      case "Ace":return 11;
      case "King":return 10;
      case "Queen":return 10;
      case "Jack":return 10;
      case "10":return 10;
      case "9":return 9;
      case "8":return 8;
      case "7":return 7;
      case "6":return 6;
      case "5":return 5;
      case "4":return 4;
      case "3":return 3;
      default: return 2;
      }
   }
  
   int NumberAces(String cards) {
      int count = 0, idx = 0;
      
      while((idx = cards.indexOf("Ace", idx)) != -1){
         idx++;
         count++;
      }
      return count;
   }
   
   int AceHandler(int Aces, int HandValue) {
      System.out.println("Number of Aces: " + Aces);
      if(HandValue > 21 && Aces != 0) {
         HandValue -= 10;
         this.Aces--;
      }
      System.out.println("Number of Aces (After Process): " + this.Aces);
      return HandValue;
   }
   
}
