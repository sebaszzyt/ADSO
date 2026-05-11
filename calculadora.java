import java.util.Scanner;

class Calculadora {

    double numero1;
    double numero2;

    // Método suma
    public double sumar() {
        return numero1 + numero2;
    }

    // Método resta
    public double restar() {
        return numero1 - numero2;
    }

    // Método multiplicación
    public double multiplicar() {
        return numero1 * numero2;
    }

    // Método división
    public double dividir() {

        if (numero2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }

        return numero1 / numero2;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("=== CALCULADORA ===");

        // Pedir números
        System.out.print("Digite el primer numero: ");
        calc.numero1 = entrada.nextDouble();

        System.out.print("Digite el segundo numero: ");
        calc.numero2 = entrada.nextDouble();

        // Menú
        System.out.println("\n1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Seleccione una opcion: ");
        int opcion = entrada.nextInt();

        System.out.println("------------------");

        switch(opcion) {

            case 1:
                System.out.println("Resultado: " + calc.sumar());
                break;

            case 2:
                System.out.println("Resultado: " + calc.restar());
                break;

            case 3:
                System.out.println("Resultado: " + calc.multiplicar());
                break;

            case 4:
                System.out.println("Resultado: " + calc.dividir());
                break;

            default:
                System.out.println("Opcion no valida");
        }

        entrada.close();
    }
}