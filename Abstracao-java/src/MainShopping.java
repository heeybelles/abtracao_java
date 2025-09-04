//package br.edu.fatecpg.projetojava.view;
//import br.edu.fatecpg.projetojava.model.Shopping;
 
public class MainShopping {
	public static void main(String[] args) {
	Shopping shopping = new Shopping();
    
    Shopping departamento = new Shopping();
    departamento.nomeShopping="Litoral Plaza";
    departamento.endereco="Boqueirão - PG";
    departamento.listaProduto="Roupas, Calçados,Comidas,etc...";
    departamento.estacionamento="Aberto!";
    departamento.horarioFuncionamento ="13h10 até 18h30";
    System.out.println("Nome do Shopping "+ departamento.nomeShopping);
    System.out.println("Endereço: "+ departamento.endereco);
    System.out.println("Lista de Produtos: "+ departamento.listaProduto);
    System.out.println("Estacionamento: "+ departamento.estacionamento);
    System.out.println("Horário de Funcionamento: "+ departamento.horarioFuncionamento);
    
   
    shopping.visualizarLoja();
    
	}
 
}
 