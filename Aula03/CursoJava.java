package Aula03;

public class CursoJava {
    public static void main(String[] args){
        // IF
        int nota = 65;
        int media = 6;
        int faltas = 10;
        int maxFaltas = 5;
        String res;
        int pos = 1;

        if( nota >= 60){
            System.out.println("aprovado");
        }
        System.out.println("Fim do programa");

        // IF..ELSE - && (and) - || (or)
        if( media >= 7 && faltas <= maxFaltas){
            System.out.println("Aprovado!");
        }else if(media >= 5){
            System.out.println("Recupreção.");
        }else{
            System.out.println("Reprovado.");
        }
        System.out.println("Fim do programa");

        // ?
        // Operação ternária
        res = (media >= 7 ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);

        // SWITCH CASE
        switch(pos){
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
            case 4: case 5: case 6:
                System.out.println("Premio de participação");
                break;
            default:
                System.out.println("Não ganha prêmio");
                break;
        }
    }
}
