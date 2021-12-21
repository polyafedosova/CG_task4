package ru.vsu.fedosova_p_o.view;

import javax.swing.*;

public class MainWindow extends JFrame {

    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    public MainWindow() {
        setTitle("4 task");
        setSize(WIDTH, HEIGHT);
        add(new DrawPanel());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
