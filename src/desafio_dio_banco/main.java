package desafio_dio_banco;

public class main {
	
	public static void main(String[] args) {
		
		Cliente Flaviano = new Cliente();
		Flaviano.setNome("Flaviano");
		
		IConta Cc = new ContaCorrente(Flaviano);
		IConta Poupanca = new ContaPoupanca(Flaviano);
		
		Cc.depositar(100);		
		Cc.transferir(75, Poupanca);
		
		Cc.imprimirExtrato();
		Poupanca.imprimirExtrato();
	}

}
