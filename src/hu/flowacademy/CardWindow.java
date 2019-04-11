package hu.flowacademy;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardWindow extends JFrame {

  CardLayout card;
  Container parentContainer;

  public CardWindow() throws HeadlessException {
    card = new CardLayout();
    parentContainer = getContentPane();

    setTitle("Card Layout window");

    for (int i = 0; i < 4; i++) {
      JButton button = new JButton("" + (i + 1));
      button.addActionListener((e) -> {
//        card.next(parentContainer);
        card.previous(parentContainer);
      });
      this.add(button);
    }

    this.setSize(1024, 768);
    this.setLayout(card);
    this.setVisible(true);

  }
}
