// Especificar caminho do arquivo
package Aula02;

public class CursoJava {
    public static void main(String[] args){
        // Variáveis

        // para criar, tipo nome - int num
        int n1 = 3, n2 = 4, n3 = 5;
        int res = n1 + n2 + n3;
        int num = 10;
        String nome = "Juan";

        // Atualizar valor
        num = 50;


        // Impressão de dados

        // print() não executa quebra de linha, apenas com \n, padrão
        System.out.print("Não executa quebra de linha\n");

        // println() executa quebra de linha no final
        System.out.println("Quebra de linha no final");

        // printf() string com formatação
        // %s - string
        // %d - int
        // %f - float
        // %n - quebra de linha (igual o \n)
        System.out.printf("%s - %d%n", "String", 2025);

        // Também pode misturar dentro do format
        System.out.printf("Em %d eu tenho %d anos.%n", 2025, 20);

        System.out.printf("O valor da variável num é: %d%n nome: %s", num, nome);

        System.out.printf("O resultado da soma é: %d", res);
    }
}
