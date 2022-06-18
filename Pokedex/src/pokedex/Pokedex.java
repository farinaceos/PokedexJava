package pokedex;

import java.util.*;

public class Pokedex {

    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Seja bem vindo à minha Pokedex!");
        
        //Variaveis dos Pokemon - Não estou usando Listas por que não foi passado aos alunos =(
                
        String nome1;
        int numero1;
        String tipo11;
        String golpe11;
        
        String nome2;
        int numero2;
        String tipo12;
        String golpe12;
        
        String nome3;
        int numero3;
        String tipo13;
        String golpe13;
        
        String nome4;
        int numero4;
        String tipo14;
        String golpe14;
        
        String nome5;
        int numero5;
        String tipo15;
        String golpe15;
        
        String nome6;
        int numero6;
        String tipo16;
        String golpe16;        
        
        //inicio do fluxo
            System.out.println("Seja bem vindo à minha Pokedex!");   
            
            //contador para facilitar o controle =)
            int i = 1;
            System.out.println("Vamos criar um novo Registro?!");
            System.out.println("POKEMON #"+i);
            System.out.println("Qual o nome do Pokemon?");
            nome1 = ler.nextLine();
            numero1 = i;
            System.out.println("Qual o tipo do Pokemon?");
            tipo11 = ler.nextLine();
            System.out.println("Qual o primeiro golpe do Pokemon?");
            golpe11 = ler.nextLine();
            
            Pokemon Poke1 = new Pokemon(nome1,numero1,tipo11,golpe11);
            i++;
            
            System.out.println("POKEMON #"+i);
            System.out.println("Qual o nome do Pokemon?");
            nome2 = ler.nextLine();
            numero2 = i;
            System.out.println("Qual o tipo do Pokemon?");
            tipo12 = ler.nextLine();
            System.out.println("Qual o primeiro golpe do Pokemon?");
            golpe12 = ler.nextLine();
            
            Pokemon Poke2 = new Pokemon(nome2,numero2,tipo12,golpe12);
            i++;
            
            System.out.println("POKEMON #"+i);
            System.out.println("Qual o nome do Pokemon?");
            nome3 = ler.nextLine();
            numero3 = i;
            System.out.println("Qual o tipo do Pokemon?");
            tipo13 = ler.nextLine();
            System.out.println("Qual o primeiro golpe do Pokemon?");
            golpe13 = ler.nextLine();
            
            Pokemon Poke3 = new Pokemon(nome3,numero3,tipo13,golpe13);
            i++;
            
            System.out.println("POKEMON #"+i);
            System.out.println("Qual o nome do Pokemon?");
            nome4 = ler.nextLine();
            numero4 = i;
            System.out.println("Qual o tipo do Pokemon?");
            tipo14 = ler.nextLine();
            System.out.println("Qual o primeiro golpe do Pokemon?");
            golpe14 = ler.nextLine();
            
            Pokemon Poke4 = new Pokemon(nome4,numero4,tipo14,golpe14);
            i++;
            
            System.out.println("POKEMON #"+i);
            System.out.println("Qual o nome do Pokemon?");
            nome5 = ler.nextLine();
            numero5 = i;
            System.out.println("Qual o tipo do Pokemon?");
            tipo15 = ler.nextLine();
            System.out.println("Qual o primeiro golpe do Pokemon?");
            golpe15 = ler.nextLine();
            
            Pokemon Poke5 = new Pokemon(nome5,numero5,tipo15,golpe15);
            i++;
            
            System.out.println("POKEMON #"+i);
            System.out.println("Qual o nome do Pokemon?");
            nome6 = ler.nextLine();
            numero6 = i;
            System.out.println("Qual o tipo do Pokemon?");
            tipo16 = ler.nextLine();
            System.out.println("Qual o primeiro golpe do Pokemon?");
            golpe16 = ler.nextLine();
            
            Pokemon Poke6 = new Pokemon(nome6,numero6,tipo16,golpe16);
            i++;
            
            System.out.println("SUA EQUIPE FOI DEFINIDA!");
            System.out.println("Nome:"+Poke1.getNome()+"#"+Poke1.getNumero());
            System.out.println("Nome:"+Poke2.getNome()+"#"+Poke2.getNumero());
            System.out.println("Nome:"+Poke3.getNome()+"#"+Poke3.getNumero());
            System.out.println("Nome:"+Poke4.getNome()+"#"+Poke4.getNumero());
            System.out.println("Nome:"+Poke5.getNome()+"#"+Poke5.getNumero());
            System.out.println("Nome:"+Poke6.getNome()+"#"+Poke6.getNumero());
            
            Poke1.ataca1();
            Poke1.ataca2();
            Poke2.ataca1();
            
            System.out.println("Boa Sorte na Liga Pokemon!");
    }
    
}
