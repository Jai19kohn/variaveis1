public class cinema {
    public static void main(String[] args) {
        int fileira = 15;
        int cadeiras = 10;
        int capacidade = fileira * cadeiras;
        int porcentagem = 10; //10 por cento
        int reservado = capacidade / porcentagem;

        System.out.printf("A sala de cinema tem %d fileiras e %d cadeiras em cada.\n", fileira, cadeiras);
        System.out.printf("A capacidade dessa sala é de %d pessoas. Sendo que %d desses lugares são reservados para PCDs.", capacidade, reservado);
//        System.out.printf("A sala de cinema tem %d fileiras e %d cadeiras em cada.\n A capacidade dessa sala é de %d pessoas.", fileira, cadeiras, capacidade);
    }
}
