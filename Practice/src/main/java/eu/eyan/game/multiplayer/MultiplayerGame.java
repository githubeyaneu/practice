package eu.eyan.game.multiplayer;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

public class MultiplayerGame implements NetworkGame
{
    private String name;
    private List<GameStateChangeListener> listeners = newArrayList();

    public MultiplayerGame(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void addGameStateChangeListener(GameStateChangeListener gameStateChangedListener)
    {
        this.listeners.add(gameStateChangedListener);
    }

    @Override
    public void addPlayer(Player player)
    {
        addGameStateChangeListener(player);
    }
}