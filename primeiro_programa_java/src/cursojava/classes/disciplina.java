package cursojava.classes;

import java.util.Objects;
import java.util.concurrent.ForkJoinPool;

public class disciplina {

	
	/*Essa classe Disciplina servira para todos os objetos de notas e materias */
	double nota;
	String disciplina;

	
	
	
	
	
	
	
	
	
	
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		disciplina other = (disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	@Override
	public String toString() {
		return "disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
