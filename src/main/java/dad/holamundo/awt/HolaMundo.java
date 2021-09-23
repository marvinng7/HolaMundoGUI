package dad.holamundo.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HolaMundo {

	public static void main(String[] ar) {
		
		//creamos etiqueta para mostrar el saludo
		Label saludoLabel= new Label();
		saludoLabel.setText("Aqui saldrá el saludo");
		saludoLabel.setBounds(20,20,120,50); //x,y,ancho,alto
		
		//creamos el botón para saludar
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20,80,120,30);
		//Establecemos un listener para la pulsación del botón
		saludarButton.addActionListener(e -> saludoLabel.setText("Hola mundo")); //mostramos el saludo en la etiqueta
		
		
		//Poner un evento al botón
		
		
		//panel (contenedor) que contiene la etiqueta y el botón
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		//ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo");
		frame.setSize(320,200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		
	}
}
