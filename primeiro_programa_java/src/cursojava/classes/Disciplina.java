package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ForkJoinPool;

public class Disciplina {

	/* Essa classe Disciplina servira para todos os objetos de notas e materias */
	private double[] nota = new double[4];
	String disciplina;

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getMediaNota() {
		double somaTotal = 0;
		for (int i = 0; i < nota.length; i++) {
			somaTotal += nota[i];
		}

		return somaTotal / 4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}

}
