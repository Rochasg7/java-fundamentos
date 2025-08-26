import java.util.Scanner;
public class Somadepositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        //Para o usuario atribuir valores inteiros ou um negativo para finalizar o programa
        System.out.print("Digite um número inteiro ou um negativo para finalizar: ");
        int num = sc.nextInt();

        //Para dar a condição de que se for maior ou igual a zero, continuar realizando a soma
        while (num >= 0) {
            soma += num; //Aqui entra a estrutura de repetição para somar o número anterior com o próximo a ser digitado

            System.out.print("Próximo número: ");
            num = sc.nextInt(); //Para ir atribuindo números até a condição while não ser atendida
        }

        System.out.println("A soma dos números positivos é: " + soma); //Para retornar o resultado final da soma
        sc.close();  
    }    
}
