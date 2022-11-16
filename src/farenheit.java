public class farenheit {
    public static void main(String[] args) {
        double celsius = 32.5;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("A temperatura informada é %.1f.\nO valor convertido é %.1f.", celsius, fahrenheit);
    }
}
