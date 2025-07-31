package provaLp20242;

import java.util.Objects;

public class Clientes {

	private String nomeCliente;
	private String email;
	private String pratoPreferido = "Prato preferido não definido";
	
	
	public Clientes(String nomeCliente, String email) {
		this.nomeCliente = nomeCliente;
		this.email = email;
	}

	public String getPratoPreferido() {
		return pratoPreferido;
	}
	
	public void setPratoPreferido(String prato) {
		this.pratoPreferido = prato;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(email, other.email);
	}
}
