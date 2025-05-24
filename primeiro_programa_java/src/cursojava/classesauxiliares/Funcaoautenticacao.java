package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcasso;

public class Funcaoautenticacao {

	private PermitirAcasso permitirAcasso;

	public boolean autenticarCursoJava() {
		return permitirAcasso.autenticar();
	}

	public Funcaoautenticacao(PermitirAcasso acesso) {
		this.permitirAcasso = acesso;
	}
}
