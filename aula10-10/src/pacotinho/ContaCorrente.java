package pacotinho;

public class ContaCorrente {
	public String nomeTitular;
	public Long cpf;
	public Long numeroConta;
	public Double saldo;

	public double sacar(Double valorSaque) {


		if (valorSaque > saldo) {
			System.out.println("Saldo insufuciente");
			
		} else {
			saldo = saldo - valorSaque;
		}

		return saldo;
	}

	public void depositar(Double valorDeposito) {

		saldo = saldo + valorDeposito;
	}
	
	public void mostrardados() {
		System.out.println("Titular: " + nomeTitular);
		System.out.println("Cpf: " + cpf);
		System.out.println("Conta : " + numeroConta);
		System.out.println("Saldo: " + saldo);
	}
}
