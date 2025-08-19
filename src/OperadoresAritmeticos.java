public class OperadoresAritmeticos {
    public static void main(String[] args) {
        float a = 22;
        float b = 17;

        System.out.println("Soma: " +  (a + b));
        System.out.println("Subtração: " +  (a - b));
        System.out.println("Multiplicação: " +  (a * b));
        System.out.println("Divisão: " +  (a / b));
        System.out.println("Módulo: " +  (a % b));

        //Para saber o Incremento e o decremento das variaveis
        a++;
        System.out.println("Incremento de a: " +  (a));

        b--;
        System.out.println("Decremento de b: " +  (b));
    }
}