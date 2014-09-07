package eu.eyan.amoba;

import eu.eyan.amoba.gui.AmobaGui;
import eu.eyan.game.multiplayer.GameStateChangedEvent;
import eu.eyan.game.multiplayer.Player;

public class HumanPlayer implements Player
{
    AmobaGui gui = new AmobaGui();

    public HumanPlayer()
    {
        gui.start();
    }

    @Override
    public void gameStateChanged(GameStateChangedEvent e)
    {
        gui.gameStateChanged(e);
    }
}