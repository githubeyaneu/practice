package eu.eyan.game.multiplayer;

public interface NetworkGame
{
    String getName();

    void addGameStateChangeListener(GameStateChangeListener gameStateChangedListener);

    void addPlayer(Player player);
}