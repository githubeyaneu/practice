package eu.eyan.amoba.table;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Table2D<FIELD_TYPE>
{
    List<List<FIELD_TYPE>> fields;

    public static <T> Table2D<T> newTable()
    {
        return new Table2D<T>();
    }

    protected void set(int x, int y, FIELD_TYPE value)
    {
        if (fields == null)
        {
            fields = newArrayList();
        }
        extendList(fields, x);
        if (fields.get(x) == null)
        {
            fields.set(x, newArrayList());
        }
        extendList(fields.get(x), y);
        fields.get(x).set(y, value);
    }

    private <T> void extendList(List<T> list, int index)
    {
        while (index > list.size() - 1)
        {
            list.add(null);
        }
    }

    public FIELD_TYPE get(int x, int y)
    {
        if (fields == null || fields.get(x) == null)
        {
            return null;
        }
        return fields.get(x).get(y);
    }

    public int sizeColumns()
    {
        return fields.size();
    }

    public int sizeRows(int columnIndex)
    {
        return fields.get(columnIndex) == null ? 0 : fields.get(columnIndex).size();
    }
}