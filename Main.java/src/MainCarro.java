//package br.edu.fatecpg.projetojava.view;
//import br.edu.fatecpg.projetojava.model.Carro;

public class MainCarro {
 
	public static void main(String[] args) {
	System.out.println("Teste");
	Carro meuCarro = new Carro();
    System.out.println(meuCarro.ano);
    
    
    Carro meuCarroNovo = new Carro();
    meuCarro.marca="Renault";
    meuCarro.modelo="Logan";
    meuCarroNovo.ano=2015;
    meuCarroNovo.cor="Prata";
    meuCarroNovo.capacidade_tanque=50.5;
    System.out.println("O ano do meuCarroNovo é: "+meuCarroNovo.ano);
    
    meuCarro.acelerar();
    meuCarro.ligar();

    
	}
 
}
 