package com.itamus90;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Itamar on 31-Aug-17.
 */
public class XOButton extends JButton implements ActionListener
{
    private ImageIcon X,O;
    /*
    * 0: nothing
    * 1: X
    * 2: O
    */
    private byte value = 0;

    public XOButton()
    {
        X = new ImageIcon(this.getClass().getClassLoader().getResource("com/itamus90/image/X.png"));
        O = new ImageIcon(this.getClass().getClassLoader().getResource("com/itamus90/image/O.png"));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        value++;

        //Back to zero
        value %= 3;

        switch (value)
        {
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;
        }
    }
}
