package com.game.mechanics;

public class Cards extends Deck{
   
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
  
}
