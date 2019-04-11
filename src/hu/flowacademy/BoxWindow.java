package hu.flowacademy;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxWindow extends Frame {

  public BoxWindow() throws HeadlessException {
    setTitle("Box Layout window");

    for (int i = 0; i < 4; i++) {
      JButton button = new JButton("" + (i + 1));
      this.add(button);
    }

    this.setSize(1024, 768);
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.setVisible(true);
  }
}
