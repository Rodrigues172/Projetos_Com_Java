package cursojava.mainexecutavel;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;

public class arrayvetor2 {

	public static void main(String[] args) {

		ArrayList<Disciplina> disciplinas = new ArrayList<>();

		int tamanha = Integer.parseInt(JOptionPane.showInputDialog("Quantas disciplinas Quer Adicionar"));

		for (int i = 0; i < tamanha; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina");
			double[] notas = new double[4];
			for (int j = 0; j < 4; j++) {
				notas[j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota " + (j + 1) + ": "));
			}
			disciplinas.add(new Disciplina(nomeDisciplina, notas));
		}

		StringBuilder resultado = new StringBuilder("Resultado:\n");

		for (Disciplina d : disciplinas) {
			resultado.append("\nDisciplina: ").append(d.getNomedisciplina()).append(" - media: ")
					.append(d.getMedia()).append("\n");
			double[] notas = d.getNotas();
			for (int i = 0; i < notas.length; i++) {
				resultado.append("Nota ").append(i + 1).append(" : ").append(notas[i]).append("\n");
			}
			resultado.append("\n");
		}

		System.out.println(resultado.toString());

	}
}
