package org.jcosmicencounters;

import org.jcosmicencounters.gamephases.GamePhase;
import org.jcosmicencounters.gamephases.Regroup;

class GameLoop
{

  /**
   * enum representing the phases of the game.
   * alternately, we could use an array of phase objects directly,
   * or more directly implement the phases in the enum,
   * perhaps as a separate class itself.
   * @author Morgan Bauer
   *
   */
  enum gamePhase
  {
    Regroup(new Regroup()), Destiny(new GamePhase()),
    Launch(new GamePhase()), Alliance(new GamePhase()),
    Planning(new GamePhase()), Reveal(new GamePhase()), Resolution(new GamePhase());

    private GamePhase gp;

    private gamePhase(GamePhase gp)
    {
      this.gp = gp;
    }

    public void doit ()
    {
      gp.performPhase();
    }

  };
  // 50 aliens
  // 20 destiny cards
  // 72 Cosmic Cards
  // 50 Flare Cards
  // 20 Tech Cards

  // how many colonies a player has is something I think we can just generate each time we need to check rather than have a var for it
  // 20 ships per player
  // only have colors in destiny deck of people playing
  // each player has 5 planets, with 4 ships on each planet

  // eight cards from cosmic deck

  public static void main(String[] a)
  {

    // player array, in order
    Player [] players; // local var for now, while we get things in order, better than it being static

    // get the number of players
    System.out.print("How many players are there? ");
    int numPlayers = 5;
    System.out.print("\n There are " + numPlayers + " players.");

    // allocate players
    players = new Player [numPlayers];
    for(Player p : players) {
      p = new Player();
    }

    // five planets per player
    // initialize player planets
    // four ships per planet (20 total)
    // initialize player ships
    // initialize the decks
    // initialize the hands of the players
    // initialize the warp
    Planet warp = new Planet();
    while (true)
        {
      for (Player p : players) {// go through players in order, if we ever shuffle the order, break out and loop around
        // for each loop allows us to switch containers at a later point
        // maybe catch either the concurrent modification exception or
        // throw one of our own indicating a PlayersChangedOrder exception
          // I also forgot that we can run through the phases more than once for a player (three times, I think), so we might have to have an extra loop surrounding the gamephase loop
          for (playerTurn = 0; playerTurn < 3; ++playerTurn)
              {
        // this inner loop is fucking awful.
        // I think it needs to be switch to some more OO type thing,
        // a sort of gamephase visitor type thing
        // IDEA: maybe we have each gamephase as an actual class, and then
        // do something like gamephase.performphase(), etc.
        // e.g. in gamephases package
        for (gamePhase gp : gamePhase.values()) {
            // "activate" a players special ability if it can be used in the phase, maybe move this inside of phe phase running
            gp.doit(); // OO way of performing a phase
          // alternate
            if (gp == gamePhase.Regroup) { // explicit check for current phase
            // current player gets a ship from the warp
          }
        }
      }
      }

      break; // TODO temporary so this executes and dies
    }

  }

  public static boolean functotest()
  {
    return true;
  }

}
