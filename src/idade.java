public class idade {
    public static void main(String[] args) {
        int nasc1 = 1997;
        int anoAtual = 2022;
        int idade = anoAtual - nasc1;

        System.out.println("O ano de nascimento informado é " + nasc1);
        System.out.printf("A pessoa tem ( ou vai completar) %d anos em %d", idade, anoAtual);
    }
}