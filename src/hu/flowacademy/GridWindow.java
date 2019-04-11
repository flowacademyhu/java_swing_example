package hu.flowacademy;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridWindow extends JFrame {

  public GridWindow() {
    setTitle("Grid Layout window");

    for (int i = 0; i < 9; i++) {
      JButton button = new JButton("" + i);
      this.add(button);
    }

    this.setSize(1024, 768);
    this.setLayout(new GridLayout(3,3));
    this.setVisible(true);
  }
}
