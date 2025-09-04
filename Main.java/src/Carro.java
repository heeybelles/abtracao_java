 //package br.edu.fatecpg.projetojava.model;
public class Carro {
public String marca;
public String modelo;
public String cor;
public double capacidade_tanque;
public int ano;
public boolean ligado=false;
 
   public void ligar() {
	   if(ligado) { //Diferente de ligado
		System.out.println("Carro já está Ligado!");
	   }else {
	    System.out.println("Carro Ligado!");
	    ligado=true;
	   }
    }
 
    public void acelerar(){
    if(ligado) {
     System.out.println("Carro Andamento...");
    }else {
       System.out.println("Carro Desligado!");
       this.ligar();//Chamando método dentro de um método
       this.acelerar(); //This referencia a si mesmo, ou seja a própria classe
    }
}

    public void frear(){
        
        if(ligado) {
        System.out.println("Carro Parando...");
        }else {
            System.out.println("Carro Desligado!");
            this.ligar();
    
        }
    }
    
    public void buzinar() {
        if(!ligado) {
        	System.out.println("Carro Desligado!");
        	this.ligar();
        }   
    	System.out.println("Biiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    public void desligar() {
    	if(ligado) {
    	System.out.println("Carro Desligado!");
    	ligado = false;
    	}else {
    		System.out.println("O carro já está desligado!");
    	}
    }   
}