package collections.methods;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Ace Of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);


        Card kingOfClub  = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingOfClubs = Collections.nCopies(13, kingOfClub);
        Card.printDeck(kingOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards,"Card collections with Aces added", 1);

        Collections.copy(cards, kingOfClubs);
        Card.printDeck(cards,"Card collection with Kings copied", 2);

        cards = List.copyOf(kingOfClubs);
        Card.printDeck(cards, "List copy of Kings", 1);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffle Deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed deck of Cards", 4);

        var sortingAlgorithms = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithms);
        Card.printDeck(deck, "Standard deck sorted by rank, suit", 13);

        Collections.reverse(deck);
        Card.printDeck(deck, "Sorted by rank, suit revered", 13);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "Kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "Tens in deck", 1);

        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("sublist index for tens = " + subListIndex);
        System.out.println("Contains = " + deck.containsAll(tens));

        // false coz decks and tens have an element common
        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("Disjoint = " + disjoint);

        // true coz decks and kings don't have an element common
        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("Disjoint = " + disjoint2);

        deck.sort(sortingAlgorithms);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithms);
        System.out.println("foundIndex in binarySearch = " + foundIndex);
        System.out.println("foundIndex in indexOf method = " + deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);

        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        Collections.replaceAll(deck, tenOfHearts, tenOfClubs);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        if (Collections.replaceAll(deck, tenOfHearts, tenOfClubs)) {
            System.out.println("Tens of hearts replaced with tens of clubs");
        } else  {
            System.out.println("No tens of hearts found in the list");
        }

        System.out.println("Ten of Clubs Cards = " + Collections.frequency(deck, tenOfClubs));

        System.out.println("Best Card = " + Collections.max(deck, sortingAlgorithms));
        System.out.println("Worst Card = " + Collections.min(deck, sortingAlgorithms));

        var sortBySuit = Comparator.comparing(Card::suit)
                .thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck, "Sorted by Suit, Rank", 4);

        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);

        System.out.println("Unrotated: " + deck.subList(0, 13));
        System.out.println("Rotated: " + 2 + ": " + copied);
    }
}
