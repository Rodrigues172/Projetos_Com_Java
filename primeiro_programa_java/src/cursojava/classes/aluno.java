/* SET e para adicionar ou receber dados para os atributos se fosse grava o
valor na quela variavelel
GET e para resgatar ou obter o valor do atributo se fosse ver o valor com return
essas variaveis ou na classe como poo se chama de atributos*/

package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class aluno extends Pessoa {

	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	double MetiaNota;

	
	disciplina disciplina1 = new disciplina();
	
	
	public String getDisciplinas1() {
	    StringBuilder resultado = new StringBuilder();

	    for (disciplina disciplina1 : disciplinas) {
	        resultado.append(disciplina1.getDisciplina()).append("\n");
	    }

	    return resultado.toString();
	}


	public double getMetiaNota() {

		double somanotas = 0.0;

		for (disciplina disciplina : disciplinas) {
			somanotas += disciplina.getNota();
		}

		return somanotas / disciplinas.size();
	}

	public void setMetiaNota(double metiaNota) {
		this.MetiaNota = metiaNota;
	}

	List<disciplina> disciplinas = new ArrayList<disciplina>();

	public List<disciplina> getDisciplinas() {
		return disciplinas;
	}

	
	/* Recebe dados */
	public void setNume(String nome) {
		this.nome = nome;
	}

	/* Mostrando os dados */
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

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

	public void setNome(String nome) {
		this.nome = nome;
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
		aluno other = (aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

}
