import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JList;

public class RockPaperScissorsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtRockPaperScissors;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissorsFrame frame = new RockPaperScissorsFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RockPaperScissorsFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRockPaperScissors = new JTextField();
		txtRockPaperScissors.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		txtRockPaperScissors.setHorizontalAlignment(SwingConstants.CENTER);
		txtRockPaperScissors.setForeground(new Color(0, 0, 0));
		txtRockPaperScissors.setBackground(new Color(102, 204, 255));
		txtRockPaperScissors.setBounds(186, 51, 500, 88);
		txtRockPaperScissors.setText("Rock | Paper | Scissors");
		contentPane.add(txtRockPaperScissors);
		txtRockPaperScissors.setColumns(10);
		
		JButton btnNewButton = new JButton(" ", new ImageIcon("Rock Pixel.png"));
		btnNewButton.setForeground(new Color(51, 204, 102));
		btnNewButton.setBackground(new Color(51, 204, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(59, 259, 200, 150);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" ", new ImageIcon("Paper Pixel.png"));
		btnNewButton_1.setForeground(new Color(51, 204, 102));
		btnNewButton_1.setBackground(new Color(51, 204, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(334, 259, 200, 150);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton(" ", new ImageIcon("Scissors (Shears) Pixel.png"));
		btnNewButton_2.setForeground(new Color(51, 204, 102));
		btnNewButton_2.setBackground(new Color(51, 204, 102));
		btnNewButton_2.setBounds(605, 259, 200, 150);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Click Me!");
		btnNewButton_3.setBackground(new Color(255, 102, 0));
		btnNewButton_3.setBounds(10, 502, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_3.addActionListener(
				
				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						
						int color = (int) (Math.random() * 5);
						
						if (color == 0) {
							
							
							contentPane.setBackground(new Color(204, 0, 102));
							
							txtRockPaperScissors.setBackground(new Color(51, 255, 255));
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));
							
							btnNewButton.setForeground(new Color(255, 153, 0));
							btnNewButton.setBackground(new Color(255, 153, 0));
							
							btnNewButton_1.setForeground(new Color(255, 153, 0));
							btnNewButton_1.setBackground(new Color(255, 153, 0));
							
							btnNewButton_2.setForeground(new Color(255, 153, 0));
							btnNewButton_2.setBackground(new Color(255, 153, 0));
							
							btnNewButton_3.setBackground(new Color(51, 204, 102));
						
						} else if (color == 1) {
							
							contentPane.setBackground(new Color(204, 102, 153));

							txtRockPaperScissors.setBackground(new Color(0, 102, 102));
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));

							btnNewButton.setForeground(new Color(204, 204, 0));
							btnNewButton.setBackground(new Color(204, 204, 0));

							btnNewButton_1.setForeground(new Color(204, 204, 0));
							btnNewButton_1.setBackground(new Color(204, 204, 0));

							btnNewButton_2.setForeground(new Color(204, 204, 0));
							btnNewButton_2.setBackground(new Color(204, 204, 0));

							btnNewButton_3.setBackground(new Color(0, 153, 153));

						} else if (color == 2) { 
							
							contentPane.setBackground(new Color(153, 102, 102));
							
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));
							txtRockPaperScissors.setBackground(new Color(102, 204, 255));
							
							btnNewButton.setForeground(new Color(51, 204, 102));
							btnNewButton.setBackground(new Color(51, 204, 102));

							btnNewButton_1.setForeground(new Color(51, 204, 102));
							btnNewButton_1.setBackground(new Color(51, 204, 102));

							btnNewButton_2.setForeground(new Color(51, 204, 102));
							btnNewButton_2.setBackground(new Color(51, 204, 102));
	
							btnNewButton_3.setBackground(new Color(255, 102, 0));
							
						} else if (color == 3) {
							
							contentPane.setBackground(new Color(0, 102, 153));
							
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));
							txtRockPaperScissors.setBackground(new Color(204, 255, 0));
							
							btnNewButton.setForeground(new Color(255, 0, 153));
							btnNewButton.setBackground(new Color(255, 0, 153));

							btnNewButton_1.setForeground(new Color(255, 0, 153));
							btnNewButton_1.setBackground(new Color(255, 0, 153));

							btnNewButton_2.setForeground(new Color(255, 0, 153));
							btnNewButton_2.setBackground(new Color(255, 0, 153));
	
							btnNewButton_3.setBackground(new Color(51, 255, 255));
							
						} else {
							
							contentPane.setBackground(new Color(0, 51, 204));
							
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));
							txtRockPaperScissors.setBackground(new Color(204, 102, 0));
							
							btnNewButton.setForeground(new Color(204, 204, 0));
							btnNewButton.setBackground(new Color(204, 204, 0));

							btnNewButton_1.setForeground(new Color(204, 204, 0));
							btnNewButton_1.setBackground(new Color(204, 204, 0));

							btnNewButton_2.setForeground(new Color(204, 204, 0));
							btnNewButton_2.setBackground(new Color(204, 204, 0));
	
							btnNewButton_3.setBackground(new Color(204, 0, 0));
							
						}
						
					}
					
					
				}
		);
		
		btnNewButton.addActionListener(
		
				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						
						int computerWin = 0; 
						
						int playerWin = 0;
						
						int gamesPlayed = 0;
						
						String result = RockPaperScissorsMethod.winOrLose("Rock");
						String output = "You chose rock \n";
						
						if (result.equals("Win")) {
							
							output += "Computer chose scissors \n";
							output += "You win!";
							JOptionPane.showMessageDialog(null, output);

							playerWin ++;
							
							gamesPlayed ++;
							
						} else if (result.equals("Lose")) {
							
							output += "Computer chose paper \n";
							output += "You lose...";
							JOptionPane.showMessageDialog(null, output);
							
							computerWin ++;
							
							gamesPlayed ++;
							
						} else {
							
							output += "Computer also chose rock \n";
							output += "It's A Draw...";
							JOptionPane.showMessageDialog(null, output);
							
							gamesPlayed ++;
							
						}
						
						//stats (); 
						
						//JOptionPane.showMessageDialog(null, stats());
						
					}
					
					
				}
		);
		
		btnNewButton_1.addActionListener(
				
				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						
						int computerWin = 0; 
						
						int playerWin = 0;
						
						int gamesPlayed = 0;
						
						String result = RockPaperScissorsMethod.winOrLose("Paper");
						String output = "You chose paper \n";
						
						if (result.equals("Win")) {
							
							output += "Computer chose rock \n";
							output += "You win!";
							JOptionPane.showMessageDialog(null, output);

						playerWin ++;
						
						gamesPlayed ++;
							
						} else if (result.equals("Lose")) {
							
							output += "Computer chose scissors \n";
							output += "You lose...";
							JOptionPane.showMessageDialog(null, output);
							
							computerWin ++;
							
							gamesPlayed ++;
							
						} else {
							
							output += "Computer also chose paper \n";
							output += "It's A Draw...";
							JOptionPane.showMessageDialog(null, output);
							
							gamesPlayed ++;
							
						}
						
						//stats (); 
						
						//JOptionPane.showMessageDialog(null, stats());
						
					}
					
					
				}
		);
		
		btnNewButton_2.addActionListener(
				
				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						
						int computerWin = 0; 
						
						int playerWin = 0;
						
						int gamesPlayed = 0;
						
						String result = RockPaperScissorsMethod.winOrLose("Scissors");
						String output = "You chose scissors \n";
						
						if (result.equals("Win")) {
							
							output += "Computer chose paper \n";
							output += "You win!";
							JOptionPane.showMessageDialog(null, output);

							playerWin ++;
							
							gamesPlayed ++;
							
						} else if (result.equals("Lose")) {
							
							output += "Computer chose rock \n";
							output += "You lose...";
							JOptionPane.showMessageDialog(null, output);
							
							computerWin ++;
							
							gamesPlayed ++;
							
						} else {
							
							output += "Computer also chose scissors \n";
							output += "It's A Draw...";
							JOptionPane.showMessageDialog(null, output);
							
							gamesPlayed ++;
							
						}
												
					}
					
					
				}
		);
		
	}
}
