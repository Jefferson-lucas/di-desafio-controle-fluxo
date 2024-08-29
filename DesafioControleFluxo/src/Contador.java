import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;

        System.out.println("Seja bem vindo ao desafio de código da dio sobre controle de fluxo");

        System.out.println("Informe o primeiro número");
        primeiroNumero = scanner.nextInt();

        System.out.println("Informe o segundo número");
        segundoNumero = scanner.nextInt();

        try{
            contar(primeiroNumero,segundoNumero);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        scanner.close();

    }

    static void contar (int parametrUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametrUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametrUm;

            for (int i=1; i <= contagem; i++){
                System.out.println("imprimindo o número " + i);
            }
        }
    }
}