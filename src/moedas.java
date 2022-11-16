public class moedas {
    public static void main(String[] args) {
        int real = 1;
        double euro = 0.18;
        double libra = 0.16;
        double dinar = 0.071;
        double liraTueca = 3.47;
        double francoGuineano = 1636.01;
        int valor = 50;

        double euros = valor * euro;
        double libras = valor * libra;
        double dinares = valor * dinar;
        double liras = valor * liraTueca;
        double francos = valor * francoGuineano;

        System.out.println("O valor recebido em reais é de R$" + valor);
        System.out.printf("- %.2f euros; \n- %.2f libras; \n- %.2f dinar; \n- %.2f liras turcas; \n- %.2f franco guineano.",
                euros, libras, dinares, liras, francos);
    }
}
