import java.util.Scanner;
public class App {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        int numero;
        do {
            System.out.println("Digite um número de um a cem: ");
            numero = scan.nextInt();

        } while (numero < 1 || numero > 100);

        System.out.println("O número digitado é válido, ele é o número: " + numero);
       
    }
}
