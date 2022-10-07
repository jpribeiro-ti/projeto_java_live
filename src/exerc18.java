import java.util.Scanner;

public class exerc18 {
    // Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet
    // (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
    public static void main (String[] args) {

        double tamanhoArquivo;
        double velocidadeLink;
        double tempoEmSegundos;
        double tempoEmMinutos;

        // 1) Ação do usuário: informar o tamanho do aquivo e a velocidade da conexão da internet
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho do Arquivo: ");
        tamanhoArquivo = teclado.nextDouble();
        System.out.println("Digite a velocidade de conexão: ");
        velocidadeLink = teclado.nextDouble();
        teclado.close();

        // 2) Tarefa do computador

        // 2.1) Converter de MB para mb
        tamanhoArquivo = tamanhoArquivo * 8;

        // 2.2) Regra de 3 para descobrir o tempo em segundos
        tempoEmSegundos = tamanhoArquivo / velocidadeLink;

        // 2.3) Converter de segundos para minutos
        tempoEmMinutos = tempoEmSegundos / 60;

        // 3) Resposta do computador: o tempo aproximado em minutos
        System.out.println("O tempo em minutos eh: " + tempoEmMinutos);

    }
    
}
