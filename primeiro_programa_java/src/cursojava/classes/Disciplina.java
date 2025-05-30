package cursojava.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ForkJoinPool;

public class Disciplina {

	/* Essa classe Disciplina servira para todos os objetos de notas e materias */
	private String nomedisciplina;
	private double[] notas;
	
	public Disciplina(String nome, double[] notas) {
		this.notas = notas;
		this.nomedisciplina = nome;
	}

	public String getNomedisciplina() {
		return nomedisciplina;
	}

	public double[] getNotas() {
		return notas;
	}

	public double getMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

}
