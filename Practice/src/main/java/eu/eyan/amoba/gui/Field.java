package eu.eyan.amoba.gui;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JTextField;

public class Field extends JTextField
{
    private static final long serialVersionUID = 1L;

    public Field()
    {
        this.setText("");
        this.setPreferredSize(new Dimension(100, 100));
        this.setEditable(false);
        this.setFont(new Font("", Font.BOLD, 70));
        this.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        this.setAlignmentY(JComponent.CENTER_ALIGNMENT);
    }
}