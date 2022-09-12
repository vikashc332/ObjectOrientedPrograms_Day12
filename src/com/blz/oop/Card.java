package com.blz.oop;

public class Card {
    int noOfPlayer = 4;
    int noOfCardDistribution = 9;
    String[][] playerArray = new String[noOfPlayer][noOfCardDistribution];
    String[] DeckOfCard = new String[52];
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Card() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    void shuffleCard() {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            DeckOfCard[i] = rank + "-" + suit;
        }
    }

    void assignCards() {
        int count = 0;
        for (int i = 0; i < noOfPlayer; i++) {
            for (int j = 0; j < noOfCardDistribution; j++) {
                playerArray[i][j] = DeckOfCard[count++];
            }
        }
    }

    void display() {
        for (int i = 0; i < noOfPlayer; i++) {
            for (int j = 0; j < noOfCardDistribution; j++) {
                System.out.print("player" + (i + 1) + ": " + playerArray[i][j] + " | ");
            }
            System.out.println();
        }
    }
}



