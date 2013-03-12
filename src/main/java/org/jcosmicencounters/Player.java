package org.jcosmicencounters;

import java.util.LinkedList;
import org.jcosmicencounters.cards.Hand;

public class Player {

    /**
     * Planet array for the players planets
     */
    private int id;
    private String name;
    private GameColor color;
    private Hand playerDeck;
    private Planet[] planets;
    private LinkedList<Planet> colonies;

    private static int MAX_PLAYER_ID = 1; 
 
    /**
     * initialize Planet array in constructor
     */
    public Player() {

        id = Player.MAX_PLAYER_ID;
        MAX_PLAYER_ID++;

        this.color = null;
        this.name = new String("Player " + id);

        this.planets = new Planet[4];
        //planets = new Planet[GameConstants.HOME_PLANET_COUNT];

        for (Planet p : this.planets) {
            p = new Planet(this);
        }

        this.playerDeck = new Hand();
        this.colonies = new LinkedList<>();

    }

    public int getID() {
        return this.id;
    }

    public GameColor getGameColor() {
        return this.color;
    }

    public void addColony(Planet planet) {
        this.colonies.addLast(planet);
    }

    public void removeColony(Planet planet) {
        this.colonies.remove(planet);
    }

    /**
     * change the number of planets a player has
     */
    public void changePlanetNumber(final int numPlanets) {
        planets = new Planet[numPlanets];
    }

}
