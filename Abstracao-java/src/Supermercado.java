//package br.edu.fatecpg.projetojava.model;
 
public class Supermercado {
public String nomeSupermercado;
public String endereco;
public String listaProduto;
public String nomeFuncionanrio;
public int cdcliente;
public boolean compra=true;
 
  public void comprarProduto() {
	  System.out.println("Produto Comprado!");
	  this.efetuarPagamento();
  }
  
  public void efetuarPagamento(){
	 if(compra) {
	 System.out.println("Pagamento efetuado!");
	 this.emitirNota();
	 }else {
	  System.out.println("Pagamento não efetuado!");
	  this.comprarProduto();
	 }
  }
  
  public void emitirNota() {
	 System.out.println("Emitir Nota");
	 if(compra) {
	  System.out.println("Compra Realizada Com Sucesso!");
	 }else {
	  System.out.println("Compra Não Realizada!");
	  this.comprarProduto();
	 }
  }
}