
package com.mycompany.cadeirao;

import java.util.Scanner;


 // @author gabriel
 
public class Cadeirao1 {
    String comoé;
    String cor;
    String marca;
    boolean empé;
    
    void estado(){
        System.out.println("informações da cadeira\n "  );
        System.out.println("Cor da cadeira: " + this.cor);
        System.out.println("Marca da cadeira: "  + this.marca);
        System.out.println("Como a cadeira é, ex gamer, escritorio, cozinha, etc...: "  + this.comoé);
}
   void sentado(){
       if(this.empé== true){
           System.out.println("a cadeira está normal, eu posso me sentar\n");     
      }else{
          System.out.println("a cadeira está quebrada, não posso me sentar\n");
      }
     
           } 

    boolean perguntarSentado() {
        Scanner tecladoBoolean = new Scanner(System.in);
        System.out.println("esta cadeira está normal? (SIM/NÃO)");
        String resposta = tecladoBoolean.nextLine();
        
        if(resposta.equals("sim")){
            return true;
        }else if(resposta.equals("não") || resposta.equals("nao")){
            return false;
        }else{
            System.out.println("resposta inválida, por favor digite 'sim'ou 'não'");
            return perguntarSentado();
  
    }
    
}}

   

   