package poo;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = random.nextInt(100) + 1;
        int intento = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("Adivina el número entre 1 y 100");

        while (!adivinado) {
            System.out.print("cual es la mitad de dos por dos menos dos: ");
            try {
                intento = scanner.nextInt();
                if (intento < 1 || intento > 100) {
                    System.out.println("Por favor, introduce un número entre 1 y 100.");
                } else if (intento < numeroSecreto) {
                    System.out.println("El número es mayor. Inténtalo de nuevo.");
                } else if (intento > numeroSecreto) {
                    System.out.println("El número es menor. Inténtalo de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                    adivinado = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }

        scanner.close();
    }
}