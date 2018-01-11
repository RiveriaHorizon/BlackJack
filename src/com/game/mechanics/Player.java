package com.game.mechanics;

public class Player implements DrawHand{
   int Money, ID, sum;
   String name;
   
   Player(int a, int b, String c){
      Money = a;
      ID = b;
      name = c;
   }
   
   public void setHand() {
     
   }
   
   public int getHand() {
      return this.sum;
   }

}