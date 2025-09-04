//package br.edu.fatecpg.projetojava.model;
 
public class Shopping {
public String nomeShopping;
public String endereco;
public String listaProduto;
public String estacionamento;
public String horarioFuncionamento;
public boolean compra=true;
 
public void acessarShopping() {
System.out.println("Shopping Aberto!");
this.visualizarLoja();
  }
 
  public void visualizarLoja() {
  System.out.println("Loja visualizada!");
  }
 
   public void comprarProduto() {
   System.out.println("Comprando Produto...");
   if(compra) {
   System.out.println("Compra Realizada Com Sucesso!");
  } else {
   System.out.println("Compra não realizada!");
   this.visualizarLoja();
   }
  }
 }
 