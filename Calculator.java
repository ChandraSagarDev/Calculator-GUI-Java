import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    boolean isOperatorClicked = false;
    String oldValue;
    int operator;
    float result;

    JFrame jf;
    JLabel label;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton bdot;
    JButton b0;
    JButton bequals;
    JButton bdiv;
    JButton bmult;
    JButton bminus;
    JButton bplus;
    JButton bclear, bdel;

    Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(535, 600);
        jf.setLocation(300, 70);

        label = new JLabel("");
        label.setBounds(20, 30, 480, 65);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial", Font.BOLD, 36)); 
        jf.add(label);

        b7 = createButton("7", 20, 130);
        b8 = createButton("8", 120, 130);
        b9 = createButton("9", 220, 130);
        b4 = createButton("4", 20, 230);
        b5 = createButton("5", 120, 230);
        b6 = createButton("6", 220, 230);
        b1 = createButton("1", 20, 330);
        b2 = createButton("2", 120, 330);
        b3 = createButton("3", 220, 330);
        bdot = createButton(".", 20, 430);
        b0 = createButton("0", 120, 430);
        bequals = createButton("=", 220, 430);
        bdiv = createButton("/", 320, 130);
        bmult = createButton("x", 320, 230);
        bminus = createButton("-", 320, 330);
        bplus = createButton("+", 320, 430);
        bclear = createButton("clear", 420, 130, 80, 180);
        bdel = createButton("del", 420, 330, 80, 180);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 80, 80);
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.BOLD, 24)); 
        jf.add(button);
        return button;
    }

    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.BOLD, 19)); 
        jf.add(button);
        return button;
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b7) {
            if (isOperatorClicked) {
                label.setText("7");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "7");
            }
        } else if (e.getSource() == b8) {
            if (isOperatorClicked) {
                label.setText("8");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "8");
            }
        } else if (e.getSource() == b9) {
            if (isOperatorClicked) {
                label.setText("9");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "9");
            }
        } else if (e.getSource() == b4) {
            if (isOperatorClicked) {
                label.setText("4");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "4");
            }
        } else if (e.getSource() == b5) {
            if (isOperatorClicked) {
                label.setText("5");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "5");
            }
        } else if (e.getSource() == b6) {
            if (isOperatorClicked) {
                label.setText("6");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "6");
            }
        } else if (e.getSource() == b1) {
            if (isOperatorClicked) {
                label.setText("1");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "1");
            }
        } else if (e.getSource() == b2) {
            if (isOperatorClicked) {
                label.setText("2");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "2");
            }
        } else if (e.getSource() == b3) {
            if (isOperatorClicked) {
                label.setText("3");
                isOperatorClicked = false;
            } else {
                label.setText(label.getText() + "3");
            }
        } else if (e.getSource() == bdot) {
            label.setText(label.getText() + ".");
        } else if (e.getSource() == b0) {
            label.setText(label.getText() + "0");
        } else if (e.getSource() == bequals) {
            String newValue = label.getText();
            float oldF = Float.parseFloat(oldValue);
            float newF = Float.parseFloat(newValue);

            switch (operator) {
                case 1:
                    result = (oldF / newF);
                    label.setText(result + "");
                    break;
                case 2:
                    result = oldF * newF;
                    label.setText(result + "");
                    break;
                case 3:
                    result = oldF - newF;
                    label.setText(result + "");
                    break;
                case 4:
                    result = oldF + newF;
                    label.setText(result + "");
                    break;
                default:
                    label.setText("Syntax error");
                    break;
            }
        } else if (e.getSource() == bdiv) {
            oldValue = label.getText();
            label.setText("/");
            isOperatorClicked = true;
            operator = 1;
        } else if (e.getSource() == bmult) {
            oldValue = label.getText();
            label.setText("x");
            isOperatorClicked = true;
            operator = 2;
        } else if (e.getSource() == bminus) {
            oldValue = label.getText();
            label.setText("-");
            isOperatorClicked = true;
            operator = 3;
        } else if (e.getSource() == bplus) {
            oldValue = label.getText();
            label.setText("+");
            isOperatorClicked = true;
            operator = 4;
        } else if (e.getSource() == bclear) {
            label.setText("");
        } else if (e.getSource() == bdel) {
            String s = label.getText();
            label.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                label.setText(label.getText() + s.charAt(i));
            }
        }
    }
}
