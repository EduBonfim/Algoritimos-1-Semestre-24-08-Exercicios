//Eduardo Aparecido Bonfim Domingues
//Curso: TADS - TURMA MANHÃ
//CPF 40781700809

import java.util.Scanner;

public class Exercicio_1{
    public static void main(String[] args){
    
    Scanner Dados = new Scanner (System.in);
    
    System.out.println("Digite seu nome completo: ");
    String nome = Dados.nextLine();
    
    System.out.println("Digite seu CPF: ");
    String CPF =  Dados.nextLine();
    
    System.out.println("Digite o seu Curso: ");
    String Curso = Dados.nextLine();
    
        System.out.println("Nome Completo: "+ nome);
        System.out.println("CPF: "+ CPF);
        System.out.println("Curso: "+ Curso);
    
     Dados.close();
    }
}
