package hu.flowacademy;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderWindow extends JFrame {

  public BorderWindow() throws HeadlessException {
    setTitle("Border Layout window");

    JButton northButton = new JButton("NORTH");
    JButton southButton = new JButton("SOUTH");
    JButton eastButton = new JButton("EAST");
    JButton westButton = new JButton("WEST");
    JButton centerButton = new JButton("CENTER");

    this.add(northButton, BorderLayout.NORTH);
    this.add(southButton, BorderLayout.SOUTH);
    this.add(eastButton, BorderLayout.EAST);
    this.add(westButton, BorderLayout.WEST);
    this.add(centerButton, BorderLayout.CENTER);

    this.setSize(1024, 768);
//    this.setLayout(new BorderLayout());
    this.setVisible(true);
  }


}
