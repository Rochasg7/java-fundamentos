import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Para o usuario atribuir  sua nota
        System.out.print("Digite uma nota entre 0 a 10: ");
        int n = sc.nextInt();
        
        //Para dar a condição de que se a nota for menor que zero ou maior que 10, retornar invalida
        while (n < 0 || n > 10) {
            System.out.println("Nota inválida, digite novamente!");
            
            n = sc.nextInt(); //Serve para atribuir um novo valor a variavel, quando a condição for atendida
        }
        //Retorna caso a estrutura while não tenha sido atendida
    System.out.println("Nota válida!");
    sc.close();        
    }    
}
