package eu.eyan.amoba.table;

import eu.eyan.game.table.ITable;

public class AmobaTable extends Table2D<AmobaFieldState> implements ITable
{
    public AmobaTable(String stateString)
    {
        assert (stateString.length() == 9);
        for (int i = 0; i < stateString.length(); i++)
        {
            int x = i / 3;
            int y = i % 3;
            AmobaFieldState state = AmobaFieldState.valueOf(stateString.charAt(i) + "");
            set(x, y, state);
        }
    }

    @Override
    public String getString()
    {
        String s = "";
        for (int x = 0; x < sizeColumns(); x++)
        {
            for (int y = 0; y < sizeRows(x); y++)
            {
                s += get(x, y);
            }
            s += System.lineSeparator();
        }
        return s;
    }
}