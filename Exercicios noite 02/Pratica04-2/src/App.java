import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double nota;
        double soma = 0;
        int quantidade= 0;
        String simounao;

            do {
                System.out.println("Digite a nota do aluno: (entre 0 a 10)");
                nota = scan.nextDouble();

                System.out.println("Deseja inserir outra nota (s/n): ");
                simounao = scan.next();


            }while (simounao.equalsIgnoreCase("s"));

            if (quantidade > 0 ){
                double media = soma/quantidade;
                System.out.println("A média de notas é:" + media);
            } else {
                System.out.println("Nenhuma nota valida.");


        
         }
    }
}


