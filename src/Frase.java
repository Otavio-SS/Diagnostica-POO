import java.util.Scanner;
public class Frase {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        int tamanho;
        System.out.println("Digite uma frase:");
        frase = ler.nextLine();
        tamanho = frase.length();
        System.out.println("O tamanho da frase é: " +tamanho);
    }
}
