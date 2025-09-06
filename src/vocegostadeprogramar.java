import java.util.Scanner;
public class vocegostadeprogramar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta;

        do {
            System.out.println("Você gosta de programar?");
            resposta = sc.nextLine();

            if (!resposta.equalsIgnoreCase("sim")) {  
                System.out.println("Você ainda não gosta de programar, tente de novo!");
            }
            else { 
                System.out.println("Párabens!");
            }
        } while (!resposta.equalsIgnoreCase("sim"));

    sc.close();
    }
}
