package br.com.fiap;

public class ContaCorrente extends Conta {

	  public ContaCorrente(int numero, double saldo) {
	    super(numero, TipoConta.CORRENTE, saldo);
	  }

	  @Override
	  public void sacar(double valor) throws SaldoInsuficienteException {
	    if (valor > saldo) {
	      throw new SaldoInsuficienteException("Saldo insuficiente para saque em Conta Corrente!");
	    }
	    saldo -= valor;
	  }
	}
