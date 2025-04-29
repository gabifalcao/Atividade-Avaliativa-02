public class App {
    public static void main(String[] args) {

        int um = 0;
        int dois = 1;
        int tres = 0;

        while(tres < 10){
            System.out.println("Os 10 primneiros números da sequência são:");
           
            int calculo = um + dois;
            um = dois;
            dois = calculo;
           
            tres++;
    
        }
    
    
       
    }
}
