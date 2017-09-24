// Exercício 14.10: Calculator.java
// Cria a seguinte GUI (Calculadora). Você não precisa fornecer funcionalidades.
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Calculator extends JFrame {

	private JTextField textField1; // cria barra em branco
	private JButton buttons[] = new JButton[16];
	private String buttons1[] = {"7", "8", "9", "/",
								 "4", "5", "6", "*",
								 "1", "2", "3", "-",
								 "0", ".", "=", "+"};
	private JPanel buttonsPanel;
	
	private BorderLayout layout;
	private GridLayout gridLayout;

	public Calculator(){
		super("Calculator");
		textField1 = new JTextField(25);
		textField1.setLayout(new GridLayout(5, 5));
		add(textField1, BorderLayout.NORTH);
		
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(4, buttons.length, 5, 5));
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(buttons1[i]);
			buttonsPanel.add(buttons[i]);
		}
		add(buttonsPanel, BorderLayout.CENTER);
	} // fim do construtor Calculator
} // fim da classe Calculator