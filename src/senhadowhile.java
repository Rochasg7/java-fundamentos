import java.util.Scanner;
public class senhadowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String confirmaSenha;
        
        System.out.println("Crie sua senha: ");
        String senha = sc.nextLine();
        
        do {
            System.out.println("Confirme sua senha: ");
            confirmaSenha = sc.nextLine();

            if (!senha.equals(confirmaSenha)) {
                System.out.println("As senhas não se correspondem, digite novamente!");
            }
            else {
                System.out.println("Senha criada com sucesso!");
            }
        } while (!senha.equals(confirmaSenha));

        System.out.println("Sua senha criada foi: " + senha);

        sc.close();
    }
}
