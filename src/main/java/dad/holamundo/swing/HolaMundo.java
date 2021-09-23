package dad.holamundo.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundo {

	public static void main(String[] ar) {
		
		JLabel saludoLabel= new JLabel();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setBounds(20, 20, 120, 50);
		
		
		JButton saludarButton = new JButton();
		saludarButton.setText("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.setToolTipText("Como me pulses te saludo");
		saludarButton.addActionListener(e -> saludoLabel.setText("Hola Mundio"));
		
		
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Hola mundo con swing");
		frame.setSize(320,200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(rootPanel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
