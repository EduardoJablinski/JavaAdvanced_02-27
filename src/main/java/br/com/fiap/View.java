package br.com.fiap;
import java.util.ArrayList;
import java.util.List;


public class View {

	  public static void main(String[] args) {

	    ContaCorrente cc = new ContaCorrente(1234, 1000);
	    cc.depositar(1500);

	    ContaPoupanca cp = new ContaPoupanca(5678, 5200);
	    cp.depositar(500);
	    
	    ContaInvestimento ci = new ContaInvestimento(5678, 1000);
	    ci.depositar(800);

	    try {
	      cc.sacar(400);
	    } catch (SaldoInsuficienteException e) {
	      System.out.println(e.getMessage());
	    }

	    List<Conta> contas = new ArrayList<Conta>();
	    contas.add(cc);
	    contas.add(cp);
	    contas.add(ci);

	    for (Conta conta : contas) {
	      System.out.println("O saldo da CONTA " + conta.getTipo() + " de número " + conta.getNumero() + " é " + conta.getSaldo());
	    }
	  }
	}
