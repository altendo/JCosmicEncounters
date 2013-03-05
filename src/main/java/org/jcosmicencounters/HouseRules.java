package org.jcosmicencounters;

public class HouseRules
{
	// a place to put the house rules that we want to make available
	// this should contain the places where stuff needs to change and what needs to chane to to make stuff behave differently
	
	// one thing could be the extra players that we might want above and beyond the maximum five
  public void changeNumberOfPlanetsForAllPlayers(Player [] ps, int numPlanets)
  {

    for (Player p : ps) {
      p.changePlanetNumber(numPlanets);
    }

  }

}
