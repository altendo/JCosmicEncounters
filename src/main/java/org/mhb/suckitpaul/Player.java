package org.mhb.suckitpaul;

public class Player {
/**
 * Planet array for the players planets
 */
  Planet [] planets = new Planet[4]; // default of four planets
  
  /**
   * change the number of planets a player has
   */
  public void changePlanetNumber(final int numPlanets)
  {
    planets = new Planet[numPlanets];
  }
  /**
   * initialize Planet array
   */
}
