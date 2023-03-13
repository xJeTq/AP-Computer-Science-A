import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JPasswordField;

public class WordScrambleWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtRockPaperScissors;
	private JButton btnNewButton_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_8;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordScrambleWindow frame = new WordScrambleWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void clearFields () {
		
		textField_4.setText(null);
		
	}
	
	public static String[] wordScramble (String[] words) {
		
		String[] newArray = new String[words.length];
		
		for (int i = 0; i < words.length; i ++) {
				
			String word = words[i];
			
			String newOutput = "";
			
			newOutput += word.substring(2 * word.length() / 4, 3 * word.length() / 4);
			
			newOutput += word.substring(word.length() / 4, 2 * word.length() / 4);
			
			newOutput += word.substring(0, word.length() / 4);
			
			newOutput += word.substring(3 * word.length() / 4);
			
			newArray[i] = newOutput;
				
		}
		
		return newArray;
		
	} 
	

	/**
	 * Create the frame.
	 */
	
	public WordScrambleWindow() {
		
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
		txtRockPaperScissors.setBounds(186, 37, 500, 88);
		txtRockPaperScissors.setText("Word Scramble!");
		contentPane.add(txtRockPaperScissors);
		txtRockPaperScissors.setColumns(10);
		
		btnNewButton_3 = new JButton("Click Me!");
		btnNewButton_3.setBackground(new Color(255, 102, 0));
		btnNewButton_3.setBounds(10, 502, 89, 23);
		contentPane.add(btnNewButton_3);
		
		textField_8 = new JTextField();
		textField_8.setText("ajav");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(Color.BLACK);
		textField_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(0, 153, 153));
		textField_8.setBounds(225, 136, 418, 85);
		contentPane.add(textField_8);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBounds(283, 317, 312, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setText("Enter response here. ");
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBounds(350, 411, 171, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		contentPane.add(textField_4);
		
		textField_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
								
				int score = 0; 
				
				int gameCounter = 0;
				
				String[] words = {"java", "pig", "cow", "computer", "chungus", "seven", "chicken", "sandwich", "leather", "johnson"};
				
				String[] scrambledWords = {"vaja", "ipg", "ocw", "utmpcoer", "nghucus", "vesen", "ckhicen", "windsach", "thealer", "nsohjon"};
				
				for (int i = 0; i < words.length; i ++) {
					
					String inputZero = textField_4.getText();				
					
					textField_8.setText(scrambledWords[i]);
					
					if (inputZero.equalsIgnoreCase(words[i])) {
						
						textField_5.setText("That's correct! ");
						
						score ++;
						
						gameCounter ++;
												
						String inputOne = textField_4.getText();
											
						textField_8.setText(scrambledWords[i + 1]);
						
					} else {
						
						
							
							textField_5.setText("That's incorrect... Try again. ");
							
							inputZero = textField_4.getText();
												
							gameCounter ++;
							
						
						
					}
					
				}
																								
/*				if (!inputZero.equalsIgnoreCase("Java")) {
										
					textField_5.setText("That's incorrect... Try again. ");

					textField_4.setText("");
					
					inputZero = textField_4.getText();
										
					gameCounter ++;
														
				}
				
				if (inputZero.equalsIgnoreCase("Java")) {
					
					textField_5.setText("That's correct! ");
					
					score ++;
					
					gameCounter ++;
					
					textField_4.setText("");
					
					String inputOne = textField_4.getText();
										
					textField_8.setText("ipg");
					
					if (!inputOne.equalsIgnoreCase("Pig")) {
						
						textField_5.setText("That's incorrect... Try again. ");

						textField_4.setText("");
						
						inputOne = textField_4.getText();
											
						gameCounter ++;
						
					}
					
					if (inputOne.equalsIgnoreCase("Pig")) {
						
						textField_5.setText("That's correct! ");
						
						score ++;
						
						gameCounter ++;
						
						String inputTwo = textField_4.getText();
												
						textField_8.setText("ocw");
						
						if (!inputTwo.equalsIgnoreCase("Cow")) {
							
							textField_5.setText("That's incorrect... Try again. ");

							textField_4.setText("");
							
							inputTwo = textField_4.getText();
												
							gameCounter ++;
							
						}
						
						if (inputTwo.equalsIgnoreCase("Cow")) {
							
							textField_5.setText("That's correct! ");
							
							score ++;
							
							gameCounter ++;
							
							String inputThree = textField_4.getText();
													
							textField_8.setText("utmpcoer");
							
							if (!inputThree.equalsIgnoreCase("Computer")) {
								
								textField_5.setText("That's incorrect... Try again. ");

								textField_4.setText("");
								
								inputThree = textField_4.getText();
													
								gameCounter ++;
								
							}
							
							if (inputThree.equalsIgnoreCase("Computer")) {
								
								textField_5.setText("That's correct! ");
								
								score ++;
								
								gameCounter ++;
								
								String inputFour = textField_4.getText();
														
								textField_8.setText("nghucus");
								
								if (!inputFour.equalsIgnoreCase("Chungus")) {
									
									textField_5.setText("That's incorrect... Try again. ");

									textField_4.setText("");
									
									inputFour = textField_4.getText();
														
									gameCounter ++;
									
								}
								
								if (inputFour.equalsIgnoreCase("Chungus")) {
									
									textField_5.setText("That's correct! ");
									
									score ++;
									
									gameCounter ++;
									
									String inputFive = textField_4.getText();
															
									textField_8.setText("vesen");
									
									if (!inputFive.equalsIgnoreCase("Seven")) {
										
										textField_5.setText("That's incorrect... Try again. ");

										textField_4.setText("");
										
										inputFive = textField_4.getText();
															
										gameCounter ++;
										
									}
									
									if (inputFive.equalsIgnoreCase("Seven")) {
										
										textField_5.setText("That's correct! ");
										
										score ++;
										
										gameCounter ++;
										
										String inputSix = textField_4.getText();
																
										textField_8.setText("ckhicen");
										
										if (!inputSix.equalsIgnoreCase("Chicken")) {
											
											textField_5.setText("That's incorrect... Try again. ");

											textField_4.setText("");
											
											inputSix = textField_4.getText();
																
											gameCounter ++;
											
										}
										
										if (inputSix.equalsIgnoreCase("Chicken")) {
											
											textField_5.setText("That's correct! ");
											
											score ++;
											
											gameCounter ++;
											
											String inputSeven = textField_4.getText();
																	
											textField_8.setText("windsach");
											
											if (!inputSeven.equalsIgnoreCase("Sandwich")) {
												
												textField_5.setText("That's incorrect... Try again. ");

												textField_4.setText("");
												
												inputSeven = textField_4.getText();
																	
												gameCounter ++;
												
											}
											
											if (inputSeven.equalsIgnoreCase("Sandwich")) {
												
												textField_5.setText("That's correct! ");
												
												score ++;
												
												gameCounter ++;
												
												String inputEight = textField_4.getText();
																		
												textField_8.setText("thealer");
												
												if (!inputEight.equalsIgnoreCase("Leather")) {
													
													textField_5.setText("That's incorrect... Try again. ");

													textField_4.setText("");
													
													inputEight = textField_4.getText();
																		
													gameCounter ++;
													
												}
												
												if (inputEight.equalsIgnoreCase("Leather")) {
													
													textField_5.setText("That's correct! ");
													
													score ++;
													
													gameCounter ++;
													
													String inputNine = textField_4.getText();
																			
													textField_8.setText("nsohjon");
													
													if (!inputNine.equalsIgnoreCase("Johnson")) {
														
														textField_5.setText("That's incorrect... Try again. ");

														textField_4.setText("");
														
														inputNine = textField_4.getText();
																			
														gameCounter ++;
														
													}
													
													if (inputNine.equalsIgnoreCase("Johnson")) {
														
														score ++;
														
														gameCounter ++;
														
														textField_5.setText("That's correct! You got " + score + " correct, but it took you " + gameCounter + " attempts. ");
														
													}
													
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
*/			}
			
		});
						
		btnNewButton_3.addActionListener(
				
				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						
						int color = (int) (Math.random() * 5);
						
						if (color == 0) {
							
							contentPane.setBackground(new Color(204, 0, 102));
							
							txtRockPaperScissors.setBackground(new Color(51, 255, 255));
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));
							
							btnNewButton_3.setBackground(new Color(51, 204, 102));
							
							textField_8.setBackground(new Color(0, 102, 102));
						
						} else if (color == 1) {
							
							contentPane.setBackground(new Color(204, 102, 153));

							txtRockPaperScissors.setBackground(new Color(0, 102, 102));
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));

							btnNewButton_3.setBackground(new Color(0, 153, 153));
							
							textField_8.setBackground(new Color(153, 102, 102));

						} else if (color == 2) { 
							
							contentPane.setBackground(new Color(153, 102, 102));
							
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));
							txtRockPaperScissors.setBackground(new Color(102, 204, 255));
	
							btnNewButton_3.setBackground(new Color(255, 102, 0));
							
							textField_8.setBackground(new Color(0, 102, 153));
							
						} else if (color == 3) {
							
							contentPane.setBackground(new Color(0, 102, 153));
							
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));
							txtRockPaperScissors.setBackground(new Color(204, 255, 0));
	
							btnNewButton_3.setBackground(new Color(51, 255, 255));
							
							textField_8.setBackground(new Color(0, 51, 204));

						} else {
							
							contentPane.setBackground(new Color(0, 51, 204));
							
							txtRockPaperScissors.setForeground(new Color(0, 0, 0));
							txtRockPaperScissors.setBackground(new Color(204, 102, 0));
	
							btnNewButton_3.setBackground(new Color(204, 0, 0));
							
							textField_8.setBackground(new Color(204, 255, 0));

						}
						
					}
					
					
				}
		);
		
//		String scrambledWordZero = WordScramble.wordScramble(Arrays.toString(words[0]));
		
	}
}
