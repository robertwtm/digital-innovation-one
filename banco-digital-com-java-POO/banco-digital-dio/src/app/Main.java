package app;

public class Main {

	public static void main(String[] args) {
		Cliente robert = new Cliente();
		robert.setNome("Robert Willian Tavares Mendes");
		
		Conta cc = new ContaCorrente(robert);
		Conta cp = new ContaPoupanca(robert);

		cc.depositar(2000);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		System.out.println("=======================================");

		System.out.println("=======================================");

		Cliente bruno = new Cliente();
		bruno.setNome("Bruno Willian Tavares Mendes");
		
		Conta cc1 = new ContaCorrente(bruno);
		Conta cp1 = new ContaPoupanca(bruno);

		cc1.depositar(900);
		cc1.transferir(500, cp1);
		
		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
	
		
	}

}
