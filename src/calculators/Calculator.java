package calculators;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Calculator {

	private JFrame frmCalculator;
	private JTextField txtDisplay;
	//private JTextDisplay txtDisplay;
	
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setFont(new Font("Lucida Sans", Font.BOLD, 30));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 280, 398);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(4, 11, 250, 39);
		frmCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		
				
		//..........................................Row1...................................................
		JButton btnClr = new JButton("C");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClr.setBounds(6, 59, 60, 50);
		frmCalculator.getContentPane().add(btnClr);
		
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(txtDisplay.getText().length()>0){
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(70, 59, 60, 50);
		frmCalculator.getContentPane().add(btnBack);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";

			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMod.setBounds(134, 59, 60, 50);
		frmCalculator.getContentPane().add(btnMod);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(198, 59, 60, 50);
		frmCalculator.getContentPane().add(btnPlus);
		

		
		//..........................................Row2...................................................
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
					
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(6, 118, 60, 50);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(69, 117, 60, 50);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(134, 117, 60, 50);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";

			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(198, 118, 60, 50);
		frmCalculator.getContentPane().add(btnSub);
		
		//............................................Row3..........................
 
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(6, 177, 60, 50);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(69, 177, 60, 50);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(134, 177, 60, 50);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";

			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(199, 177, 60, 50);
		frmCalculator.getContentPane().add(btnMul);
		
		
		//...............................................Row4..........................
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(6, 236, 60, 50);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(69, 236, 60, 50);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(134, 236, 60, 50);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";

			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(199, 236, 60, 50);
		frmCalculator.getContentPane().add(btnDiv);
		
		
		
		//...............................................Row5..........................
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterNumber);

				
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(6, 295, 60, 50);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btnZero.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnZero.setBounds(69, 295, 60, 50);
		frmCalculator.getContentPane().add(btnZero);
		
		JButton btnPN = new JButton("\u00B1");
		btnPN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnPN.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPN.setBounds(131, 295, 69, 50);
		frmCalculator.getContentPane().add(btnPN);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);

				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);

				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);

				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);

				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(201, 295, 60, 50);
		frmCalculator.getContentPane().add(btnEqual);
 
 
 		

	}

		
}
