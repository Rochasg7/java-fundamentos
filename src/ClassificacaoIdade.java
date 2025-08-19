public class ClassificacaoIdade {
    public static void main(String[] args) {
        int i = 18;

        //Definir em qual fase está
        if (i < 12) {
            System.out.println("Você é uma criança!");
        }
        else if (i <= 17) {
            System.out.println("Você é um adolescente!");
        }
        else {
            System.out.println("Você é um adulto!");
        }

        //Verificar possibilidade de voto
        if (i < 16) {
            System.out.println("Você ainda não pode votar!");
        }
        else if (i <= 17) {
            System.out.println("Você pode votar, mas não é obrigatório!");
        }
        else {
            System.out.println("Seu voto é obrigatório!");
        }
    }
}