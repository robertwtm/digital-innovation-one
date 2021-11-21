package poo.model;

import java.util.*;

public class Cliente extends Pessoa {

	public String numCartao;
	private List<Endereco> enderecos;

	public void adicionaEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new NullPointerException("endereco nao pode ser nulo");
		}

		if (endereco.cep == null) {
			throw new NullPointerException("cep nao pode ser nulo");
		}

		getEnderecos().add(endereco);
	}

	private List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}

}
