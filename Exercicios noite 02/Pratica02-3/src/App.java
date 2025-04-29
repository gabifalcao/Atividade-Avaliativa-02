import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scan.nextInt();
        int fatorial = 1;

    
        for (int i = 1; i <= numero; ++i) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        
    
    }
}
