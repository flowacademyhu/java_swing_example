package hu.flowacademy;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window extends JFrame {

  public static final String TITLE = "My window!";

  public Window() throws HeadlessException {
    setTitle(TITLE);

    setButton();
    setRadioAndChbox();
    setLabel();
    setInputFields();

    this.setSize(1024, 768);
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  private void setLabel() {
    JLabel label = new JLabel("Hey-yo");
    label.setBounds(600, 360, 300, 20);

    this.add(label);
  }

  private void setInputFields() {
    JTextField textField = new JTextField("I love my bicycle");
    textField.setBounds(350, 280, 200, 50);
    textField.setBackground(Color.MAGENTA);
    textField.setForeground(Color.WHITE);

    this.add(textField);

    JTextArea textArea = new JTextArea("Hello darling ;)");

    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setLocation(400, 350);
    scrollPane.setSize(200, 250);

    this.add(scrollPane);
  }

  private void setRadioAndChbox() {
    JRadioButton radioButton = new JRadioButton("Radio ga-ga");
    radioButton.setBounds(200, 120, 150, 50);

    this.add(radioButton);

    JCheckBox checkBox = new JCheckBox("Love of my Java");
    checkBox.setBounds(270, 200, 150, 50);

    this.add(checkBox);
  }

  private void setButton() {
    JButton button = new JButton("Click me!");
    button.setBounds(0,0, 200, 100);

//    button.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//
//      }
//    });

    button.addActionListener((ActionEvent e) -> {
      JOptionPane.showMessageDialog(this,"VIRUS!!!!!");
    });

    this.add(button);
  }
}
