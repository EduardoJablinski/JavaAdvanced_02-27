package br.com.fiap;

public class ContaPoupanca extends Conta {

	  public ContaPoupanca(int numero, double saldo) {
	    super(numero, TipoConta.POUPANCA, saldo);
	  }

	  @Override
	  public void sacar(double valor) throws SaldoInsuficienteException {
	    if (valor > saldo) {
	      throw new SaldoInsuficienteException("Saldo insuficiente para saque em Conta Poupança!");
	    }
	    saldo -= valor;
	  }
	}

