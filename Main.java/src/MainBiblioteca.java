//package br.edu.fatecpg.projetojava.view;
//import br.edu.fatecpg.projetojava.model.Biblioteca;
 
public class MainBiblioteca {
	public static void main(String[] args) {
	Biblioteca biblioteca= new Biblioteca();
    
    Biblioteca livro = new Biblioteca();
    livro.nomeBiblioteca="Biblioteca Fatec";
    livro.endereco="Boqueirão - PG";
    livro.quantidadeDeLivro=3000;
    livro.horarioFuncionamento ="13h10 até 18h30";
    livro.bibliotecarioResponsavel="Carla";
    System.out.println("O nome da biblioteca é "+ livro.nomeBiblioteca);
    System.out.println("Endereço: "+ livro.endereco);
    System.out.println("Quantidade de Livros: "+ livro.quantidadeDeLivro);
    System.out.println("O nome da biblioteca é "+ livro.nomeBiblioteca);
    
   
    biblioteca.procurarLivro();
    
	}
 
}