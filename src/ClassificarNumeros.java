public class ClassificarNumeros {
    public static void main(String[] args) {
        int a = 22;

        //Para saber se o número é positivo, negativo ou nulo.
        if (a > 0) {
            System.out.println("Este número é positivo!");
        }
        else if (a < 0) {
            System.out.println("Este número é negativo!");
        }
        else {
            System.out.println("Este é um número nulo!");
        }

        //Para saber se o número é par ou impar.
        if (a % 2 == 0){
            System.out.println("Este número é par!");
        }
        else {
            System.out.println("Este número é impar!");
        }
    }
}