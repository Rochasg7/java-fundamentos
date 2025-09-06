import java.util.Random;
import java.util.Scanner;
public class jogoadvinhadowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        //Declaração de variaveis e para um numero aleatorio de 1 a 100
        int numeroSecreto = gerador.nextInt(100) + 1;
        int num;
        int tentativas = 0;

        System.out.println("Tente advinhar o numero secreto de 1 a 100!!");

        //Definir dicas para o numero secreto + o incremento a cada tentativa
        do {
            System.out.print("Digite o seu palpite: ");
            num = sc.nextInt();
            tentativas++;

            if (num < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!!");
            } 
            else if (num > numeroSecreto) {
                System.out.println("O numero secreto é MENOR!!!!");                
            }
            else {
                System.out.println("Parabens! Você descobriu o número secreto!");
            }        
            //Condição para definir quando continuar a função "do"
        }  while (num != numeroSecreto);
            
            System.out.println("Você descobriu em " + tentativas + " tentativas.");
            sc.close();
    }
}
