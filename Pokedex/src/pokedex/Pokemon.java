
package pokedex;

public class Pokemon {
    
    private String nome;
    private int numero;
    private String tipo1;
    private String tipo2;
    private String golpe1;
    private String golpe2;

    Pokemon(String nome, int numero, String tipo1, String golpe1){
        this.nome = nome;
        this.numero = numero;
        this.tipo1 = tipo1;
        this.tipo2 = "";
        this.golpe1 = golpe1;
        this.golpe2 = "";
        
        System.out.println("Muito bom treinador! "+ nome + " #"+ numero + " foi registrado com sucesso na Pokedex!");   
    }
    
    Pokemon(String nome, int numero, String tipo1,String tipo2, String golpe1, String golpe2){
        this.nome = nome;
        this.numero = numero;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.golpe1 = golpe1;
        this.golpe2 = golpe2;
        
        System.out.println("Muito bom treinador! "+ nome + " #"+ numero + " foi registrado com sucesso na Pokedex!");   
    }
    
    
    
 public String getNome(){
     return this.nome;
 }   
           
 public int getNumero(){
     return this.numero;
 }
 
 public String getTipo1(){
     return this.tipo1;
 }
 
 public String getTipo2(){
     return this.tipo2;
 }
 
 public void setTipo2(String tipo2){
     this.tipo2 = tipo2;
     
     System.out.println("Parabéns! O tipo 2 do Pokemon" + this.nome + " #" + this.numero + " é "+ this.tipo2);
     
 }
 
 public String getGolpe1(){
     return this.golpe1;
     
 }
 
 public String getGolpe2(){
     return this.golpe2;
     
 }
 public void setGolpe2(String golpe2){
     this.golpe2 = golpe2;
     
     System.out.println("Parabéns! O Golpe 2 do Pokemon" + this.nome + " #" + this.numero + " é "+ this.golpe2);
     
 }
 
 public void ataca1(){
     System.out.println("O Pokemon "+ this.nome + " usou "+this.golpe1 + "!");
 }
 
 public void ataca2(){
     if(this.golpe2!=""){
     System.out.println("O Pokemon "+ this.nome + " usou "+this.golpe1 + "!");}
     else{
         System.out.println(this.nome + "Não possui um Golpe 2!!!");
     }
     
 }
 
}


