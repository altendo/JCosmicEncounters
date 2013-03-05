package org.jcosmicencounters.cards;

import org.jcosmicencounters.Player;

public class DestinyCard extends Card
{

  private Player p;
  
  public enum DestinyCardType 
  {
    Colored, Wild, Special;
  }
  
  public DestinyCard(Player p)
  {
    this.p = p;
  }

}
