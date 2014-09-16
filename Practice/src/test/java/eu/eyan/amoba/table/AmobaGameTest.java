package eu.eyan.amoba.table;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class AmobaGameTest
{
    @Test
    public void testIsWin() throws Exception
    {
        assertThat(amobaGame("EEEEEEEEE").isWin()).isFalse();
        assertThat(amobaGame("XEEEEEEEE").isWin()).isFalse();
        assertThat(amobaGame("XXEEEEEEE").isWin()).isFalse();
        assertThat(amobaGame("XXXEEEEEE").isWin()).isTrue();
        assertThat(amobaGame("EXEEXEEEE").isWin()).isFalse();
        assertThat(amobaGame("EXEEXEEXE").isWin()).isTrue();
        assertThat(amobaGame("XEEEXEEEE").isWin()).isFalse();
        assertThat(amobaGame("XEEEXEEEX").isWin()).isTrue();
        assertThat(amobaGame("EEXEEEEEE").isWin()).isFalse();
        assertThat(amobaGame("EEXEXEEEE").isWin()).isFalse();
        assertThat(amobaGame("EEXEEEXEE").isWin()).isFalse();
        assertThat(amobaGame("EEEEXEXEE").isWin()).isFalse();
        assertThat(amobaGame("EEXEXEXEE").isWin()).isTrue();
    }

    @Test
    public void testGetSteps() throws Exception
    {
        assertThat(amobaGame("EEEEEEEEE").getSteps()).hasSize(18);
//        assertThat(amobaGame("XEEEEEEEE").getSteps()).hasSize(8);
//        assertThat(amobaGame("OEEEEEEEE").getSteps()).hasSize(8);
    }

    @Test
    public void testDoStep() throws Exception
    {
    }

    private static AmobaGame amobaGame(String stateString)
    {
        AmobaGame amobaGame = new AmobaGame();
        AmobaTable amobaTable = new AmobaTable(stateString);
        amobaGame.setTable(amobaTable);
        System.out.println(amobaTable.getString());
        return amobaGame;
    }
}