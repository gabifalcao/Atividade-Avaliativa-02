import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random random = new Random();

        int numeroaleatorio = random.nextInt(20) +1;
        int adivinhar;
        int tentativas = 0;

        System.out.println("Digite um número entre 1-20 para adivinha-lo: ");

            do{
                System.out.println("Digite o palpite:");
                adivinhar = scan.nextInt();
                tentativas++;

                if (adivinhar < numeroaleatorio){
                    System.out.println("O número é maior.");
                } else if (adivinhar > numeroaleatorio) {
                    System.out.println("O número é menor.");
                } else {
                    System.out.println("Você acertou o número! Ele é " + numeroaleatorio);
                    System.out.println("O número de tentativas foram: " + tentativas);
                }

            }while (adivinhar != numeroaleatorio);

    }
}
