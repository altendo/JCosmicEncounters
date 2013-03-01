package org.mhb.suckitpaul;

import java.util.Map;

public class Planet {
/**
 * suggest map of players to number of ships they have on a planet
 */
  private Map<Player, Integer> occupiers;
  public Planet(Player p)
  {
    occupiers.put(p, 4);
  }
  public Planet(Player p, int startingPresence)
  {
    occupiers.put(p, startingPresence);
  }
}
