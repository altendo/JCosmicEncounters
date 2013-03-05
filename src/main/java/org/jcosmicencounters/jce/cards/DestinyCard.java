package org.mhb.suckitpaul.jce.cards;

import org.mhb.suckitpaul.Player;

public class DestinyCard extends Card {
  private Player p;
  
  public enum DestinyCardType {
    Colored, Wild, Special;
  }
  
  public DestinyCard(Player p)
  {
    this.p = p;
  }
}
