// Tudo em java é feito com classes, é importante o nome da classe tem que ter o mesmo nome do arquivo.

public class AloMundo{
    // Precisa-se criar métodos para o funcionamento do programa, o primeiro tem que ser o main (o principal)

    // public - Este método é de acesso público
    // static - Este método pode ser acessado sem instanciar um objeto dessa mesma classe
    // void - Indica o retorno do método, o tipo de dados que o método retorna, no caso do void, não retorna nada (exemplo: int, retorna um número inteiro)
    // main - nome do método e precisa de parâmetro(s), neste caso, um array de strings chamado "args"

    public static void main(String[] args){
        // Para imprimir no console
        System.out.print("Alo Mundo!");
    }

    // Para compilar - javac NomeDoArquivo.java
    // Para executar - java NomeDoArquivo
}