package eu.eyan.amoba.gui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

public class AmobaTablaView extends JPanel
{
    private static final long serialVersionUID = 1L;
    private Field jelzo = new Field();
    private Field[][] fields = new Field[3][3];

    public AmobaTablaView()
    {
        initTabla();
        jelzo.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                initTabla();
            }
        });
    }

    private void initTabla()
    {
        this.removeAll();
        this.setLayout(new FormLayout("pref,pref,pref", "pref,pref,pref,pref"));
        for (int x = 0; x < fields.length; x++)
        {
            for (int y = 0; y < fields[x].length; y++)
            {
                Field mezo = new Field();
                fields[x][y] = mezo;
                this.add(mezo, CC.xy(x + 1, y + 2));
                mezo.addMouseListener(new MouseAdapter()
                {
                    @Override
                    public void mouseClicked(MouseEvent e)
                    {
                        mezoKlick(e);
                    }
                });
            }
        }
        this.add(jelzo, CC.xy(2, 1));
        jelzo.setText("x");
        this.revalidate();
    }

    private void mezoKlick(MouseEvent e)
    {
        Field mezo = (Field) e.getSource();
        if (mezo.getText().equals(""))
        {
            mezo.setText(jelzo.getText());
            if (jelzo.getText().equals("x"))
            {
                jelzo.setText("o");
            }
            else
            {
                jelzo.setText("x");
            }
        }
        checkTable(fields);
    }

    private void checkTable(Field[][] fields)
    {
        for (int i = 0; i < fields.length; i++)
        {
            checkFields(fields[0][i], fields[1][i], fields[2][i]);
            checkFields(fields[i][0], fields[i][1], fields[i][2]);
        }
        checkFields(fields[0][0], fields[1][1], fields[2][2]);
        checkFields(fields[2][0], fields[1][1], fields[0][2]);
    }

    private void checkFields(Field... fields)
    {
        String first = fields[0].getText();
        for (Field field : fields)
        {
            if (!first.equals(field.getText()) || first.equals(""))
            {
                return;
            }
        }
        for (Field field : fields)
        {
            field.setForeground(Color.red);
        }
    }
}