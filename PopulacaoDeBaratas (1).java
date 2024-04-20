package atividade2;

public class PopulacaoDeBaratas {
   private long populacao;
  
   public PopulacaoDeBaratas(long populacao){
     this.populacao = populacao;
   }
   public void esperarTempo(){
     this.populacao *= 2;
   }
   public void pulveriza(){
     this.populacao -= this.populacao * 0.25;
   }
   public long getpopulacao() {
     return this.populacao;
 }
  
   public String ToString(){
     return "populacao"+ getpopulacao();
   }
   }
 
 
 
 