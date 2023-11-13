package gui.lesson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiSample extends JFrame{
    private JTextField textField1;
    private JButton OKButton;
    private JLabel GreetingText;
    private JPanel MainPanel;
    private JButton addButton;
    private JLabel sumText;
    private JTextField textField2;
    private JTextField textField3;
    private JButton averageButton;

    public GuiSample() {
        setContentPane(MainPanel);
        setTitle("Gui Sample MNG batch 10");
        setVisible(true);
        setSize(300,300);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                GreetingText.setText("Hello "+textField1.getText()+" welcome to programming java nc III");
                StringBuilder text1 = new StringBuilder(textField1.getText());
                String textOg  = textField1.getText();
                String msg = (textOg.equalsIgnoreCase(text1.reverse().toString())) ? "a Palindrome" : "Not a Palindrome" ;
                GreetingText.setText(textOg+" is "+msg);
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumText.setText("the sum of two numbers is "+(addTwonumbers()));
            }
        });
        averageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumText.setText("the average of two numbers is "+(addTwonumbers()/2));
            }
        });
    }

    public int addTwonumbers() {
        int a = Integer.parseInt(textField2.getText());
        int b = Integer.parseInt(textField3.getText());

        return (a+b);
    }
    public float avergTwonumbers() {

        return (addTwonumbers()/2);
    }

    public static void main(String[] args) {
        GuiSample gs = new GuiSample();
    }

}
