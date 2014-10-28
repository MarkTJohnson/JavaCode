import javax.swing.*;
java import.awt.*;
import java.awt.event.*;

public class ThirdGui implements ActionListener
{
  JFrame frame;
  JButton button;

  public static void main(String[] args)
  {
	ThirdGui gui = new ThirdGui();
	gui.go();
  }

  public void go()
  {
	frame = new JFrame();
	button = new JButton("color change");
    MyDrawPanel thePanel = new MyDrawPanel();

    button.setBounds(1,1,120,120);
	button.addActionListener(this);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add(BorderLayout.SOUTH,button);
    frame.getContentPane().add(BorderLayout.CENTER,thePanel);

	frame.setSize(500,500);

	frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event)
  {
	button.setText("I've been clicked");
    frame.repaint();
  } 
}

class MyDrawPanel extends JPanel
{
	public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color startColor = new Color(red, green, blue);
        int leftNumber = (int) (Math.random() * 70);
        int rightNumber = leftNumber +  80;

        red = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gp = new GradientPaint(leftNumber,leftNumber,startColor, rightNumber,rightNumber, endColor);
        g2d.setPaint(gp);
        g2d.fillOval(70,70,100,100);
    }
}
