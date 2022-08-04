
public class Main {

	public static void main(String[] args) {
		
		Cliente raioni = new Cliente();
		raioni.setNome("Raioni");
		
		Conta cc = new ContaCorrente(raioni);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(raioni);
		
		cc.transferir(15, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
