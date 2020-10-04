import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isOperatorClicked=false;
	String oldValue;
	String operatorValue;
	String backvalue=null;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minButton;
	JButton plusButton;
	JButton clearButton;
	JButton percButton;
	JButton backButton;
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(545, 550);
		jf.setLocation(400,100);
		jf.getContentPane().setBackground(Color.black);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 10, 480, 90);
		displayLabel.setBackground(Color.black);
		displayLabel.setFont(displayLabel.getFont().deriveFont(64.0f));
		displayLabel.setOpaque(true);
		
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 120, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sevenButton.setForeground(Color.white);
		sevenButton.setBorderPainted(false);
		sevenButton.setContentAreaFilled(false);
		sevenButton.setFocusPainted(false);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 120, 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
		eightButton.setBorderPainted(false);
		eightButton.setContentAreaFilled(false);
		eightButton.setFocusPainted(false);
		eightButton.setForeground(Color.white);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setForeground(Color.white);
		nineButton.setContentAreaFilled(false);
		nineButton.setFocusPainted(false);
		nineButton.setBorderPainted(false);
		nineButton.setBounds(230, 120, 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 220, 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fourButton.setBorderPainted(false);
		fourButton.setContentAreaFilled(false);
		fourButton.setFocusPainted(false);
		fourButton.setForeground(Color.white);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 220, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fiveButton.setBorderPainted(false);
		fiveButton.setContentAreaFilled(false);
		fiveButton.setFocusPainted(false);
		fiveButton.setForeground(Color.white);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 220, 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sixButton.setBorderPainted(false);
		sixButton.setContentAreaFilled(false);
		sixButton.setFocusPainted(false);
		sixButton.setForeground(Color.white);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 320, 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		oneButton.setBorderPainted(false);
		oneButton.setContentAreaFilled(false);
		oneButton.setFocusPainted(false);
		oneButton.setForeground(Color.white);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 320, 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		twoButton.setBorderPainted(false);
		twoButton.setContentAreaFilled(false);
		twoButton.setFocusPainted(false);
		twoButton.setForeground(Color.white);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 320, 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		threeButton.setBorderPainted(false);
		threeButton.setContentAreaFilled(false);
		threeButton.setFocusPainted(false);
		threeButton.setForeground(Color.white);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 420, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotButton.setBorderPainted(false);
		dotButton.setContentAreaFilled(false);
		dotButton.setFocusPainted(false);
		dotButton.setForeground(Color.white);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 420, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		zeroButton.setBorderPainted(false);
		zeroButton.setContentAreaFilled(false);
		zeroButton.setFocusPainted(false);
		zeroButton.setForeground(Color.white);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 420, 180, 80);
	    equalButton.setFont(new Font("Arial", Font.PLAIN, 100));
	    equalButton.setBorderPainted(false);
		equalButton.setContentAreaFilled(false);
		equalButton.setFocusPainted(false);
		equalButton.setForeground(Color.cyan);
	    equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(430, 120, 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 60));
		divButton.setBorderPainted(false);
		divButton.setContentAreaFilled(false);
		divButton.setFocusPainted(false);
		divButton.setForeground(Color.cyan);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(430, 220, 80, 80);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 60));
		mulButton.setBorderPainted(false);
		mulButton.setContentAreaFilled(false);
		mulButton.setFocusPainted(false);
		mulButton.setForeground(Color.cyan);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minButton=new JButton("-");
		minButton.setBounds(430, 320, 80, 80);
		minButton.setFont(new Font("Arial", Font.PLAIN, 60));
		minButton.setBorderPainted(false);
		minButton.setContentAreaFilled(false);
		minButton.setFocusPainted(false);
		minButton.setForeground(Color.cyan);
		minButton.addActionListener(this);
		jf.add(minButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(430, 420, 80, 80);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 60));
		plusButton.setBorderPainted(false);
		plusButton.setContentAreaFilled(false);
		plusButton.setFocusPainted(false);
		plusButton.setForeground(Color.cyan);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(330, 320, 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
		clearButton.setBorderPainted(false);
		clearButton.setContentAreaFilled(false);
		clearButton.setFocusPainted(false);
		clearButton.setForeground(Color.cyan);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		percButton=new JButton("%");
		percButton.setBounds(330, 220, 80, 80);
		percButton.setFont(new Font("Arial", Font.PLAIN, 40));
		percButton.setBorderPainted(false);
		percButton.setContentAreaFilled(false);
		percButton.setFocusPainted(false);
		percButton.setForeground(Color.cyan);
		percButton.addActionListener(this);
		jf.add(percButton);
		
		backButton=new JButton("<<");
		backButton.setBounds(330, 120, 80, 80);
		backButton.setFont(new Font("Arial", Font.PLAIN, 40));
		backButton.setBorderPainted(false);
		backButton.setContentAreaFilled(false);
		backButton.setFocusPainted(false);
		backButton.setForeground(Color.cyan);
		backButton.addActionListener(this);
		jf.add(backButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] e) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}			
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource()==dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}else if(e.getSource()==equalButton) {
			String newValue=displayLabel.getText();
			
			float oldvalueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			switch(operatorValue) {
			case "+": float sum=oldvalueF+newValueF;
					displayLabel.setText(sum+"");
					break;
			case "-": float diff=oldvalueF-newValueF;
					displayLabel.setText(diff+"");
					break;
			case "x": float mulvalue=oldvalueF*newValueF;
					displayLabel.setText(mulvalue+"");
					break;
			case "/": float divvalue=oldvalueF/newValueF;
					displayLabel.setText(divvalue+"");
					break;
			case "%": float percentage=oldvalueF%newValueF;
					displayLabel.setText(percentage+"");
					break;
			}
			
		}else if(e.getSource()==divButton) {
			operatorValue="/";
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==mulButton) {
			operatorValue="x";
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==minButton) {
			operatorValue="-";
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==plusButton) {
			operatorValue="+";
				isOperatorClicked=true;
				oldValue=displayLabel.getText();
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}else if(e.getSource()==percButton) {
			operatorValue="%";
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==backButton) {
			
			if(displayLabel.getText().length()>0) {
			 StringBuilder str=new StringBuilder(displayLabel.getText());
			 str.deleteCharAt(displayLabel.getText().length()-1);
			 backvalue=str.toString();
			 displayLabel.setText(backvalue);
			}
		}
	}
}
