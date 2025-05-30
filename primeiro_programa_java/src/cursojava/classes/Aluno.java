/* SET e para adicionar ou receber dados para os atributos se fosse grava o
valor na quela variavelel
GET e para resgatar ou obter o valor do atributo se fosse ver o valor com return
essas variaveis ou na classe como poo se chama de atributos*/

package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {

	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	double MetiaNota;

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	Disciplina disciplina1 = new Disciplina();

	public String getDisciplinas1() {
		StringBuilder resultado = new StringBuilder();

		for (Disciplina disciplina1 : disciplinas) {
			resultado.append(disciplina1.getDisciplina()).append("\n");
		}

		return resultado.toString();
	}

	public double getMetiaNota() {

		double somanotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somanotas += disciplina.getMediaNota();
		}

		return somanotas / disciplinas.size();
	}

	public void setMetiaNota(double metiaNota) {
		this.MetiaNota = metiaNota;
	}

	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

}
