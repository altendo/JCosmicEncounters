package org.jcosmicencounters;

import java.util.HashMap;

public class HyperGate {

    private Player attacker;
    private HashMap<Player, Integer> attackers;

    public HyperGate() {
        this.attacker = null;
        this.attackers= new HashMap<>();
    }

    public void clear() {
        this.attacker = null;
        this.attackers.clear();
    }

}
