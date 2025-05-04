package executavel_java;

import javax.swing.JOptionPane;

public class PrimeiroClasseJava {

	/* Main e um metodo auto excutavel */
	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = ((dNota1 + dNota2 + dNota3 + dNota4) / 4);

		if (media >= 50) {
			if (media >= 90) {
				JOptionPane.showMessageDialog(null, "Parabens voce foi aprovado com acima de media: " + media);
			} else if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Parabens voce foi aprovado com a media: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Ha nao voce esta de recuperacao com a media: " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Voce foi reprovado com media abaixo de 50 sua media foi: " + media);
		}

	}
}
