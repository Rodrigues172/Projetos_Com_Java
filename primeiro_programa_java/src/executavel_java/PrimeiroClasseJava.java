package executavel_java;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import cursojava.classes.aluno;
import cursojava.classes.disciplina;

public class PrimeiroClasseJava {

	/* Main e um metodo auto excutavel */
	public static void main(String[] args) {

		aluno aluno1 = new aluno();
		aluno1.setNume("Davi");
		aluno1.setNumeroCpf("50314842845");
		

		for (int i = 1; i < 5; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + i + ": ");
			String notaDisciplina = JOptionPane.showInputDialog("Qual e Valor da Nota " + i + ": ");
			disciplina Disciplina = new disciplina();
			Disciplina.setDisciplina(nomeDisciplina);
			Disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(Disciplina);

		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja Excluir alguma disciplina?");

		if (escolha == 0) {

			int continuarRemover = 0;
			int posicao = 1; 

			while (continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3, ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover a Materia?");
			}
		}

		System.out.println(aluno1.getDisciplinas1());
		System.out.println(aluno1.getMetiaNota());

	}

}
