package br.com.fiap;

public class ContaInvestimento extends Conta {

	  public ContaInvestimento(int numero, double saldo) {
	    super(numero, TipoConta.INVESTIMENTO, saldo);
	  }

	  @Override
	  public void sacar(double valor) throws SaldoInsuficienteException {
	    if (valor > saldo) {
	      throw new SaldoInsuficienteException("Saldo insuficiente para saque em Conta Investimento!");
	    }
	    saldo -= valor;
	  }
	}
