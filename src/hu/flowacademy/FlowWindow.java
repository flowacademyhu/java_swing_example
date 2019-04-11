package hu.flowacademy;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowWindow extends JFrame {

  public FlowWindow() throws HeadlessException {
    setTitle("Flow Layout window");

    for (int i = 0; i < 4; i++) {
      JButton button = new JButton("" + (i + 1));
      this.add(button);
    }

    this.setSize(1024, 768);
    this.setLayout(new FlowLayout());
    this.setVisible(true);
  }
}
