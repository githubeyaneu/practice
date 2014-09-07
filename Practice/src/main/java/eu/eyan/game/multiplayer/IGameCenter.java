package eu.eyan.game.multiplayer;

import java.util.List;

public interface IGameCenter
{
    NetworkGame createGame(String nameOfGame);

    List<NetworkGame> listGames();
}