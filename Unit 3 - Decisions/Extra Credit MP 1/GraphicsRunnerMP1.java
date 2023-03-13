
import javax.swing.JFrame;

public class GraphicsRunnerMP1 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;

	public GraphicsRunnerMP1()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new ExtraCreditPictureMP1());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunnerMP1 run = new GraphicsRunnerMP1();
	}
}