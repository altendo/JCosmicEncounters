package org.jcosmicencounters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Planet {

    /**
     * suggest map of players to number of ships they have on a planet
     */
    private Map<Player, Integer> occupiers = new HashMap<>();
    private Player player;

    /**
     * Constructors
     */
    public Planet() {

    }

    /**
     * The player to 
     * @param p
     */
    public Planet(Player p) {
        this.player = p;
        this.occupiers.put(p, 4);
    }

    /**
     * The player to create the given number of planets for.
     * @param p
     * @param startingPresence
     */
    public Planet(Player p, int startingPresence) {
        this.player = p;
        this.occupiers.put(p, startingPresence);
    }

    public int addShips(Player p, int numberOfNewShips) {

        int numberOfShips = this.occupiers.get(p).intValue();
        int newCount = numberOfShips + numberOfNewShips;
        this.occupiers.put(p, newCount);

        return newCount;

    }

    public int removeShips(Player p, int numberOfLostShips) {

        int numberOfShips = this.occupiers.get(p).intValue();
        int newCount = 0;

        if (numberOfLostShips < numberOfShips) {
            newCount = numberOfShips - numberOfLostShips;
        }

        this.occupiers.put(p, new Integer(newCount));
        return newCount;

    }

    public int getDefenseRank() {
        return this.occupiers.get(player).intValue();
    }

    public String getShipCount() {
        return this.toString();
    }

    public String toString() {

        StringBuffer buffer = new StringBuffer("");

        Set<Player> players = this.occupiers.keySet();
        for (Player player : players) {
            buffer.append("Player " + this.player.getID() + " : " + this.occupiers.get(player)  + " ships\n");
        }

        return buffer.toString();

    }

}
