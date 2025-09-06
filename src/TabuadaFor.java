import java.util.Scanner;
public class TabudaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber sua tabuada: ");
        int n = sc.nextInt();

        System.out.println("Tabuada do " + n + ":");
        for (int i=0; i<=10; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }
        sc.close();
    }
    
}
