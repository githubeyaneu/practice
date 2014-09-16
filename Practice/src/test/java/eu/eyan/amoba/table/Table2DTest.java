package eu.eyan.amoba.table;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class Table2DTest
{
    @Test
    public void testTable() throws Exception
    {
        Table2D<Integer> table = Table2D.newTable();
        System.out.println(table);
        table.set(2, 1, 2);
        System.out.println(table);
        assertThat(table.get(0, 0) == null).isTrue();
        assertThat(table.get(1, 0) == null).isTrue();
        assertThat(table.get(0, 1) == null).isTrue();
        assertThat(table.get(2, 1)).isEqualTo(2);
        assertThat(table.sizeColumns()).isEqualTo(3);
        assertThat(table.sizeRows(0)).isEqualTo(0);
        assertThat(table.sizeRows(1)).isEqualTo(0);
        assertThat(table.sizeRows(2)).isEqualTo(2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExtendBad() throws Exception
    {
        Table2D<Integer> table = Table2D.newTable();
        table.set(1, 1, 2);
        assertThat(table.get(10, 10) == null).isTrue();
    }
}