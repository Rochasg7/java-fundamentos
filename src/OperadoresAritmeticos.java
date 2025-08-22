import java.util.Scanner;
public class OperadoresAritmeticos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Operadores aritmeticos: ");
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println();
        System.out.println("Operadores com esses números: ");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        
        //Para saber o incremento e decremento dos dois números
        System.out.println();
        System.out.println("Incremento e decremento de A e B: ");
        a++;
        System.out.println("Incremento de a: " + (a));
        a--;
        a--;
        System.out.println("decremento de a: " + (a));

        b++;
        System.out.println("Incremento de b: " + (b));
        b--;
        b--;
        System.out.println("decremento de b: " + (b));
        
        //Para saber a média dos números x, y, z
        System.out.println();
        System.out.println("Descubra a média de três números: ");
        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int z = sc.nextInt();

        System.out.print("A média dos números acima é: " + ((x+y+z)/3));

        sc.close();
    }
}
