package org.mhb.suckitpaul.jce.cards;

import java.util.Collections;
import java.util.List;

/**
 * A deck is a collection of cards.
 * It has an order.
 * 
 * maybe this base should be abstract
 * @author Morgan Bauer
 *
 */
public class Deck {

  /**
   * container for the cards in the deck
   * ordered, so chose list as base
   * probably the actual instantiation is arraylist
   * 
   * maybe make an accessor for deckCards
   */
  protected List<Card> deckCards;
  /**
   * Shuffle the deck that this is called on.
   */
  public void shuffle()
  {
    Collections.shuffle(deckCards);
  }
}
