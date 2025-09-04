//package br.edu.fatecpg.projetojava.view;
//import br.edu.fatecpg.projetojava.model.Supermercado;
 
public class MainSupermercado{
	public static void main(String[] args) {
    Supermercado supermercado = new Supermercado();
    
    Supermercado compra = new Supermercado();
    compra.nomeSupermercado ="Supermercado Dia";
    compra.endereco="Boqueirão - PG";
    compra.listaProduto="Alimentos, Higiene, Roupas,etc... ";
    compra.nomeFuncionanrio ="Kátia Silva";
    compra.cdcliente=12345;
    System.out.println("Nome do Supermercado"+ compra.nomeSupermercado);
    System.out.println("Endereço: "+ compra.endereco);
    System.out.println("Lista de Produtos: "+ compra.listaProduto);
    System.out.println("Funcionário Responsável "+ compra.nomeFuncionanrio);
    System.out.println("Código do Cliente: "+ compra.cdcliente);
   
    supermercado.comprarProduto();
    
	}
 
}