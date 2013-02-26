package org.mhb.suckitpaul;

import org.mhb.suckitpaul.gamephases.GamePhase;
import org.mhb.suckitpaul.gamephases.Regroup;

class GameLoop
{
  enum gamePhase {
    Regroup(new org.mhb.suckitpaul.gamephases.Regroup()), Destiny(new GamePhase()),
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
    // five planets per player
    // initialize player planets
    // four ships per planet (20 total)
    // initialize player ships
    // initialize the decks
    // initialize the hands of the players
    while (true)
    {
      for (Player p : players) // go through players in order, if we ever shuffle the order, break out and loop around
        // for each loop allows us to switch containers at a later point
        // maybe catch either the concurrent modification exception or
        // throw one of our own indicating a PlayersChangedOrder exception
      {
        // this inner loop is fucking awful.
        // I think it needs to be switch to some more OO type thing,
        // a sort of gamephase visitor type thing
        // IDEA: maybe we have each gamephase as an actual class, and then
        // do something like gamephase.performphase(), etc.
        // e.g. in gamephases package
        for (gamePhase gp : gamePhase.values())
        {
          gp.doit();
          // alternate
          if (gp == gamePhase.Regroup)
          {
            // current player gets a ship from the warp
          }
        }
      }
    }
  }

  public static boolean functotest()
  {
    return true;
  }
}
