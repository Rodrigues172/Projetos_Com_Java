package executavel_java;

import javax.swing.JOptionPane;

public class PrimeiroClasseJava {	
	
	/*Main e um metodo auto excutavel*/
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Imforme a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Imforme a quantidade de carros?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoasNumero); 
		
		double resto = carroNumero % pessoasNumero;
		
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao + " carros e sobrou " + resto + " Carros");
	}
}
