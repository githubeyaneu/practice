package eu.eyan.amoba;

import eu.eyan.amoba.computerplayer.ComputerPlayer;
import eu.eyan.amoba.table.AmobaGame;
import eu.eyan.game.multiplayer.GameCenter;
import eu.eyan.game.multiplayer.NetworkGame;

public class Amoba
{
    public static void main(String[] args)
    {
        AmobaGame initialState = new AmobaGame();
        NetworkGame amobaGame = GameCenter.getGameCenter().createGame("Amoba");
        amobaGame.addPlayer(new HumanPlayer());
        amobaGame.addPlayer(new ComputerPlayer());
    }
}