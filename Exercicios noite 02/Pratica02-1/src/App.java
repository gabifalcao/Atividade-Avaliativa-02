import java.util.Scanner;
public class App {
     public static void main(String[] args)  {
    
        
        int soma = 0;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

            while (numero >= 0) {
                soma += numero;

         System.out.println("Digite um número");
         numero = scan.nextInt();
            }
         System.out.println("Soma= " + soma);

         

           

    

    
       
    }
}
