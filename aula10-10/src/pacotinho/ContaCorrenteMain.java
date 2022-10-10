package pacotinho;

import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {
			ContaCorrente objeto = new ContaCorrente();
			
			objeto.nomeTitular = "Andrieli";
			objeto.cpf = 12040756973l;
			objeto.numeroConta = 765503l;
			objeto.saldo = 50000.00;
			
			objeto.mostrardados();
			
			objeto.sacar(500.0);
			objeto.depositar(680.0);

			objeto.mostrardados();
			
	}

}
