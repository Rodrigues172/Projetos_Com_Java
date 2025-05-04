package executavel_java;

import javax.swing.JOptionPane;

public class PrimeiroClasseJava {

	/* Main e um metodo auto excutavel */
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Imforme a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Imforme a quantidade de carros?");

		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoasNumero);

		double resto = carroNumero % pessoasNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao);

		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da conta?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisao e " + resto + " Carros");
		}

	}
}
