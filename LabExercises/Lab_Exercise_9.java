package LabExercises;

import java.util.*;

public class Lab_Exercise_9 {
  public static void main(String[] args) {
    // Use the Scanner to get choice options for the game
    // Have a shuffle option for the deck
    // Add a pick from deck option
    // End game state update
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.println("""
          Welcome to the Pick A Card Game ♣️ ♠️ ♥️ ♦️
          1). Shuffle cards (S)
          2). Pick a card from the Deck (P)
          3). Exit the game (E)
        """);
    String endGame = "";
    String suit = "Diamond, Club, Heart, Spade";
    String deck = "Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King";
    String choice = "";
    int pick = random.nextInt(13) + 1;
    int option = random.nextInt(4) + 1;
    String select;

    do {
       do {
          System.out.print("Please shuffle the deck. Enter (S): ");
          choice = input.nextLine().strip().toUpperCase();
      } while(!choice.equals("S"));
      
       if (choice.equals("S")) {
          pick = random.nextInt(13) + 1;
          option = random.nextInt(4) + 1;
       }
       // Select cards from the deck
       // Subtract 1 from the random selection to access index 0 for the String
       // Else you will get OutOfBounds Exceptions
       String deckSelection = deck.split(", ")[pick-1];
       String suitSelection = suit.split(",")[option-1];
       System.out.printf("\n\nThe card you picked is %s of %ss.\n\n", deckSelection, suitSelection);
       // Ask for continuance or end game.
       System.out.print("Would you like to pick another card\nEnter [Y] for Yes or [E] to Exit: ");
       select = input.nextLine().strip().toUpperCase();
       if (select.equals("Y")) {
          endGame = select;
       } else if (select.equals("E")) {
          endGame = select;
       } else endGame = "E";
    } while(!endGame.equals("E"));

    System.out.println("Thank you for playing!");
  }
}
