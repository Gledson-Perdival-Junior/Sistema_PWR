package Sistema_PWR;

import java.util.*;

public class Sistema_PWR {

	private HashMap<String, Restaurantes> restaurante = new HashMap<>(50);
	private HashMap<String, Clientes> cliente = new HashMap<>(100);
	
	public void adicionarRestaurante(String nome, String prato) {
		if(restaurante.size() < 50) {
			Restaurantes rs = new Restaurantes(nome, prato);
			restaurante.put(nome, rs);
		}
	}
	
	public void adicionarCliente(String nomeCliente, String email) {
		if(cliente.size() < 100) {
			Clientes cl = new Clientes(nomeCliente, email);
			cliente.put(email, cl);
		}
	}
	
	public void visitarRestaurante(String emailCliente, String nomeRestaurante) {
		restaurante.get(nomeRestaurante).setClienteVisitaram(cliente.get(emailCliente));
	}
	
	public HashSet<Clientes> listarClientesRestaurante(String nomeRestaurante) {
		return restaurante.get(nomeRestaurante).getClientesVisitaram();
	}
	
	public String votarPratoPreferido(String emailCliente, String nomeRestaurante) {
		if(restaurante.get(nomeRestaurante).getClientesVisitaram().contains(cliente.get(emailCliente))){
			cliente.get(emailCliente).setPratoPreferido(restaurante.get(nomeRestaurante).getPrato());
			restaurante.get(nomeRestaurante).adicionaQuantVotos();
			return "Voto registrado com sucesso!";
		}
		return "Voto não registrado";
	}
	
	public String melhorPrato() {
		int maior = 0;
		String maiorRs = "";
		for(String chave : restaurante.keySet()) {
			if(restaurante.get(chave).getQuantVotos() >= maior) {
				maior = restaurante.get(chave).getQuantVotos();
				maiorRs = chave;
			}
		}
		return "Melhor prato: " + restaurante.get(maiorRs).getPrato() + " Restaurante: " + restaurante.get(maiorRs).getNome();
	}
}






























