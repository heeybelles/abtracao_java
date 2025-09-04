//package br.edu.fatecpg.projetojava.model;
 
public class Biblioteca {
public String nomeBiblioteca;
public String endereco;
public int quantidadeDeLivro;
public String horarioFuncionamento;
public String bibliotecarioResponsavel;
public boolean verificar=false;
 
public void procurarLivro() {
	if(verificar) {
	System.out.println("Procurando livro...");
	this.gerenciarLivro();
	}else {
		System.out.println("Livro encontrado!");
		verificar=true;
		this.alugarLivro();
	}
}
 
    public void alugarLivro(){
    	if(verificar) {
    		System.out.println("Alugar livro!");
    		this.procurarLivro();
    		}else {
    			System.out.println("Livro alugado!");
    			
    			
    		}
      }
    
    public void gerenciarLivro() {
    if(verificar) {
		System.out.println("Selecionar livro!");
		}else {
			System.out.println("Livro já selecionado!");
			verificar=true;
		}
    
    
    }
}