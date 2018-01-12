package com.game.mechanics;

import java.util.Scanner;

public class playBlackJack {
   protected MatchResult Match;
   int Bet, Round = 1;
   
   Player P1 = new Player(1000, 498102, "Dylan");
   Dealer D = new Dealer();
   Scanner sc = new Scanner(System.in);
   
   void RoundStart() {
      System.out.println("Round " + Round++ + ": " + "You have $" + P1.Money);
      System.out.println("How much would you like to bet?");
      System.out.print(">");
      this.Bet = sc.nextInt();
   }
   
   void BetHandler(int Bet, int Money) {
      if(Bet > Money) {
         System.out.println("Oops, you seem to be a little short!");
         System.out.println("Please try again.");
         System.out.print(">");
         Bet = sc.nextInt();
      }
   }
   
   void MoneyHandler(int Bet, int Money, MatchResult Match) {
      if(Match==MatchResult.WIN) {
         P1.Money += Bet;
         System.out.println("You won $" + Bet + "!");
      }
      else if(Match==MatchResult.DRAW) {
         System.out.println("Round ended in a Draw!");
      } else {
         P1.Money -= Bet;
         System.out.println("You lose $" + Bet + "!");
      }
   }
   
}
