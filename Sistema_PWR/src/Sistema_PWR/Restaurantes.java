package provaLp20242;

import java.util.HashSet;
import java.util.Objects;

public class Restaurantes {

	private String nome;
	private String prato;
	private int quantVotos;
	private HashSet<Clientes> clientesVisitaram = new HashSet<>();
	
	
	public Restaurantes(String nome, String prato) {
		this.nome = nome;
		this.prato =  prato;
	}
	
	public HashSet<Clientes> getClientesVisitaram() {
		return clientesVisitaram;
	}
	
	public void setClienteVisitaram(Clientes cliente) {
		clientesVisitaram.add(cliente);
	}
	
	public int retiraQuantVotos() {
		return this.quantVotos--;
	}
	
	public int getQuantVotos() {
		return quantVotos;
	}
	
	public void adicionaQuantVotos() {
		this.quantVotos++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getPrato() {
		return prato;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurantes other = (Restaurantes) obj;
		return Objects.equals(nome, other.nome);
	}
}
