import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int escolha;

            do{
                System.out.println("Menu das opções:");
                System.out.println("Primeira: Adicionar, digite 1");
                System.out.println("Segunda: Remover, digite 2");
                System.out.println("Terceira: Sair, digite 3");
                System.out.print("Escolha uma delas: ");

                escolha = scan.nextInt ();

                if (escolha ==1){
                    System.out.println("Primeira ação executada.");
                } else if (escolha == 2){
                    System.out.println("Segunda ação executada.");
                } else if (escolha == 3){
                    System.out.println("Saindo do programa.");
                } else {
                    System.out.println("Essa escolha não existe.");
                }

            } while ( escolha != 3);

    
       
    }
}
