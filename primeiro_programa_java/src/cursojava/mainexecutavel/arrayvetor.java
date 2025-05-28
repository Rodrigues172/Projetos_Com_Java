package cursojava.mainexecutavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class arrayvetor {
	public static void main(String[] args) {

		/*
		 * double media = 0; int pos =
		 * Integer.parseInt(JOptionPane.showInputDialog(null,
		 * "quantas notas que mazenar?"));
		 * 
		 * double[] notas = new double[pos];
		 * 
		 * for (int i = 0; i < pos; i++) {
		 * 
		 * notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
		 * "Digite a nota " + (i + 1) + " : "));
		 * 
		 * }
		 * 
		 * for (int i = 0; i < notas.length; i++) { System.out.println("Nota " + (i + 1)
		 * + " e = " + notas[i]);
		 * 
		 * media += notas[i];
		 * 
		 * }
		 * 
		 * System.out.println("a media das notas sao : " + ( media / pos)); }
		 */

		Aluno aluno = new Aluno();
		aluno.setNome("Davi Rodrigues");
		aluno.setNomeEscola("Davienteprass");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Javinha que mais AMO");
		double[] notas = { 7, 8, 9, 10 };
		disciplina.setNota(notas);

		System.out.println(disciplina.getMediaNota());

	}

}
