package com.itamus90;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe extends JFrame
{
    JPanel jPanel = new JPanel();
    List<XOButton> buttons = new ArrayList<>(9);

    public TicTacToe()
    {
        super("TicTacToe");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jPanel.setLayout(new GridLayout(3,3));
        addButtons();
        add(jPanel);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new TicTacToe();
    }

    private void addButtons()
    {
        for (int i = 0; i < 9 ; i++)
        {
            buttons.add(new XOButton());
            jPanel.add(buttons.get(i));
        }
    }
}
