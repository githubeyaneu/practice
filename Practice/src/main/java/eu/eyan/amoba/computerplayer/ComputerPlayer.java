package eu.eyan.amoba.computerplayer;

import eu.eyan.game.multiplayer.GameStateChangedEvent;
import eu.eyan.game.multiplayer.Player;

public class ComputerPlayer implements Player
{

    @Override
    public void gameStateChanged(GameStateChangedEvent e)
    {
        System.out.println("game state changed.");
        System.out.println(e.getState());
    }
}