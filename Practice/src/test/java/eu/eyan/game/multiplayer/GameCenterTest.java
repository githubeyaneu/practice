package eu.eyan.game.multiplayer;

import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class GameCenterTest
{

    @Test
    public void testCreateListClose() throws Exception
    {
        IGameCenter gameCenter = GameCenter.getGameCenter();
        gameCenter.createGame("Amoba1");
        List<NetworkGame> games = gameCenter.listGames();
        assertThat(games).hasSize(1);
        assertThat(games.get(0).getName()).isEqualTo("Amoba1");

        gameCenter.createGame("Amoba2");
        games = gameCenter.listGames();
        assertThat(games).hasSize(2);
        assertThat(games.get(1).getName()).isEqualTo("Amoba2");
    }
}