package Exc19_04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculadora {

	private JFrame frame;
	private JTextField textDisplay;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnAdi;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnSub;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMult;
	private JButton btnPonto;
	private JButton btn0;
	private JButton btnDiv;
	private JButton btnRes;
	private JButton btnExclui;
	private JButton btnLimpa;
	private JButton btnPorc;
	
	// Para a entrada dos dois números e o resultado é necessário criar DOUBLE, pois os números podem vim com casas decimais
	double entrada1;
	double entrada2;
	double resultado;
	// Para a operação é necessário ser String
	String operacao;
	String fim;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break ;
					
				}
			}
		} catch (ClassNotFoundException ex){
			System.err.println(ex);
		} catch (InstantiationException ex) {
			System.err.println(ex);
		} catch (IllegalAccessException ex) {
			System.err.println(ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 265, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 24));
		textDisplay.setBounds(10, 11, 230, 48);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		// ----------- 1 Line ----------------
		btnExclui = new JButton("<");
		btnExclui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Aqui eu quase não entendi, mas da para ter uma noção
				String Exclui = null;
				
				if(textDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length() - 1);
					Exclui = strB.toString();
					textDisplay.setText(Exclui);
				}
			}
		});
		btnExclui.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExclui.setBounds(10, 69, 50, 50);
		frame.getContentPane().add(btnExclui);
		
		btnLimpa = new JButton("C");
		btnLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(null);
			}
		});
		btnLimpa.setBackground(new Color(255, 255, 0));
		btnLimpa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLimpa.setBounds(70, 69, 110, 50);
		frame.getContentPane().add(btnLimpa);
		
		btnPorc = new JButton("%");
		btnPorc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrada1 = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operacao = "%";
			}
		});
		btnPorc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPorc.setBounds(190, 69, 50, 50);
		frame.getContentPane().add(btnPorc);
		
		
		// ----------- 2 Line ----------------
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	// Pega a String de número 7 e joga dentro da caixa de texto
				String EntNum = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EntNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 130, 50, 50);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EntNum = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EntNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(70, 130, 50, 50);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EntNum = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EntNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(130, 130, 50, 50);
		frame.getContentPane().add(btn9);
		
		btnAdi = new JButton("+");
		btnAdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				// É necessário pegar o número digitado para guarda na primeira entrada e fazer junção a operação
				entrada1 = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operacao = "+";
			}
		});
		btnAdi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdi.setBounds(190, 130, 50, 50);
		frame.getContentPane().add(btnAdi);
		
		// ----------- 3 Line ----------------
				btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EntNum = textDisplay.getText() + btn4.getText();
						textDisplay.setText(EntNum);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 190, 50, 50);
				frame.getContentPane().add(btn4);
				
				btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EntNum = textDisplay.getText() + btn5.getText();
						textDisplay.setText(EntNum);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(70, 190, 50, 50);
				frame.getContentPane().add(btn5);
				
				btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EntNum = textDisplay.getText() + btn6.getText();
						textDisplay.setText(EntNum);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(130, 190, 50, 50);
				frame.getContentPane().add(btn6);
				
				btnSub = new JButton("-");
				btnSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						entrada1 = Double.parseDouble(textDisplay.getText());
						textDisplay.setText("");
						operacao = "-";
					}
				});
				btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSub.setBounds(190, 190, 50, 50);
				frame.getContentPane().add(btnSub);
				
				// ----------- 4 Line ----------------
				btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EntNum = textDisplay.getText() + btn1.getText();
						textDisplay.setText(EntNum);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 250, 50, 50);
				frame.getContentPane().add(btn1);
				
				btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EntNum = textDisplay.getText() + btn2.getText();
						textDisplay.setText(EntNum);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(70, 250, 50, 50);
				frame.getContentPane().add(btn2);
				
				btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EntNum = textDisplay.getText() + btn3.getText();
						textDisplay.setText(EntNum);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(130, 250, 50, 50);
				frame.getContentPane().add(btn3);
				
				btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						entrada1 = Double.parseDouble(textDisplay.getText());
						textDisplay.setText("");
						operacao = "*";
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(190, 250, 50, 50);
				frame.getContentPane().add(btnMult);
				
				// ----------- 5 Line ----------------
				btnPonto = new JButton(".");
				btnPonto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				btnPonto.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPonto.setBounds(10, 310, 50, 50);
				frame.getContentPane().add(btnPonto);
				
				btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EntNum = textDisplay.getText() + btn0.getText();
						textDisplay.setText(EntNum);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(70, 310, 50, 50);
				frame.getContentPane().add(btn0);
				
				btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						entrada1 = Double.parseDouble(textDisplay.getText());
						textDisplay.setText("");
						operacao = "/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDiv.setBounds(130, 310, 50, 50);
				frame.getContentPane().add(btnDiv);
				
				btnRes = new JButton("=");
				btnRes.setBackground(new Color(95, 158, 160));
				btnRes.setForeground(Color.BLACK);
				btnRes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String fim;
						entrada2 = Double.parseDouble(textDisplay.getText());
						if (operacao == "+") {
							resultado = entrada1 + entrada2;
							fim = String.format("%.2f", resultado);
							textDisplay.setText(fim);
						}
						else if (operacao == "-") {
							resultado = entrada1 - entrada2;
							fim = String.format("%.2f", resultado);
							textDisplay.setText(fim);
						}
						else if (operacao == "*") {
							resultado = entrada1 * entrada2;
							fim = String.format("%.2f", resultado);
							textDisplay.setText(fim);
						}
						else if (operacao == "/") {
							resultado = entrada1 / entrada2;
							fim = String.format("%.2f", resultado);
							textDisplay.setText(fim);
						}
						else if (operacao == "%") {
							resultado = entrada1 % entrada2;
							fim = String.format("%.2f", resultado);
							textDisplay.setText(fim);
						}
						
						
						
						
					}
				});
				btnRes.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnRes.setBounds(190, 310, 50, 50);
				frame.getContentPane().add(btnRes);
	}

}
