package cursojava.classes;

public class Direto extends Pessoa{
	
	int registroGeral;
	int tempoDirecao;
	String titulocao;
	
	
	public int getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(int registroGeral) {
		this.registroGeral = registroGeral;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulocao() {
		return titulocao;
	}
	public void setTitulocao(String titulocao) {
		this.titulocao = titulocao;
	}
	
	
	@Override
	public String toString() {
		return "Direto [registroGeral=" + registroGeral + ", tempoDirecao=" + tempoDirecao + ", titulocao=" + titulocao
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", numeroCpf="
				+ numeroCpf + "]";
	}
	
	
	
	
	

}
