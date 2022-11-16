import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int largura, comprimento;
        double profundidadeI, profundidadeF, profundidadeT, litros;

        System.out.printf("informe o valor da largura: ");
        largura = ler.nextInt();

        System.out.printf("informe o valor do comprimento: ");
        comprimento = ler.nextInt();

        System.out.printf("informe o valor da profundidade inicial: ");
        profundidadeI = ler.nextDouble();

        System.out.printf("informe o valor da profundidade final: ");
        profundidadeF = ler.nextDouble();

        profundidadeT = (profundidadeF + profundidadeI) / 2;
        litros = largura * comprimento * profundidadeT * 1000;

        System.out.printf("As dimensões da piscina são %dm x %dm pela profundidade incial de %.2fm " +
                        "e profundidade final de %.1fm. \n" + "Essa piscina comporta %.1f litros de água.",
                largura, comprimento, profundidadeI, profundidadeF, litros);
    }
}