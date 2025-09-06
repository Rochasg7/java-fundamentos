import java.util.Scanner;
public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Para pedir ao úsuario o número que ele deseja saber a contagem regressiva
        System.out.print("Digite um número para a contagem regressiva: ");
        int num = sc.nextInt();

        //Para dar a condição de que se o número for maior que 0, fazer a contagem a partir dele
        while (num > 0) {
            System.out.println(num);
            num--;
        }
        
        System.out.println("LANÇAR!");
        sc.close();
    }
}
