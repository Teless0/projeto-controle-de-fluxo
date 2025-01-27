import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite o pimeiro parâmetro");
       int parametroUm = scanner.nextInt();

       System.out.println("Digete o segundo parâmetro");
       int parametroDois = scanner.nextInt();

       try {
        contar(parametroUm, parametroDois);
       } catch (ParametrosInvalidosException e) {
        System.out.println("O segundo parametro deve ser maior que o primeiro");
       }
       scanner.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for(int i = parametroUm; i <= parametroDois; i++){
            System.out.println("Imprimindo numero: " + i);
        }

    }

}
