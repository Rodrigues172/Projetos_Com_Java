package executavel_java;
import java.util.Scanner;

public class PrimeiroClasseJava {	
	
	/*Main e um metodo auto excutavel*/
	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 80;
		int nota3 = 20;
		int nota4 = 30;
			
		System.out.println("A Soma dos numeros das natas sao : " + (nota1 + nota2 + nota3 + nota4 ));
		System.out.println("A Medias dos das notas sao : " + ((nota1 + nota2 + nota3 + nota4) / 4));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu Nome: ");
		String nome = sc.nextLine();
		
		System.err.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		
	    System.out.println("Ola " + nome + ", Voce tem " + idade + " anos");
		
		
		
	}
}
