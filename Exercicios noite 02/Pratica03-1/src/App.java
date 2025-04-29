import java.util.Scanner;
public class App {
        public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String senha1 = "1111";
        String senha2;

         System.out.println("Digite a senha: ");
         senha2 = scan.next();

            while (!senha2. equals(senha1)) {
                System.out.println("Senha incorreta, tente novamente.");
                System.out.println("Digite a senha: ");
                senha2 = scan.next();

            
            }

            System.out.println("Acesso concedido.");



    }
}
