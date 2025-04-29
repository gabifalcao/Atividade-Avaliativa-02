public class App {
    public static void main(String[] args) {
        int[] numeros = {5,8,2,10,3,7,6,1,9,4};
        int soma = 0;

            for (int i = 0; i < numeros.length; i++) {
                soma += numeros[i];
            }
        System.out.println("A soma de todos os elementos do vetor é: " + soma);
    }
}
