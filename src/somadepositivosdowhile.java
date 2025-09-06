import java.util.Scanner;
public class somadepositivosdowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num;

        //Bloco de códigos a ser executado, pedindo ao usuario um numero inteiro para realizar somas ou um negativo para finalizar
        do {
            System.out.print("Digite numeros inteiros para realizar a soma (negativo para sair): ");
            num = sc.nextInt(); 

            if (num >= 0) {
                soma += num;
            }

        } while (num >= 0);

            System.out.println("A soma dos numeros inteiros é: " + soma);
            sc.close();
    }
    
}
