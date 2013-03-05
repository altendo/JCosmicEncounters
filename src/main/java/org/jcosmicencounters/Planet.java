package org.mhb.suckitpaul;

import java.util.HashMap;
import java.util.Map;

public class Planet {
/**
 * suggest map of players to number of ships they have on a planet
 */
  private Map<Player, Integer> occupiers = new HashMap<>();
  /**
   * Constructors
   */
  /**
   * Constructor to be used for the warp, as the warp behaves like a planet with no owner
   */
  public Planet()
  {
    
  }
  /**
   * The player to 
   * @param p
   */
  public Planet(Player p)
  {
    occupiers.put(p, 4);
  }
  /**
   * The player to create the given number of planets for.
   * @param p
   * @param startingPresence
   */
  public Planet(Player p, int startingPresence)
  {
    occupiers.put(p, startingPresence);
  }
}
