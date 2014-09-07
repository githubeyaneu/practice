package eu.eyan.game.multiplayer;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GameCenter implements IGameCenter
{
    private static final GameCenter GAME_CENTER = new GameCenter();

    private List<NetworkGame> games = newArrayList();

    @Override
    public NetworkGame createGame(String nameOfGame)
    {
        MultiplayerGame game = new MultiplayerGame(nameOfGame);
        games.add(game);
        return game;
    }

    @Override
    public List<NetworkGame> listGames()
    {
        return newArrayList(games);
    }

    public static IGameCenter getGameCenter()
    {
        return GAME_CENTER;
    }
}