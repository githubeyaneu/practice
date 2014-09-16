package eu.eyan.amoba.table;

import static eu.eyan.amoba.table.AmobaFieldState.E;

import java.util.List;

import eu.eyan.game.table.IGame;

public class AmobaGame implements IGame<AmobaGame, AmobaTable, AmobaStep>
{

    private AmobaTable table;

    @Override
    public AmobaGame doStep(AmobaStep step)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isWin()
    {
        for (int i = 0; i < table.sizeColumns(); i++)
        {
            if (table.get(0, i) != E && table.get(0, i) == table.get(1, i) && table.get(1, i) == table.get(2, i))
            {
                return true;
            }
            if (table.get(i, 0) != E && table.get(i, 0) == table.get(i, 1) && table.get(i, 1) == table.get(i, 2))
            {
                return true;
            }
        }
        if (table.get(0, 0) != E && table.get(0, 0) == table.get(1, 1) && table.get(1, 1) == table.get(2, 2))
        {
            return true;
        }
        if (table.get(2, 0) != E && table.get(2, 0) == table.get(1, 1) && table.get(1, 1) == table.get(0, 2))
        {
            return true;
        }
        return false;
    }

    @Override
    public List<AmobaStep> getSteps()
    {
        return null;
    }

    @Override
    public void setTable(AmobaTable table)
    {
        this.table = table;
    }
}