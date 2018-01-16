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
      System.out.print(">>>");
      this.Bet = sc.nextInt();
   }
   
   void BetHandler(int Bet, int Money) {
      if(Bet > Money) {
         System.out.println("Oops, you seem to be a little short!");
         System.out.println("Please try again.");
         System.out.print(">>>");
         this.Bet = sc.nextInt();
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
   
   boolean checkAces() {
      this.P1.Aces = P1.NumberAces(P1.cardHand);
      this.D.Aces = D.NumberAces(D.cardHand);
      if(D.Aces==2) {
         D.DealerValue = 21;
         System.out.println("Dealer has BlackJack!");return true;
      }
      else if(D.Aces==1 && D.DealerValue==21) {
         System.out.println("Dealer has BlackJack!");return true;
      }
      else if(P1.Aces==2) {
         P1.PlayerValue = 21;
         System.out.println("Player has BlackJack!");return true;
      }
      else if(P1.Aces==1 && P1.PlayerValue==21) {
         System.out.println("Player has BlackJack!");return true;
      }
      return false;
   }
   
   void PlayerMove(int PlayerValue) {
      
      if(PlayerValue > 15 && PlayerValue < 21) {
         System.out.println("Would you like to draw from deck?");
         System.out.println("Type 'Yes' to draw, 'No' to pass.");
         System.out.print(">>>");
         P1.toDraw = sc.next();
      } else {
         System.out.println("Since you have under 16 pts, you are forced to draw!");
         P1.toDraw = "Yes";
      }
      System.out.println("P1.toDraw : " + P1.toDraw);
      P1.isDraw = P1.Draw(P1.toDraw);
   }
   
}
