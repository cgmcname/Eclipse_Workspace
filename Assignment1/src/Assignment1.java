import javax.swing.JButton;
import javax.swing.JFrame;

public class Assignment1 extends JFrame
{
    public Assignment1() throws Exception
	{
        this.setTitle("Window yo");
        this.setSize(600,600);
        this.getContentPane().add(new JButton("Hey Buddy"));
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception
	{
        new Assignment1();
    }
}