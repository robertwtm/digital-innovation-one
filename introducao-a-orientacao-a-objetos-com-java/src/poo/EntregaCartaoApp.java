package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.cep = "000000";
			
		Cliente cliente = new Cliente();
		
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereco adicionado com sucesso");
		} catch (Exception e) {
			System.out.println("Houve um erro ado adicionar o endereco: "+ e.getMessage());
		}
		
	}
}
