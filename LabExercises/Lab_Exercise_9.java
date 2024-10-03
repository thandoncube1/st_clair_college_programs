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
    int option = (cards / 13) + 1;
    int cardSuit = random.nextInt(option);
    int cardDeck = (cards % 13) + 1;
    String suit = new String();
    String deck = new String();
    // If statement to get the suit
    switch (cardSuit) {
     case 1 -> suit = "Diamond";
     case 2 -> suit = "Heart";
     case 3 -> suit = "Club";
     default -> suit = "Spade";
    }

    // This is the switch for selecting cards in the deck.
    switch (cardDeck) {
      case 1 -> deck = "Ace";
      case 2 -> deck = "2";
      case 3 -> deck = "3";
      case 4 -> deck = "4";
      case 5 -> deck = "5";
      case 6 -> deck = "6";
      case 7 -> deck = "7";
      case 8 -> deck = "8";
      case 9 -> deck = "9";
      case 10 -> deck = "10";
      case 11 -> deck = "Jack";
      case 12 -> deck = "Queen";
      default -> deck = "King";
    }
    // Print to the display what you picked.
    System.out.printf("You picked %s of %ss", deck, suit);
  }
}
