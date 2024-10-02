package LabExercises;

import java.util.*;

public class Lab_Exercise_9 {
  public static void main(String[] args) {
    Random random = new Random();
    // Generate random 52 number to represent a deck of cards
    // using if/else statements to select suits divide 52/13
    // From the for use modulo to get out of the 52 select 1 to 13
    // ~ Ace to King ~ match with suit when picking a card.
    int cards = random.nextInt(52) + 1;
    int result = (cards / 13) + 1;
    int cardSuit = random.nextInt(result);
    String suit;
    // If statement to get the suit
    if (cardSuit == 1) {
      suit = "Diamond";
    } else if (cardSuit == 2) {
      suit = "Heart";
    } else if (cardSuit == 3) {
      suit = "Club";
    } else {
      suit = "Spade";
    }



    System.out.printf("You picked %ss", suit);

  }
}
