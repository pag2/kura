import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ansfield;

	/**
	 * Launch the application.
	 */
	
	
	double temp, temp1, result, a;
	static double m1, m2;
	int k = 1, x = 0, y = 0, z = 0;
	char ch;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("Scientific Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
				}
				else
				{
					a= Math.cos(Double.parseDouble(ansfield.getText()));
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ a);

				}
				
			}
		});
		btnCos.setBounds(81, 162, 61, 34);
		contentPane.add(btnCos);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
				}
				else
				{
					a= Math.sin(Double.parseDouble(ansfield.getText()));
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ a);

				}
				
				
			}
		});
		btnSin.setBounds(10, 162, 61, 34);
		contentPane.add(btnSin);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
				}
				else
				{
					a= Math.tan(Double.parseDouble(ansfield.getText()));
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ a);

				}
				
			}
		});
		btnTan.setBounds(152, 162, 61, 34);
		contentPane.add(btnTan);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "0");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "0");
					z=0;
				}
			}
		});
		btn0.setBounds(81, 343, 61, 40);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "1");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "1");
					z=0;
				}
				
			}
		});
		btn1.setBounds(10, 298, 61, 34);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "2");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "2");
					z=0;
				}
			}
		});
		btn2.setBounds(81, 298, 61, 34);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "3");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "3");
					z=0;
				}
			}
		});
		btn3.setBounds(152, 298, 61, 34);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "4");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "4");
					z=0;
				}
			}
		});
		btn4.setBounds(10, 252, 61, 34);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "5");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "5");
					z=0;
				}
			}
		});
		btn5.setBounds(81, 252, 61, 34);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "6");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "6");
					z=0;
				}
			}
		});
		btn6.setBounds(152, 252, 61, 34);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "7");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "7");
					z=0;
				}
			}
		});
		btn7.setBounds(10, 207, 61, 34);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "8");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "8");
					z=0;
				}
			}
		});
		btn8.setBounds(81, 207, 61, 34);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(z==0) {
					ansfield.setText(ansfield.getText() + "9");
				}
				else
				{
					ansfield.setText("");
					ansfield.setText(ansfield.getText() + "9");
					z=0;
				}
			}
		});
		btn9.setBounds(152, 207, 61, 34);
		contentPane.add(btn9);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ansfield.getText().equals("")) {
					ansfield.setText("");
					temp = 0;
					ch = '+';
				} else {
					temp = Double.parseDouble(ansfield.getText());
					ansfield.setText("");
					ch = '+';
					y = 0;
					x = 0;
				}
				ansfield.requestFocus();
			}
		});
		btnAdd.setBounds(221, 345, 59, 37);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ansfield.getText().equals("")) {
					ansfield.setText("");
					temp = 0;
					ch = '-';
				} else {
					temp = Double.parseDouble(ansfield.getText());
					ansfield.setText("");
					ch = '-';
					y = 0;
					x = 0;
				}
				ansfield.requestFocus();

			}
		});
		btnSub.setBounds(221, 298, 61, 34);
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (ansfield.getText().equals("")) {
					ansfield.setText("");
					temp = 0;
					ch = '*';
				} else {
					temp = Double.parseDouble(ansfield.getText());
					ansfield.setText("");
					ch = '*';
					y = 0;
					x = 0;
				}
				ansfield.requestFocus();

			}
		});
		btnMul.setBounds(221, 252, 61, 34);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ansfield.getText().equals("")) {
					ansfield.setText("");
					temp = 0;
					ch = '/';
				} else {
					temp = Double.parseDouble(ansfield.getText());
					ansfield.setText("");
					ch = '/';
					y = 0;
					x = 0;
				}
				ansfield.requestFocus();

			}
		});
		btnDiv.setBounds(223, 207, 59, 34);
		contentPane.add(btnDiv);
		
		JButton bntEqual = new JButton("=");
		bntEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
									}
				else
				{
					temp1 = Double.parseDouble(ansfield.getText());
					switch(ch) {
					case '+':
						result = temp+temp1;
						break;
					case '-':
						result = temp-temp1;
						break;
					case '*':
						result = temp*temp1;
						break;
					case '/':
						result = temp/temp1;
						break;
					}
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ result);
					z=1;
				}
				
				
				
			}
		});
		bntEqual.setBounds(152, 346, 61, 34);
		contentPane.add(bntEqual);
		
		ansfield = new JTextField();
		ansfield.setToolTipText("0");
		ansfield.setHorizontalAlignment(SwingConstants.RIGHT);
		ansfield.setBounds(10, 11, 274, 50);
		ansfield.addKeyListener(new KeyAdapter() {
			public void keyTped(KeyEvent keyevent) {
				
				char c = keyevent.getKeyChar();
				if(c>='0' && c<='9') {
				
			}else {
				keyevent.consume();
				}
			}
		});
		contentPane.add(ansfield);
		ansfield.setColumns(10);
		
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
				}
				else
				{
					a= Math.sqrt(Double.parseDouble(ansfield.getText()));
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ a);

				}
				
			}
		});
		btnSqrt.setBounds(223, 162, 61, 34);
		contentPane.add(btnSqrt);
		
		JButton btnMc = new JButton("MC");
		btnMc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m1 =0;
				ansfield.setText("");
			}
		});
		btnMc.setBounds(10, 72, 61, 34);
		contentPane.add(btnMc);
		
		JButton btnMR = new JButton("MR");
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ansfield.setText("");
				ansfield.setText(ansfield.getText() + m1);
			}
		});
		btnMR.setBounds(81, 72, 61, 34);
		contentPane.add(btnMR);
		
		JButton btnMinc = new JButton("M+");
		btnMinc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (k == 1) {
					m1 = Double.parseDouble(ansfield.getText());
					k++;
				} else {
					m1 += Double.parseDouble(ansfield.getText());
					ansfield.setText("" + m1);
				}
				
			}
		});
		btnMinc.setBounds(152, 72, 59, 34);
		contentPane.add(btnMinc);
		
		JButton btnMdec = new JButton("M-");
		btnMdec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (k == 1) {
					m1 = Double.parseDouble(ansfield.getText());
					k++;
				} else {
					m1 -= Double.parseDouble(ansfield.getText());
					ansfield.setText("" + m1);
				}
				
			}
		});
		btnMdec.setBounds(221, 72, 61, 34);
		contentPane.add(btnMdec);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
				}
				else
				{
					a= Math.log(Double.parseDouble(ansfield.getText()));
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ a);

				}
			}
		});
		btnLog.setBounds(10, 117, 61, 34);
		contentPane.add(btnLog);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
				}
				else
				{
					a= 1/ Double.parseDouble(ansfield.getText());
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ a);

				}
			}
		});
		btnx.setBounds(221, 117, 61, 34);
		contentPane.add(btnx);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
				}
				else
				{
					a= Math.pow(Double.parseDouble(ansfield.getText()),2);
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ a);

				}
			}
		});
		btnX.setBounds(81, 117, 61, 34);
		contentPane.add(btnX);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ansfield.getText().equals("")) {
					ansfield.setText("");
				}
				else
				{
					a= Math.pow(Double.parseDouble(ansfield.getText()),3);
					ansfield.setText("");
					ansfield.setText(ansfield.getText()+ a);

				}
			}
		});
		btnX_1.setBounds(152, 117, 61, 34);
		contentPane.add(btnX_1);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String s = e.getActionCommand();
		if(s.equals("1")) {
			if(z==0) {
				ansfield.setText(ansfield.getText() + "1");
			}
			else
			{
				ansfield.setText("");
				ansfield.setText(ansfield.getText() + "1");
				z=0;
			}
		}
		
	}
	
	
}
