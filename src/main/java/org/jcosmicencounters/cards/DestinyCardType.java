package org.jcosmicencounters.cards;

/**
 * Nick, I was trying to avoid hardcoding the colors, because a) they don't matter b) I want this to be extensible & c) I'd like to be able to remap them client side, so anyone can have it look the way they want.
 * as far as (a) goes, what's important is the player being identified, which is why I gave the destiny card the player when I instantiated it.
 * for (b) we can try to create a version with more than five players.
 */
public enum DestinyCardType
{
    RED,
    BLUE,
    GREEN,
    YELLOW,
    PURPLE,
    WILD,
    SPECIAL;
}
