package Aula04;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, soma = 0;
        String nome = "", resultado = "";

        System.out.println("Digite o nome do aluno: ");
        nome = scan.nextLine();
        System.out.printf("Digite a primeira nota do(a) aluno(a) %s:%n", nome);
        nota1 = scan.nextInt();
        System.out.printf("Digite a segunda nota do(a) aluno(a) %s:%n", nome);
        nota2 = scan.nextInt();
        System.out.printf("Digite a terceira nota do(a) aluno(a) %s:%n", nome);
        nota3 = scan.nextInt();
        System.out.printf("Digite a quarta nota do(a) aluno(a) %s:%n", nome);
        nota4 = scan.nextInt();

        soma = nota1 + nota2 + nota3 + nota4;

        if(soma >= 24){
            resultado = "Aprovado!";
            System.out.printf("A situação do(a) aluno(a) é: %s", resultado);
        } else if(soma >= 20 ){
            resultado = "Recuperação";
            System.out.printf("A situação do(a) aluno(a) é: %s", resultado);
        } else{
            resultado = "Reprovado";
            System.out.printf("A situação do(a) aluno(a) é: %s", resultado);
        }
    }
}
