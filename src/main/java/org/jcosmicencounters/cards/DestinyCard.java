package org.jcosmicencounters.cards;

import org.jcosmicencounters.Player;

public class DestinyCard extends Card {

    private DestinyCardType type;
    private Player player;
    private String description;

    public DestinyCard(DestinyCardType type, String description) {
        this.description = description;
        this.type = type;
        this.player = null;
    }

    public DestinyCard(DestinyCardType type, String description, Player player) {
        this.description = description;
        this.type = type;
        this.player = player;
    }

    public String getDescription() {
        return this.description;
    }

    public DestinyCardType getDestinyCardType() {
        return this.type;
    }


    public void playCard() {

    }

}
