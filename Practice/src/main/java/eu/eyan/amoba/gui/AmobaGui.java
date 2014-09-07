package eu.eyan.amoba.gui;

import javax.swing.JFrame;

import eu.eyan.amoba.AmobaTabla;
import eu.eyan.game.multiplayer.GameStateChangeListener;
import eu.eyan.game.multiplayer.GameStateChangedEvent;

public class AmobaGui implements GameStateChangeListener
{
    public void start()
    {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.add(new AmobaTabla());
        jFrame.pack();
        jFrame.setVisible(true);
    }

    @Override
    public void gameStateChanged(GameStateChangedEvent e)
    {
    }
}
