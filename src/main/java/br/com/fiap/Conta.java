package br.com.fiap;

public abstract class Conta {

	  private int numero;
	  private TipoConta tipo;
	  protected double saldo;

	  public Conta(int numero, TipoConta tipo, double saldo) {
	    this.numero = numero;
	    this.tipo = tipo;
	    this.saldo = saldo;
	  }

	  public int getNumero() {
	    return numero;
	  }

	  public TipoConta getTipo() {
	    return tipo;
	  }

	  public double getSaldo() {
	    return saldo;
	  }

	  public void depositar(double valor) {
	    saldo += valor;
	  }

	  public abstract void sacar(double valor) throws SaldoInsuficienteException;
	}
