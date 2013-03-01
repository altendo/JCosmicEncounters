package org.mhb.suckitpaul.jce.cards;

import org.mhb.suckitpaul.Player;

/**
 * A Deck of DestinyCards
 * @author Morgan Bauer
 *
 */
public class DestinyDeck extends Deck {
  public DestinyDeck (Player [] ps)
  {
    // I think it was four colored cards for each player + ? wilds + ? specials
    for (Player p : ps)
    {
      for (int i =0;i<4;i++)
      {
        // maybe use an accessor for deckCards
          deckCards.add(new DestinyCard(p));
      }
    }
  }
}
