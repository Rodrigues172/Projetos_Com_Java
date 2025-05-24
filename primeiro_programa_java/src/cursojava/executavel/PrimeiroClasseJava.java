package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretaria;
import cursojava.classesauxiliares.Funcaoautenticacao;
import cursojava.interfaces.PermitirAcasso;

public class PrimeiroClasseJava {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("informe o login");
		String senha = JOptionPane.showInputDialog("informe o senha");

		if (new Funcaoautenticacao(new Secretaria(login, senha)).autenticar( )) {

			Aluno carinha = new Aluno();
			carinha.setNome("Davi Rodrigues");
			carinha.setNumeroCpf("50314842845");

			for (int i = 1; i < 5; i++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + i + ": ");
				String notaDisciplina = JOptionPane.showInputDialog("Qual e Valor da Nota " + i + ": ");
				Disciplina Disciplina = new Disciplina();
				Disciplina.setDisciplina(nomeDisciplina);
				Disciplina.setNota(Double.valueOf(notaDisciplina));

				carinha.getDisciplinas().add(Disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja Excluir alguma disciplina?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3, ou 4?");
					carinha.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover a Materia?");
				}
			}

			System.out.println(carinha.getDisciplinas1());
			System.out.println(carinha.getMetiaNota());

		} else {

			JOptionPane.showInternalMessageDialog(null, "acesso negado");

		}

	}

}
