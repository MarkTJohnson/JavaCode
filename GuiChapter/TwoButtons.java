import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons
{
  JFrame frame;
  JLabel label;

  public static void main(String[] args)
  {
	TwoButtons gui = new TwoButtons();
	gui.go();
  }

  public void go()
  {
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JButton labelButton = new JButton("Change Label");
    labelButton.addActionListener(new LabelListener());

	JButton colorButton = new JButton("Change Color");
    colorButton.addActionListener(new ColorListener());

    label = new JLabel("I'm a label");
    MyDrawPanel thePanel = new MyDrawPanel();

	frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
    frame.getContentPane().add(BorderLayout.CENTER,thePanel);
	frame.getContentPane().add(BorderLayout.EAST,labelButton);
	frame.getContentPane().add(BorderLayout.WEST,label);

	frame.setSize(500,500);

	frame.setVisible(true);
  }

  class LabelListener implements ActionListener
  {
    private String firstMessage = "I'm a label";
    private String secondMessage = "Ouch";

    public void actionPerformed(ActionEvent event)
    {
        if (firstMessage.equals(label.getText()))
        {
	        label.setText(secondMessage);
        }
        else
        {
            label.setText(firstMessage);
        }
    } 
  } //end LabelListener

  class ColorListener implements ActionListener
  {
    private Integer nCounter = 0;
    public void actionPerformed(ActionEvent event)
    {
        for( Component c: frame.getContentPane().getComponents())
        {
            if (c instanceof JButton )
            {
                JButton b = (JButton) c;
                {
	                b.setText(b.getName() + "has been clicked " + Integer.toString(++nCounter) + " times.");
                }
            }
        }
        frame.repaint();
    } 
  } //end ColorListener
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
