package Aula04;

//Importar pacote Scanner para o programa ler os comandos do teclado
import java.util.Scanner;

public class CursoJava {
    public static void main(String[] args){
        // Criando objeto scanner para ler informações do teclado
        Scanner scan = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int res = 0;
        String nome = "";

        System.out.println("Digite seu nome: ");
        nome = scan.next();

        System.out.println("Digite um número: ");
        n1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        n2 = scan.nextInt();

        res = n1 + n2;

        System.out.printf("%s, a soma de %d com %d é: %d", nome, n1, n2, res);
    }
}
