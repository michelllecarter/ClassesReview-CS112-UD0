/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author: Michelle Carter
 * @version: 1.0 
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- instantiate card array of size 52
  - for each suit (4 kinds)
    - for each value (1 - 13, inclusive)
      - instantiate new card object with suit and value
      - add to array
	2. Print deck (simple)
	- for each card in deck (52 cards)
    - if 13th card, print new line
    - print current card
	*
	*/
	public static void main(String[] args) 
  {
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		//CardTester.main(null);
/*
    Card test1 = new Card(1, Card.DIAMOND),
         test2 = new Card(5, Card.HEART),
         test3 = new Card(13, Card.CLUB),
         test4 = new Card(10, Card.SPADE);
    
    test1.printCard();
    System.out.println( test2.getPrintCard() );
    System.out.println( test3.getPrintCard() );
    System.out.println( test4.getPrintCard() );
*/
		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array

   Card[] deck = new Card[52];
   char[] suits = {Card.DIAMOND, Card.HEART, Card.SPADE, Card.CLUB};
   for(int i = 0; i < 4; i++)
   {
      for(int j = 0; j < 13; j++)
      {
        deck[i*13 + j] = new Card(j+1, suits[i]);
      }
   }
/*
   //deck[1] = new Card(1, Card.DIAMOND);
   //deck[2] = new Card(2, Card.DIAMOND);
   //deck[3] = new Card(3, Card.DIAMOND);
   //deck[4] = new Card(4, Card.DIAMOND);
    
   for(int j = 0; j < 13; j++)
   {
     deck[j] = new Card(j+1, Card.DIAMOND);
   }
 for(int j = 0; j < 13; j++)
   {
     deck[j] = new Card(j+13, Card.HEART);
   }
*/
/*    
		//2. Print deck
    //simple deck printing
   for(int i = 0; i < deck.length; i++) //for(Card current : deck)
   {
     /*if(i % 13 == 0 && i != 0)
     {
       System.out.println();
     }
     System.out.print(deck[i] + "   ");
     
     deck[i].printCard();
   }
*/
    //hacker challenge 
    for(int i = 0; i < deck.length; i += 13) 
    {
      //row of 13 cards 
      //get set of cards (row of size 13) and break each into parts based on new line char (each card has 5 parts)
      String[][] cardRow = new String[13][5];

        for(int card = 0; card < cardRow.length; card++)
        {
          cardRow[card] = deck[i + card].getPrintCard().split("\n");
        }
      //loop through each of the parts for the row of cards
      for(int j = 0; j < 5; j++)
      {
        for(String[] card : cardRow)
        {
          System.out.print(card[j] + " ");
        }
        System.out.println();
      }
    }  
	}
}