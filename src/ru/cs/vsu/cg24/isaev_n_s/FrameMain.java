package ru.cs.vsu.cg24.isaev_n_s;

import javax.swing.*;

public class FrameMain extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel paintAreaPanel;
    private DrawPanel dp;

    public FrameMain() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        dp = new DrawPanel();
        paintAreaPanel.add(dp);
    }

    public static void main(String[] args) {
        FrameMain dialog = new FrameMain();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
