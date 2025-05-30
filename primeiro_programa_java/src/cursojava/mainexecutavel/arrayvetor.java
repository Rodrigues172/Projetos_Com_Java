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

		double[] notas = { 7, 8, 9, 10};
		double[] notas1 = { 7.9, 8.4, 9.9, 4.5};

		Aluno aluno = new Aluno();
		aluno.setNome("Davi Rodrigues");
		aluno.setNomeEscola("Davienteprass");

		//Materia 1
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Javinha que mais AMO");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);
		
		//Materia 2
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica programacao");
		disciplina2.setNota(notas1);
		aluno.getDisciplinas().add(disciplina2);


		System.out.println("Nome do aluno: " + aluno.getNome() + " Nome Do Curso: " + disciplina.getDisciplina());

		for (Disciplina d : aluno.getDisciplinas()) {
			double notaMin = 0.0;
			double notaMax = 0.0;
			System.out.println("----------------------Disciplina do aluno------------------------");
			System.out.println("Nome Da Disciplina: " + d.getDisciplina());
			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) + " e igual: " + d.getNota()[pos]);
				
				if (pos == 0) {
				    notaMax = d.getNota()[pos];
				    notaMin = d.getNota()[pos]; // geralmente inicializa os dois aqui
				} else {
				    if (d.getNota()[pos] > notaMax) {
				        notaMax = d.getNota()[pos];
				    }
				    if (d.getNota()[pos] < notaMin) {
				        notaMin = d.getNota()[pos];
				    }
				}

				
			}
			System.out.println("A media Da Notas: " + disciplina.getMediaNota());
			System.out.println("Maior Nota da Disciplina " + d.getDisciplina() + " e de valor: " + notaMax);
			System.out.println("Menor Nota da Disciplina " + d.getDisciplina() + " e de valor: " + notaMin);
			System.out.println("------------------------------------------------------------------");
		}

	}

}
